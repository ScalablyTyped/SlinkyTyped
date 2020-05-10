package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationGroupMemberAction extends js.Object {
  /**
    * Replica-specific global secondary index settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexList] = js.native
  /**
    * The AWS KMS customer master key (CMK) that should be used for AWS KMS encryption in the new replica. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS master key alias/aws/dynamodb.
    */
  var KMSMasterKeyId: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.KMSMasterKeyId] = js.native
  /**
    * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ProvisionedThroughputOverride] = js.native
  /**
    * The Region where the new replica will be created.
    */
  var RegionName: typingsSlinky.awsSdk.dynamodbMod.RegionName = js.native
}

object CreateReplicationGroupMemberAction {
  @scala.inline
  def apply(RegionName: RegionName): CreateReplicationGroupMemberAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationGroupMemberAction]
  }
  @scala.inline
  implicit class CreateReplicationGroupMemberActionOps[Self <: CreateReplicationGroupMemberAction] (val x: Self) extends AnyVal {
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
    def withGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexList): Self = {
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
  }
  
}

