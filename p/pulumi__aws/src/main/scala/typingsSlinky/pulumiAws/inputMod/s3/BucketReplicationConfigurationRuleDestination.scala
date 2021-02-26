package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketReplicationConfigurationRuleDestination extends StObject {
  
  /**
    * Specifies the overrides to use for object owners on replication. Must be used in conjunction with `accountId` owner override configuration.
    */
  var accessControlTranslation: js.UndefOr[Input[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]] = js.native
  
  /**
    * The Account ID to use for overriding the object owner on replication. Must be used in conjunction with `accessControlTranslation` override configuration.
    */
  var accountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
    */
  var bucket: Input[String] = js.native
  
  /**
    * Destination KMS encryption key ARN for SSE-KMS replication. Must be used in conjunction with
    * `sseKmsEncryptedObjects` source selection criteria.
    */
  var replicaKmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The class of storage used to store the object. Can be `STANDARD`, `REDUCED_REDUNDANCY`, `STANDARD_IA`, `ONEZONE_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: js.UndefOr[Input[String]] = js.native
}
object BucketReplicationConfigurationRuleDestination {
  
  @scala.inline
  def apply(bucket: Input[String]): BucketReplicationConfigurationRuleDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestination]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationRuleDestinationMutableBuilder[Self <: BucketReplicationConfigurationRuleDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlTranslation(value: Input[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]): Self = StObject.set(x, "accessControlTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlTranslationUndefined: Self = StObject.set(x, "accessControlTranslation", js.undefined)
    
    @scala.inline
    def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaKmsKeyId(value: Input[String]): Self = StObject.set(x, "replicaKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaKmsKeyIdUndefined: Self = StObject.set(x, "replicaKmsKeyId", js.undefined)
    
    @scala.inline
    def setStorageClass(value: Input[String]): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
  }
}
