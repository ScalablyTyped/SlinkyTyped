package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAttribute extends js.Object {
  /**
    * The block device mapping of the instance.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.native
  /**
    * If the value is true, you can't terminate the instance through the Amazon EC2 console, CLI, or API; otherwise, you can.
    */
  var DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * The security groups associated with the instance.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[AttributeValue] = js.native
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.native
  /**
    * A list of product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.native
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[AttributeValue] = js.native
  /**
    * Indicates whether source/destination checking is enabled. A value of true means that checking is enabled, and false means that checking is disabled. This value must be false for a NAT instance to perform NAT.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.native
  /**
    * The user data.
    */
  var UserData: js.UndefOr[AttributeValue] = js.native
}

object InstanceAttribute {
  @scala.inline
  def apply(): InstanceAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAttribute]
  }
  @scala.inline
  implicit class InstanceAttributeOps[Self <: InstanceAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockDeviceMappings(value: InstanceBlockDeviceMappingList): Self = {
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
    def withGroups(value: GroupIdentifierList): Self = {
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
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
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
    def withRootDeviceName(value: AttributeValue): Self = {
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
    def withUserData(value: AttributeValue): Self = {
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
  }
  
}

