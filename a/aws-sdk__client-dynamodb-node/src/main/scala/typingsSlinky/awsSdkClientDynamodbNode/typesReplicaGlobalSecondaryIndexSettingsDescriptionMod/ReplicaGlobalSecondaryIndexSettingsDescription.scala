package typingsSlinky.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ACTIVE
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETING
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingSettingsDescriptionMod.AutoScalingSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
  /**
    * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
    */
  var IndexName: String = js.native
  /**
    * <p> The current status of the global secondary index:</p> <ul> <li> <p> <code>CREATING</code> - The global secondary index is being created.</p> </li> <li> <p> <code>UPDATING</code> - The global secondary index is being updated.</p> </li> <li> <p> <code>DELETING</code> - The global secondary index is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The global secondary index is ready for use.</p> </li> </ul>
    */
  var IndexStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.native
  /**
    * <p>Autoscaling settings for a global secondary index replica's read capacity units.</p>
    */
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>AutoScaling settings for a global secondary index replica's write capacity units.</p>
    */
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.native
}

object ReplicaGlobalSecondaryIndexSettingsDescription {
  @scala.inline
  def apply(IndexName: String): ReplicaGlobalSecondaryIndexSettingsDescription = {
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
    def withIndexName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = {
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
    def withProvisionedReadCapacityUnits(value: Double): Self = {
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
    def withProvisionedWriteCapacityUnits(value: Double): Self = {
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

