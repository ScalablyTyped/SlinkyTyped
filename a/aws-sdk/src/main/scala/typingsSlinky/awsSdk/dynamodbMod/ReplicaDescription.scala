package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaDescription extends js.Object {
  /**
    * Replica-specific global secondary index settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexDescriptionList] = js.native
  /**
    * The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
    */
  var KMSMasterKeyId: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.KMSMasterKeyId] = js.native
  /**
    * Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ProvisionedThroughputOverride] = js.native
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.RegionName] = js.native
  /**
    * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReplicaStatus] = js.native
  /**
    * Detailed information about the replica status.
    */
  var ReplicaStatusDescription: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReplicaStatusDescription] = js.native
  /**
    * Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
    */
  var ReplicaStatusPercentProgress: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReplicaStatusPercentProgress] = js.native
}

object ReplicaDescription {
  @scala.inline
  def apply(): ReplicaDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaDescription]
  }
  @scala.inline
  implicit class ReplicaDescriptionOps[Self <: ReplicaDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withKMSMasterKeyId(value: KMSMasterKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSMasterKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSMasterKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSMasterKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughputOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedThroughputOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughputOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionName(value: RegionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(js.undefined)
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
    @scala.inline
    def withReplicaStatusDescription(value: ReplicaStatusDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaStatusDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaStatusDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaStatusDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaStatusPercentProgress(value: ReplicaStatusPercentProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaStatusPercentProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaStatusPercentProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaStatusPercentProgress")(js.undefined)
        ret
    }
  }
  
}

