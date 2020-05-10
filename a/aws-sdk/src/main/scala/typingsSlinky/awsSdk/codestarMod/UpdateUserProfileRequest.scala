package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserProfileRequest extends js.Object {
  /**
    * The name that is displayed as the friendly name for the user in AWS CodeStar.
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.native
  /**
    * The email address that is displayed as part of the user's profile in AWS CodeStar.
    */
  var emailAddress: js.UndefOr[Email] = js.native
  /**
    * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.native
  /**
    * The name that will be displayed as the friendly name for the user in AWS CodeStar.
    */
  var userArn: UserArn = js.native
}

object UpdateUserProfileRequest {
  @scala.inline
  def apply(userArn: UserArn): UpdateUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserProfileRequest]
  }
  @scala.inline
  implicit class UpdateUserProfileRequestOps[Self <: UpdateUserProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserArn(value: UserArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: UserProfileDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSshPublicKey(value: SshPublicKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKey")(js.undefined)
        ret
    }
  }
  
}

