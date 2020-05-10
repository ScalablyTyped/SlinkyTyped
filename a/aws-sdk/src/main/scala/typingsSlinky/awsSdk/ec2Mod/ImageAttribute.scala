package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageAttribute extends js.Object {
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  /**
    * A description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.native
  /**
    * The launch permissions.
    */
  var LaunchPermissions: js.UndefOr[LaunchPermissionList] = js.native
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.native
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.native
}

object ImageAttribute {
  @scala.inline
  def apply(): ImageAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAttribute]
  }
  @scala.inline
  implicit class ImageAttributeOps[Self <: ImageAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockDeviceMappings(value: BlockDeviceMappingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockDeviceMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockDeviceMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockDeviceMappings")(js.undefined)
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
    def withImageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelId(value: AttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernelId")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchPermissions(value: LaunchPermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCodes(value: ProductCodeList): Self = {
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
    def withRamdiskId(value: AttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RamdiskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamdiskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RamdiskId")(js.undefined)
        ret
    }
    @scala.inline
    def withSriovNetSupport(value: AttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SriovNetSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSriovNetSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SriovNetSupport")(js.undefined)
        ret
    }
  }
  
}

