package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationInstanceMessage extends js.Object {
  /**
    * The amount of storage (in gigabytes) to be allocated for the replication instance.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage, and the change is asynchronously applied as soon as possible. This parameter must be set to true when specifying a value for the EngineVersion parameter that is a different major version than the replication instance's current version.
    */
  var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the changes should be applied immediately or during the next maintenance window.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates that minor version upgrades are applied automatically to the replication instance during the maintenance window. Changing this parameter doesn't result in an outage, except in the case dsecribed following. The change is asynchronously applied as soon as possible.  An outage does result if these factors apply:    This parameter is set to true during the maintenance window.   A newer minor version is available.    AWS DMS has enabled automatic patching for the given engine version.   
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * The engine version number of the replication instance.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    *  Specifies whether the replication instance is a Multi-AZ deployment. You can't set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter does not result in an outage, except in the following situation, and the change is asynchronously applied as soon as possible. If moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure pending changes are applied. Default: Uses existing setting Format: ddd:hh24:mi-ddd:hh24:mi Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Must be at least 30 minutes
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: String = js.native
  /**
    * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.native
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  var ReplicationInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    *  Specifies the VPC security group to be used with the replication instance. The VPC security group must work with the VPC containing the replication instance. 
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object ModifyReplicationInstanceMessage {
  @scala.inline
  def apply(ReplicationInstanceArn: String): ModifyReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationInstanceMessage]
  }
  @scala.inline
  implicit class ModifyReplicationInstanceMessageOps[Self <: ModifyReplicationInstanceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocatedStorage(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocatedStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMajorVersionUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowMajorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMajorVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowMajorVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMinorVersionUpgrade(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMinorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMinorVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMinorVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiAZ(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiAZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiAZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiAZ")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstanceClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

