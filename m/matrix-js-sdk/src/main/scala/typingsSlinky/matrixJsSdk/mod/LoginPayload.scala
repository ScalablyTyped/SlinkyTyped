package typingsSlinky.matrixJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginPayload extends js.Object {
  var access_token: String = js.native
  var device_id: String = js.native
  var home_server: String = js.native
  var user_id: String = js.native
}

object LoginPayload {
  @scala.inline
  def apply(access_token: String, device_id: String, home_server: String, user_id: String): LoginPayload = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], device_id = device_id.asInstanceOf[js.Any], home_server = home_server.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginPayload]
  }
  @scala.inline
  implicit class LoginPayloadOps[Self <: LoginPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHome_server(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("home_server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

