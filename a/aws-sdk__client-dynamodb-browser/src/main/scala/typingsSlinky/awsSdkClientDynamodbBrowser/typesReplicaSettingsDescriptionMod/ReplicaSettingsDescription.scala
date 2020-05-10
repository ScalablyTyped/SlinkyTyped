package typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaSettingsDescriptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod.AutoScalingSettingsDescription
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod.ReplicaGlobalSecondaryIndexSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaSettingsDescription extends js.Object {
  /**
    * <p>The region name of the replica.</p>
    */
  var RegionName: String = js.native
  /**
    * <p>Replica global secondary index settings for the global table.</p>
    */
  var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[
    js.Array[ReplicaGlobalSecondaryIndexSettingsDescription] | js.Iterable[ReplicaGlobalSecondaryIndexSettingsDescription]
  ] = js.native
  /**
    * <p>Autoscaling settings for a global table replica's read capacity units.</p>
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>AutoScaling settings for a global table replica's write capacity units.</p>
    */
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>The current state of the region:</p> <ul> <li> <p> <code>CREATING</code> - The region is being created.</p> </li> <li> <p> <code>UPDATING</code> - The region is being updated.</p> </li> <li> <p> <code>DELETING</code> - The region is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The region is ready for use.</p> </li> </ul>
    */
  var ReplicaStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.native
}

object ReplicaSettingsDescription {
  @scala.inline
  def apply(RegionName: String): ReplicaSettingsDescription = {
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
    def withRegionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicaGlobalSecondaryIndexSettingsIterable(value: js.Iterable[ReplicaGlobalSecondaryIndexSettingsDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaGlobalSecondaryIndexSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicaGlobalSecondaryIndexSettings(
      value: js.Array[ReplicaGlobalSecondaryIndexSettingsDescription] | js.Iterable[ReplicaGlobalSecondaryIndexSettingsDescription]
    ): Self = {
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
    def withReplicaProvisionedWriteCapacityUnits(value: Double): Self = {
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
    def withReplicaStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = {
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

