package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyImageAttributeRequest extends js.Object {
  /**
    * The name of the attribute to modify. The valid values are description, launchPermission, and productCodes.
    */
  var Attribute: js.UndefOr[String] = js.native
  /**
    * A new description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: typingsSlinky.awsSdk.ec2Mod.ImageId = js.native
  /**
    * A new launch permission for the AMI.
    */
  var LaunchPermission: js.UndefOr[LaunchPermissionModifications] = js.native
  /**
    * The operation type. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var OperationType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.OperationType] = js.native
  /**
    * The DevPay product codes. After you add a product code to an AMI, it can't be removed.
    */
  var ProductCodes: js.UndefOr[ProductCodeStringList] = js.native
  /**
    * The user groups. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var UserGroups: js.UndefOr[UserGroupStringList] = js.native
  /**
    * The AWS account IDs. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.native
  /**
    * The value of the attribute being modified. This parameter can be used only when the Attribute parameter is description or productCodes.
    */
  var Value: js.UndefOr[String] = js.native
}

object ModifyImageAttributeRequest {
  @scala.inline
  def apply(ImageId: ImageId): ModifyImageAttributeRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyImageAttributeRequest]
  }
  @scala.inline
  implicit class ModifyImageAttributeRequestOps[Self <: ModifyImageAttributeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageId(value: ImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: AttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchPermission(value: LaunchPermissionModifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchPermission")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationType(value: OperationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationType")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCodes(value: ProductCodeStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withUserGroups(value: UserGroupStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIds(value: UserIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserIds")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

