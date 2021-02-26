package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionPasswordEncryption extends StObject {
  
  /**
    * An AWS KMS key that is used to encrypt the connection password.  If connection password protection is enabled, the caller of CreateConnection and UpdateConnection needs at least kms:Encrypt permission on the specified AWS KMS key, to encrypt passwords before storing them in the Data Catalog.  You can set the decrypt permission to enable or restrict access on the password key according to your security requirements.
    */
  var AwsKmsKeyId: js.UndefOr[NameString] = js.native
  
  /**
    * When the ReturnConnectionPasswordEncrypted flag is set to "true", passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently from catalog encryption. 
    */
  var ReturnConnectionPasswordEncrypted: Boolean = js.native
}
object ConnectionPasswordEncryption {
  
  @scala.inline
  def apply(ReturnConnectionPasswordEncrypted: Boolean): ConnectionPasswordEncryption = {
    val __obj = js.Dynamic.literal(ReturnConnectionPasswordEncrypted = ReturnConnectionPasswordEncrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionPasswordEncryption]
  }
  
  @scala.inline
  implicit class ConnectionPasswordEncryptionMutableBuilder[Self <: ConnectionPasswordEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsKmsKeyId(value: NameString): Self = StObject.set(x, "AwsKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsKmsKeyIdUndefined: Self = StObject.set(x, "AwsKmsKeyId", js.undefined)
    
    @scala.inline
    def setReturnConnectionPasswordEncrypted(value: Boolean): Self = StObject.set(x, "ReturnConnectionPasswordEncrypted", value.asInstanceOf[js.Any])
  }
}
