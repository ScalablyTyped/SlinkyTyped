package typingsSlinky.oauth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessTokenHttpMethod extends js.Object {
  var accessTokenHttpMethod: String = js.native
  var followRedirects: Boolean = js.native
  var requestTokenHttpMethod: String = js.native
}

object AccessTokenHttpMethod {
  @scala.inline
  def apply(accessTokenHttpMethod: String, followRedirects: Boolean, requestTokenHttpMethod: String): AccessTokenHttpMethod = {
    val __obj = js.Dynamic.literal(accessTokenHttpMethod = accessTokenHttpMethod.asInstanceOf[js.Any], followRedirects = followRedirects.asInstanceOf[js.Any], requestTokenHttpMethod = requestTokenHttpMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenHttpMethod]
  }
  @scala.inline
  implicit class AccessTokenHttpMethodOps[Self <: AccessTokenHttpMethod] (val x: Self) extends AnyVal {
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

