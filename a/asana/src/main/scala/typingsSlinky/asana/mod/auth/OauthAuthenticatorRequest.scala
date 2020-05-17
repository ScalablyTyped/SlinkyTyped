package typingsSlinky.asana.mod.auth

import typingsSlinky.asana.anon.Authorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthenticatorRequest extends js.Object {
  /**
    * When browserify-d, the `auth` component of the `request` library
    * doesn't work so well, so we just manually set the bearer token instead.
    */
  var headers: Authorization = js.native
}

object OauthAuthenticatorRequest {
  @scala.inline
  def apply(headers: Authorization): OauthAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthenticatorRequest]
  }
  @scala.inline
  implicit class OauthAuthenticatorRequestOps[Self <: OauthAuthenticatorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: Authorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

