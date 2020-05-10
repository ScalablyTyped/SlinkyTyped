package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyFpgaImageAttributeRequest extends js.Object {
  /**
    * The name of the attribute.
    */
  var Attribute: js.UndefOr[FpgaImageAttributeName] = js.native
  /**
    * A description for the AFI.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typingsSlinky.awsSdk.ec2Mod.FpgaImageId = js.native
  /**
    * The load permission for the AFI.
    */
  var LoadPermission: js.UndefOr[LoadPermissionModifications] = js.native
  /**
    * A name for the AFI.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The operation type.
    */
  var OperationType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.OperationType] = js.native
  /**
    * The product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid only when modifying the productCodes attribute.
    */
  var ProductCodes: js.UndefOr[ProductCodeStringList] = js.native
  /**
    * The user groups. This parameter is valid only when modifying the loadPermission attribute.
    */
  var UserGroups: js.UndefOr[UserGroupStringList] = js.native
  /**
    * The AWS account IDs. This parameter is valid only when modifying the loadPermission attribute.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.native
}

object ModifyFpgaImageAttributeRequest {
  @scala.inline
  def apply(FpgaImageId: FpgaImageId): ModifyFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyFpgaImageAttributeRequest]
  }
  @scala.inline
  implicit class ModifyFpgaImageAttributeRequestOps[Self <: ModifyFpgaImageAttributeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFpgaImageId(value: FpgaImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttribute(value: FpgaImageAttributeName): Self = {
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
    def withDescription(value: String): Self = {
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
    def withLoadPermission(value: LoadPermissionModifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadPermission")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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
  }
  
}

