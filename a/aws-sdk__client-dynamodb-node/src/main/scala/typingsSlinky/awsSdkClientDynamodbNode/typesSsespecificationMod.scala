package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AES256
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.KMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSsespecificationMod {
  
  @js.native
  trait SSESpecification extends StObject {
    
    /**
      * <p>Indicates whether server-side encryption is enabled (true) or disabled (false) on the table.</p>
      */
    var Enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS Master Key alias/aws/dynamodb.</p>
      */
    var KMSMasterKeyId: js.UndefOr[String] = js.native
    
    /**
      * <p>Server-side encryption type:</p> <ul> <li> <p> <code>AES256</code> - Server-side encryption which uses the AES256 algorithm.</p> </li> <li> <p> <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. (default)</p> </li> </ul>
      */
    var SSEType: js.UndefOr[AES256 | KMS | String] = js.native
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
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      @scala.inline
      def setKMSMasterKeyId(value: String): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
      
      @scala.inline
      def setSSEType(value: AES256 | KMS | String): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
    }
  }
  
  type UnmarshalledSSESpecification = SSESpecification
}
