package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSESpecification extends StObject {
  
  /**
    * Indicates whether server-side encryption is done using an AWS managed CMK or an AWS owned CMK. If enabled (true), server-side encryption type is set to KMS and an AWS managed CMK is used (AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is set to AWS owned CMK.
    */
  var Enabled: js.UndefOr[SSEEnabled] = js.native
  
  /**
    * The AWS KMS customer master key (CMK) that should be used for the AWS KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB customer master key alias/aws/dynamodb.
    */
  var KMSMasterKeyId: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.KMSMasterKeyId] = js.native
  
  /**
    * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your account and is managed by AWS KMS (AWS KMS charges apply).  
    */
  var SSEType: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.SSEType] = js.native
}
object SSESpecification {
  
  @scala.inline
  def apply(): SSESpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSESpecification]
  }
  
  @scala.inline
  implicit class SSESpecificationMutableBuilder[Self <: SSESpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: SSEEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
    
    @scala.inline
    def setSSEType(value: SSEType): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
  }
}
