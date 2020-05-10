package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  /**
    * The architecture of the image.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.native
  /**
    * Any block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  /**
    * The date and time the image was created.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The description of the AMI that was provided during image creation.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Specifies whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.native
  /**
    * The hypervisor type of the image.
    */
  var Hypervisor: js.UndefOr[HypervisorType] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The location of the AMI.
    */
  var ImageLocation: js.UndefOr[String] = js.native
  /**
    * The AWS account alias (for example, amazon, self) or the AWS account ID of the AMI owner.
    */
  var ImageOwnerAlias: js.UndefOr[String] = js.native
  /**
    * The type of image.
    */
  var ImageType: js.UndefOr[ImageTypeValues] = js.native
  /**
    * The kernel associated with the image, if any. Only applicable for machine images.
    */
  var KernelId: js.UndefOr[String] = js.native
  /**
    * The name of the AMI that was provided during image creation.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the image owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * This value is set to windows for Windows AMIs; otherwise, it is blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.native
  /**
    * The platform details associated with the billing code of the AMI. For more information, see Obtaining Billing Information in the Amazon Elastic Compute Cloud User Guide.
    */
  var PlatformDetails: js.UndefOr[String] = js.native
  /**
    * Any product codes associated with the AMI.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * Indicates whether the image has public launch permissions. The value is true if this image has public launch permissions or false if it has only implicit and explicit launch permissions.
    */
  var Public: js.UndefOr[Boolean] = js.native
  /**
    * The RAM disk associated with the image, if any. Only applicable for machine images.
    */
  var RamdiskId: js.UndefOr[String] = js.native
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.native
  /**
    * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
    */
  var RootDeviceType: js.UndefOr[DeviceType] = js.native
  /**
    * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[String] = js.native
  /**
    * The current state of the AMI. If the state is available, the image is successfully registered and can be used to launch an instance.
    */
  var State: js.UndefOr[ImageState] = js.native
  /**
    * The reason for the state change.
    */
  var StateReason: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.StateReason] = js.native
  /**
    * Any tags assigned to the image.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The operation of the Amazon EC2 instance and the billing code that is associated with the AMI. usageOperation corresponds to the lineitem/Operation column on your AWS Cost and Usage Report and in the AWS Price List API. For the list of UsageOperation codes, see Platform Details and Usage Operation Billing Codes in the Amazon Elastic Compute Cloud User Guide.
    */
  var UsageOperation: js.UndefOr[String] = js.native
  /**
    * The type of virtualization of the AMI.
    */
  var VirtualizationType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VirtualizationType] = js.native
}

object Image {
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: ArchitectureValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Architecture")(js.undefined)
        ret
    }
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
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
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
    def withEnaSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnaSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnaSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnaSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withHypervisor(value: HypervisorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hypervisor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHypervisor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hypervisor")(js.undefined)
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
    def withImageLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withImageOwnerAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageOwnerAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageOwnerAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageOwnerAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withImageType(value: ImageTypeValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageType")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelId(value: String): Self = {
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
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: PlatformValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformDetails")(js.undefined)
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
    def withPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Public")(js.undefined)
        ret
    }
    @scala.inline
    def withRamdiskId(value: String): Self = {
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
    def withRootDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDeviceType(value: DeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootDeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSriovNetSupport(value: String): Self = {
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
    @scala.inline
    def withState(value: ImageState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReason(value: StateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualizationType(value: VirtualizationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualizationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualizationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualizationType")(js.undefined)
        ret
    }
  }
  
}

