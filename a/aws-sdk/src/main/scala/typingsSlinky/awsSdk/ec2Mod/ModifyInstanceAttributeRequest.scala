package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceAttributeRequest extends js.Object {
  /**
    * The name of the attribute.
    */
  var Attribute: js.UndefOr[InstanceAttributeName] = js.native
  /**
    * Modifies the DeleteOnTermination attribute for volumes that are currently attached. The volume must be owned by the caller. If no value is specified for DeleteOnTermination, the default is true and the volume is deleted when the instance is terminated. To add instance store volumes to an Amazon EBS-backed instance, you must add them when you launch the instance. For more information, see Updating the Block Device Mapping when Launching an Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingSpecificationList] = js.native
  /**
    * If the value is true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use this parameter for Spot Instances.
    */
  var DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
    */
  var EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Set to true to enable enhanced networking with ENA for the instance. This option is supported only for HVM instances. Specifying this option with a PV instance can make it unreachable.
    */
  var EnaSupport: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * [EC2-VPC] Changes the security groups of the instance. You must specify at least one security group, even if it's just the default security group for the VPC. You must specify the security group ID, not the security group name.
    */
  var Groups: js.UndefOr[GroupIdStringList] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typingsSlinky.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * Specifies whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.native
  /**
    * Changes the instance type to the specified value. For more information, see Instance Types. If the instance type is not valid, the error returned is InvalidInstanceAttributeValue.
    */
  var InstanceType: js.UndefOr[AttributeValue] = js.native
  /**
    * Changes the instance's kernel to the specified value. We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see PV-GRUB.
    */
  var Kernel: js.UndefOr[AttributeValue] = js.native
  /**
    * Changes the instance's RAM disk to the specified value. We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see PV-GRUB.
    */
  var Ramdisk: js.UndefOr[AttributeValue] = js.native
  /**
    * Specifies whether source/destination checking is enabled. A value of true means that checking is enabled, and false means that checking is disabled. This value must be false for a NAT instance to perform NAT.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Set to simple to enable enhanced networking with the Intel 82599 Virtual Function interface for the instance. There is no way to disable enhanced networking with the Intel 82599 Virtual Function interface at this time. This option is supported only for HVM instances. Specifying this option with a PV instance can make it unreachable.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.native
  /**
    * Changes the instance's user data to the specified value. If you are using an AWS SDK or command line tool, base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide base64-encoded text.
    */
  var UserData: js.UndefOr[BlobAttributeValue] = js.native
  /**
    * A new value for the attribute. Use only with the kernel, ramdisk, userData, disableApiTermination, or instanceInitiatedShutdownBehavior attribute.
    */
  var Value: js.UndefOr[String] = js.native
}

object ModifyInstanceAttributeRequest {
  @scala.inline
  def apply(InstanceId: InstanceId): ModifyInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceAttributeRequest]
  }
  @scala.inline
  implicit class ModifyInstanceAttributeRequestOps[Self <: ModifyInstanceAttributeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttribute(value: InstanceAttributeName): Self = {
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
    def withBlockDeviceMappings(value: InstanceBlockDeviceMappingSpecificationList): Self = {
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
    def withDisableApiTermination(value: AttributeBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableApiTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableApiTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableApiTermination")(js.undefined)
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
    def withEbsOptimized(value: AttributeBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimized")(js.undefined)
        ret
    }
    @scala.inline
    def withEnaSupport(value: AttributeBooleanValue): Self = {
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
    def withGroups(value: GroupIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceInitiatedShutdownBehavior(value: AttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInitiatedShutdownBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInitiatedShutdownBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInitiatedShutdownBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: AttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withKernel(value: AttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Kernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Kernel")(js.undefined)
        ret
    }
    @scala.inline
    def withRamdisk(value: AttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ramdisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamdisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ramdisk")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDestCheck(value: AttributeBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDestCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDestCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDestCheck")(js.undefined)
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
    @scala.inline
    def withUserData(value: BlobAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserData")(js.undefined)
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

