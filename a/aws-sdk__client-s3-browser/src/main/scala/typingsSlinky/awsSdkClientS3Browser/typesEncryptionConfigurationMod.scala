package typingsSlinky.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEncryptionConfigurationMod {
  
  @js.native
  trait EncryptionConfiguration extends StObject {
    
    /**
      * <p> The ID of the AWS KMS key for the region where the destination bucket resides. Amazon S3 uses this key to encrypt the replica object. </p>
      */
    var ReplicaKmsKeyID: js.UndefOr[String] = js.native
  }
  object EncryptionConfiguration {
    
    @scala.inline
    def apply(): EncryptionConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptionConfiguration]
    }
    
    @scala.inline
    implicit class EncryptionConfigurationMutableBuilder[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplicaKmsKeyID(value: String): Self = StObject.set(x, "ReplicaKmsKeyID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaKmsKeyIDUndefined: Self = StObject.set(x, "ReplicaKmsKeyID", js.undefined)
    }
  }
  
  type UnmarshalledEncryptionConfiguration = EncryptionConfiguration
}
