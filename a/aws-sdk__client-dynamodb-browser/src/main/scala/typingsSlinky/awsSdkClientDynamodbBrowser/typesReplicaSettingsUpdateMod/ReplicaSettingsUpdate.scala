package typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaSettingsUpdate extends js.Object {
  /**
    * <p>The region of the replica to be added.</p>
    */
  var RegionName: String = js.native
  /**
    * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
    */
  var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
    (js.Array[
      typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
    ]) | (js.Iterable[
      typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
    ])
  ] = js.native
  /**
    * <p>Autoscaling settings for managing a global table replica's read capacity units.</p>
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.native
}

object ReplicaSettingsUpdate {
  @scala.inline
  def apply(RegionName: String): ReplicaSettingsUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsUpdate]
  }
  @scala.inline
  implicit class ReplicaSettingsUpdateOps[Self <: ReplicaSettingsUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicaGlobalSecondaryIndexSettingsUpdateIterable(value: js.Iterable[ReplicaGlobalSecondaryIndexSettingsUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaGlobalSecondaryIndexSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicaGlobalSecondaryIndexSettingsUpdate(
      value: js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate] | js.Iterable[ReplicaGlobalSecondaryIndexSettingsUpdate]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaGlobalSecondaryIndexSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaGlobalSecondaryIndexSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaGlobalSecondaryIndexSettingsUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaProvisionedReadCapacityUnits(value: Double): Self = {
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
  }
  
}

