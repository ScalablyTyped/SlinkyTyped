package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typingsSlinky.awsSdk.dynamodbMod.IndexName = js.native
  /**
    *  The current status of the global secondary index:    CREATING - The global secondary index is being created.    UPDATING - The global secondary index is being updated.    DELETING - The global secondary index is being deleted.    ACTIVE - The global secondary index is ready for use.  
    */
  var IndexStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.IndexStatus] = js.native
  /**
    * Auto scaling settings for a global secondary index replica's read capacity units.
    */
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * Auto scaling settings for a global secondary index replica's write capacity units.
    */
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}

object ReplicaGlobalSecondaryIndexSettingsDescription {
  @scala.inline
  def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndexSettingsDescription = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsDescription]
  }
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexSettingsDescriptionOps[Self <: ReplicaGlobalSecondaryIndexSettingsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: IndexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexStatus(value: IndexStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedReadCapacityAutoScalingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedReadCapacityAutoScalingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedReadCapacityAutoScalingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedReadCapacityUnits(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedReadCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedReadCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedReadCapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityAutoScalingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedWriteCapacityAutoScalingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityAutoScalingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedWriteCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityUnits")(js.undefined)
        ret
    }
  }
  
}

