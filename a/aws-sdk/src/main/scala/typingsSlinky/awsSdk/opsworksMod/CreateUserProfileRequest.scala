package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserProfileRequest extends js.Object {
  /**
    * Whether users can specify their own SSH public key through the My Settings page. For more information, see Setting an IAM User's Public SSH Key.
    */
  var AllowSelfManagement: js.UndefOr[Boolean] = js.native
  /**
    * The user's IAM ARN; this can also be a federated user's ARN.
    */
  var IamUserArn: String = js.native
  /**
    * The user's public SSH key.
    */
  var SshPublicKey: js.UndefOr[String] = js.native
  /**
    * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, my.name will be changed to myname. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from the IAM user name. 
    */
  var SshUsername: js.UndefOr[String] = js.native
}

object CreateUserProfileRequest {
  @scala.inline
  def apply(IamUserArn: String): CreateUserProfileRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileRequest]
  }
  @scala.inline
  implicit class CreateUserProfileRequestOps[Self <: CreateUserProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamUserArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamUserArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowSelfManagement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowSelfManagement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSelfManagement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowSelfManagement")(js.undefined)
        ret
    }
    @scala.inline
    def withSshPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSshUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshUsername")(js.undefined)
        ret
    }
  }
  
}

