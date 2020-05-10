package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserData extends UserData[AppMetadata, UserMetadata] {
  var client_id: js.UndefOr[String] = js.native
  var connection: js.UndefOr[String] = js.native
  var verify_password: js.UndefOr[Boolean] = js.native
  var verify_phone_number: js.UndefOr[Boolean] = js.native
}

object UpdateUserData {
  @scala.inline
  def apply(): UpdateUserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserData]
  }
  @scala.inline
  implicit class UpdateUserDataOps[Self <: UpdateUserData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withVerify_password(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerify_password: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify_password")(js.undefined)
        ret
    }
    @scala.inline
    def withVerify_phone_number(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify_phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerify_phone_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify_phone_number")(js.undefined)
        ret
    }
  }
  
}

