package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableReplicaAutoScalingInput extends js.Object {
  /**
    * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
    */
  var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexAutoScalingUpdateList] = js.native
  var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  /**
    * Represents the auto scaling settings of replicas of the table that will be modified.
    */
  var ReplicaUpdates: js.UndefOr[ReplicaAutoScalingUpdateList] = js.native
  /**
    * The name of the global table to be updated.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
}

object UpdateTableReplicaAutoScalingInput {
  @scala.inline
  def apply(TableName: TableName): UpdateTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingInput]
  }
  @scala.inline
  implicit class UpdateTableReplicaAutoScalingInputOps[Self <: UpdateTableReplicaAutoScalingInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexUpdates(value: GlobalSecondaryIndexAutoScalingUpdateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSecondaryIndexUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityAutoScalingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedWriteCapacityAutoScalingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityAutoScalingUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaUpdates(value: ReplicaAutoScalingUpdateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaUpdates")(js.undefined)
        ret
    }
  }
  
}

