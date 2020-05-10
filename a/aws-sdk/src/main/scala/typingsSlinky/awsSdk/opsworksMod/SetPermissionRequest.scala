package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetPermissionRequest extends js.Object {
  /**
    * The user is allowed to use SSH to communicate with the instance.
    */
  var AllowSsh: js.UndefOr[Boolean] = js.native
  /**
    * The user is allowed to use sudo to elevate privileges.
    */
  var AllowSudo: js.UndefOr[Boolean] = js.native
  /**
    * The user's IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String = js.native
  /**
    * The user's permission level, which must be set to one of the following strings. You cannot set your own permissions level.    deny     show     deploy     manage     iam_only    For more information about the permissions associated with these levels, see Managing User Permissions.
    */
  var Level: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object SetPermissionRequest {
  @scala.inline
  def apply(IamUserArn: String, StackId: String): SetPermissionRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPermissionRequest]
  }
  @scala.inline
  implicit class SetPermissionRequestOps[Self <: SetPermissionRequest] (val x: Self) extends AnyVal {
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
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowSsh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowSsh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSsh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowSsh")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSudo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowSudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowSudo")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Level")(js.undefined)
        ret
    }
  }
  
}

