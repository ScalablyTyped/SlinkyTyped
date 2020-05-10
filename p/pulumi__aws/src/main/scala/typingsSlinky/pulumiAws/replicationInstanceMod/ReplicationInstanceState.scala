package typingsSlinky.pulumiAws.replicationInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationInstanceState extends js.Object {
  /**
    * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
    */
  val allocatedStorage: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The EC2 Availability Zone that the replication instance will be created in.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The engine version number of the replication instance.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies if the replication instance is a multi-az deployment. You cannot set the `availabilityZone` parameter if the `multiAz` parameter is set to `true`.
    */
  val multiAz: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The compute and memory capacity of the replication instance as specified by the replication instance class. Can be one of `dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge`
    */
  val replicationInstanceClass: js.UndefOr[Input[String]] = js.native
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  val replicationInstanceId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of the private IP addresses of the replication instance.
    */
  val replicationInstancePrivateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of the public IP addresses of the replication instance.
    */
  val replicationInstancePublicIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A subnet group to associate with the replication instance.
    */
  val replicationSubnetGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ReplicationInstanceState {
  @scala.inline
  def apply(): ReplicationInstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationInstanceState]
  }
  @scala.inline
  implicit class ReplicationInstanceStateOps[Self <: ReplicationInstanceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocatedStorage(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatedStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyImmediately(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMinorVersionUpgrade(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMinorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMinorVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMinorVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiAz(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiAz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiAz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiAz")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredMaintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPubliclyAccessible(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publiclyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubliclyAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publiclyAccessible")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstanceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstanceClass(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstanceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstanceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstanceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstancePrivateIps(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstancePrivateIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstancePrivateIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstancePrivateIps")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstancePublicIps(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstancePublicIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstancePublicIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstancePublicIps")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationSubnetGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSubnetGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationSubnetGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSubnetGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

