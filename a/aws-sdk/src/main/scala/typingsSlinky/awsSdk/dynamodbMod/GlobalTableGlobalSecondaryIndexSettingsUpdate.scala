package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends js.Object {
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typingsSlinky.awsSdk.dynamodbMod.IndexName = js.native
  /**
    * Auto scaling settings for managing a global secondary index's write capacity units.
    */
  var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}

object GlobalTableGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(IndexName: IndexName): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  }
  @scala.inline
  implicit class GlobalTableGlobalSecondaryIndexSettingsUpdateOps[Self <: GlobalTableGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
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
    def withProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityAutoScalingSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedWriteCapacityAutoScalingSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityAutoScalingSettingsUpdate")(js.undefined)
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

