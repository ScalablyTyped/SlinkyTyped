package typingsSlinky.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpTrait extends js.Object {
  var method: java.lang.String = js.native
  var requestUri: java.lang.String = js.native
}

object HttpTrait {
  @scala.inline
  def apply(method: java.lang.String, requestUri: java.lang.String): HttpTrait = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], requestUri = requestUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTrait]
  }
  @scala.inline
  implicit class HttpTraitOps[Self <: HttpTrait] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestUri(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

