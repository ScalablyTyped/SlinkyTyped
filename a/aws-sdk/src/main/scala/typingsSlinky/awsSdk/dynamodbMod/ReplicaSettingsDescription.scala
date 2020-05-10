package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaSettingsDescription extends js.Object {
  /**
    * The Region name of the replica.
    */
  var RegionName: typingsSlinky.awsSdk.dynamodbMod.RegionName = js.native
  /**
    * The read/write capacity mode of the replica.
    */
  var ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary] = js.native
  /**
    * Replica global secondary index settings for the global table.
    */
  var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList] = js.native
  /**
    * Auto scaling settings for a global table replica's read capacity units.
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
  /**
    * Auto scaling settings for a global table replica's write capacity units.
    */
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    */
  var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
  /**
    * The current state of the Region:    CREATING - The Region is being created.    UPDATING - The Region is being updated.    DELETING - The Region is being deleted.    ACTIVE - The Region is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReplicaStatus] = js.native
}

object ReplicaSettingsDescription {
  @scala.inline
  def apply(RegionName: RegionName): ReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsDescription]
  }
  @scala.inline
  implicit class ReplicaSettingsDescriptionOps[Self <: ReplicaSettingsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegionName(value: RegionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicaBillingModeSummary(value: BillingModeSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaBillingModeSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaBillingModeSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaBillingModeSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaGlobalSecondaryIndexSettings(value: ReplicaGlobalSecondaryIndexSettingsDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaGlobalSecondaryIndexSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaGlobalSecondaryIndexSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaGlobalSecondaryIndexSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaProvisionedReadCapacityAutoScalingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaProvisionedReadCapacityUnits(value: NonNegativeLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedReadCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaProvisionedReadCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedReadCapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedWriteCapacityAutoScalingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaProvisionedWriteCapacityAutoScalingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedWriteCapacityAutoScalingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaProvisionedWriteCapacityUnits(value: NonNegativeLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedWriteCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaProvisionedWriteCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedWriteCapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaStatus(value: ReplicaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaStatus")(js.undefined)
        ret
    }
  }
  
}

