package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateReplicationGroupMemberAction extends StObject {
  
  /**
    * Replica-specific global secondary index settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexList] = js.native
  
  /**
    * The AWS KMS customer master key (CMK) of the replica that should be used for AWS KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS master key alias/aws/dynamodb.
    */
  var KMSMasterKeyId: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.KMSMasterKeyId] = js.native
  
  /**
    * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ProvisionedThroughputOverride] = js.native
  
  /**
    * The Region where the replica exists.
    */
  var RegionName: typingsSlinky.awsSdk.dynamodbMod.RegionName = js.native
}
object UpdateReplicationGroupMemberAction {
  
  @scala.inline
  def apply(RegionName: RegionName): UpdateReplicationGroupMemberAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReplicationGroupMemberAction]
  }
  
  @scala.inline
  implicit class UpdateReplicationGroupMemberActionMutableBuilder[Self <: UpdateReplicationGroupMemberAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
    
    @scala.inline
    def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
  }
}
