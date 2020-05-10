package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalTableSettingsInput extends js.Object {
  /**
    * The billing mode of the global table. If GlobalTableBillingMode is not specified, the global table defaults to PROVISIONED capacity billing mode.    PROVISIONED - We recommend using PROVISIONED for predictable workloads. PROVISIONED sets the billing mode to Provisioned Mode.    PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads. PAY_PER_REQUEST sets the billing mode to On-Demand Mode.   
    */
  var GlobalTableBillingMode: js.UndefOr[BillingMode] = js.native
  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList] = js.native
  /**
    * The name of the global table
    */
  var GlobalTableName: TableName = js.native
  /**
    * Auto scaling settings for managing provisioned write capacity for the global table.
    */
  var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
    */
  var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * Represents the settings for a global table in a Region that will be modified.
    */
  var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList] = js.native
}

object UpdateGlobalTableSettingsInput {
  @scala.inline
  def apply(GlobalTableName: TableName): UpdateGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
  }
  @scala.inline
  implicit class UpdateGlobalTableSettingsInputOps[Self <: UpdateGlobalTableSettingsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalTableBillingMode(value: BillingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableBillingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableBillingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableBillingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableGlobalSecondaryIndexSettingsUpdate(value: GlobalTableGlobalSecondaryIndexSettingsUpdateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableGlobalSecondaryIndexSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableGlobalSecondaryIndexSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableGlobalSecondaryIndexSettingsUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableProvisionedWriteCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableProvisionedWriteCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableProvisionedWriteCapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaSettingsUpdate(value: ReplicaSettingsUpdateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaSettingsUpdate")(js.undefined)
        ret
    }
  }
  
}

