package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionKey extends StObject {
  
  /**
    * The ID used to identify the key. For an AWS KMS key, you can use the key ID, the key ARN, or the alias ARN.  Aliases are recognized only in the account that created the customer master key (CMK). For cross-account actions, you can only use the key ID or key ARN to identify the key. 
    */
  var id: EncryptionKeyId = js.native
  
  /**
    * The type of encryption key, such as an AWS Key Management Service (AWS KMS) key. When creating or updating a pipeline, the value must be set to 'KMS'.
    */
  var `type`: EncryptionKeyType = js.native
}
object EncryptionKey {
  
  @scala.inline
  def apply(id: EncryptionKeyId, `type`: EncryptionKeyType): EncryptionKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKey]
  }
  
  @scala.inline
  implicit class EncryptionKeyMutableBuilder[Self <: EncryptionKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: EncryptionKeyId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EncryptionKeyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
