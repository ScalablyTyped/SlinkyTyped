package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEncryptionConfigRequest extends StObject {
  
  /**
    * An AWS KMS customer master key (CMK) in one of the following formats:    Alias - The name of the key. For example, alias/MyKey.    Key ID - The KMS key ID of the key. For example, ae4aa6d49-a4d8-9df9-a475-4ff6d7898456. AWS X-Ray does not support asymmetric CMKs.    ARN - The full Amazon Resource Name of the key ID or alias. For example, arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456. Use this format to specify a key in a different account.   Omit this key if you set Type to NONE.
    */
  var KeyId: js.UndefOr[EncryptionKeyId] = js.native
  
  /**
    * The type of encryption. Set to KMS to use your own key for encryption. Set to NONE for default encryption.
    */
  var Type: EncryptionType = js.native
}
object PutEncryptionConfigRequest {
  
  @scala.inline
  def apply(Type: EncryptionType): PutEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEncryptionConfigRequest]
  }
  
  @scala.inline
  implicit class PutEncryptionConfigRequestMutableBuilder[Self <: PutEncryptionConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: EncryptionKeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    @scala.inline
    def setType(value: EncryptionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
