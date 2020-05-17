package typingsSlinky.gapiClientOslogin.gapi.client.oslogin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientOslogin.anon.Accesstoken
import typingsSlinky.gapiClientOslogin.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  var sshPublicKeys: SshPublicKeysResource = js.native
  /**
    * Retrieves the profile information used for logging in to a virtual machine
    * on Google Compute Engine.
    */
  def getLoginProfile(request: Accesstoken): Request[LoginProfile] = js.native
  /**
    * Adds an SSH public key and returns the profile information. Default POSIX
    * account information is set when no username and UID exist as part of the
    * login profile.
    */
  def importSshPublicKey(request: Bearertoken): Request[ImportSshPublicKeyResponse] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    getLoginProfile: Accesstoken => Request[LoginProfile],
    importSshPublicKey: Bearertoken => Request[ImportSshPublicKeyResponse],
    sshPublicKeys: SshPublicKeysResource
  ): UsersResource = {
    val __obj = js.Dynamic.literal(getLoginProfile = js.Any.fromFunction1(getLoginProfile), importSshPublicKey = js.Any.fromFunction1(importSshPublicKey), sshPublicKeys = sshPublicKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLoginProfile(value: Accesstoken => Request[LoginProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoginProfile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImportSshPublicKey(value: Bearertoken => Request[ImportSshPublicKeyResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importSshPublicKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSshPublicKeys(value: SshPublicKeysResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

