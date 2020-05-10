package typingsSlinky.gapiClientOslogin.gapi.client.oslogin

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginProfile extends js.Object {
  /** A unique user ID for identifying the user. */
  var name: js.UndefOr[String] = js.native
  /** The list of POSIX accounts associated with the Directory API user. */
  var posixAccounts: js.UndefOr[js.Array[PosixAccount]] = js.native
  /** A map from SSH public key fingerprint to the associated key object. */
  var sshPublicKeys: js.UndefOr[Record[String, SshPublicKey]] = js.native
  /** Indicates if the user is suspended. */
  var suspended: js.UndefOr[Boolean] = js.native
}

object LoginProfile {
  @scala.inline
  def apply(): LoginProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginProfile]
  }
  @scala.inline
  implicit class LoginProfileOps[Self <: LoginProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPosixAccounts(value: js.Array[PosixAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posixAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosixAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posixAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withSshPublicKeys(value: Record[String, SshPublicKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspended")(js.undefined)
        ret
    }
  }
  
}

