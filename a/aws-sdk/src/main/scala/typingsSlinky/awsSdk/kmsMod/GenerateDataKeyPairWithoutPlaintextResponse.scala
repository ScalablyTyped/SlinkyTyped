package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateDataKeyPairWithoutPlaintextResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK that encrypted the private key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  
  /**
    * The type of data key pair that was generated.
    */
  var KeyPairSpec: js.UndefOr[DataKeyPairSpec] = js.native
  
  /**
    * The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var PrivateKeyCiphertextBlob: js.UndefOr[CiphertextType] = js.native
  
  /**
    * The public key (in plaintext).
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.native
}
object GenerateDataKeyPairWithoutPlaintextResponse {
  
  @scala.inline
  def apply(): GenerateDataKeyPairWithoutPlaintextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyPairWithoutPlaintextResponse]
  }
  
  @scala.inline
  implicit class GenerateDataKeyPairWithoutPlaintextResponseOps[Self <: GenerateDataKeyPairWithoutPlaintextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    
    @scala.inline
    def setKeyPairSpec(value: DataKeyPairSpec): Self = this.set("KeyPairSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPairSpec: Self = this.set("KeyPairSpec", js.undefined)
    
    @scala.inline
    def setPrivateKeyCiphertextBlobUint8Array(value: js.typedarray.Uint8Array): Self = this.set("PrivateKeyCiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyCiphertextBlob(value: CiphertextType): Self = this.set("PrivateKeyCiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyCiphertextBlob: Self = this.set("PrivateKeyCiphertextBlob", js.undefined)
    
    @scala.inline
    def setPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: PublicKeyType): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("PublicKey", js.undefined)
  }
}
