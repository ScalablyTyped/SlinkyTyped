package typingsSlinky.gapiClientOslogin.gapi.client.oslogin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSshPublicKeyResponse extends js.Object {
  /** The login profile information for the user. */
  var loginProfile: js.UndefOr[LoginProfile] = js.native
}

object ImportSshPublicKeyResponse {
  @scala.inline
  def apply(): ImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSshPublicKeyResponse]
  }
  @scala.inline
  implicit class ImportSshPublicKeyResponseOps[Self <: ImportSshPublicKeyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoginProfile(value: LoginProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginProfile")(js.undefined)
        ret
    }
  }
  
}

