package typingsSlinky.oauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccessTokenHttpMethod extends js.Object {
  var accessTokenHttpMethod: String = js.native
  var followRedirects: Boolean = js.native
  var requestTokenHttpMethod: String = js.native
}

object AnonAccessTokenHttpMethod {
  @scala.inline
  def apply(accessTokenHttpMethod: String, followRedirects: Boolean, requestTokenHttpMethod: String): AnonAccessTokenHttpMethod = {
    val __obj = js.Dynamic.literal(accessTokenHttpMethod = accessTokenHttpMethod.asInstanceOf[js.Any], followRedirects = followRedirects.asInstanceOf[js.Any], requestTokenHttpMethod = requestTokenHttpMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessTokenHttpMethod]
  }
  @scala.inline
  implicit class AnonAccessTokenHttpMethodOps[Self <: AnonAccessTokenHttpMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessTokenHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenHttpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowRedirects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTokenHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTokenHttpMethod")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

