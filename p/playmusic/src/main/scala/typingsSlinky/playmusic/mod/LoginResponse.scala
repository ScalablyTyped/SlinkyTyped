package typingsSlinky.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginResponse extends js.Object {
  var androidId: String = js.native
  var masterToken: String = js.native
}

object LoginResponse {
  @scala.inline
  def apply(androidId: String, masterToken: String): LoginResponse = {
    val __obj = js.Dynamic.literal(androidId = androidId.asInstanceOf[js.Any], masterToken = masterToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResponse]
  }
  @scala.inline
  implicit class LoginResponseOps[Self <: LoginResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

