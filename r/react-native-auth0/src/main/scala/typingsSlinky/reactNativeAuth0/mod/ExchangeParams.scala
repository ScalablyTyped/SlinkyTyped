package typingsSlinky.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExchangeParams extends js.Object {
  var code: String = js.native
  var redirectUri: String = js.native
  var verifier: String = js.native
}

object ExchangeParams {
  @scala.inline
  def apply(code: String, redirectUri: String, verifier: String): ExchangeParams = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], verifier = verifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeParams]
  }
  @scala.inline
  implicit class ExchangeParamsOps[Self <: ExchangeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

