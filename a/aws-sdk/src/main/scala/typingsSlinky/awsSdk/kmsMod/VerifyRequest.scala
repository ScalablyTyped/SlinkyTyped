package typingsSlinky.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyRequest extends StObject {
  
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.native
  
  /**
    * Identifies the asymmetric CMK that will be used to verify the signature. This must be the same CMK that was used to generate the signature. If you specify a different CMK, the signature verification fails. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: KeyIdType = js.native
  
  /**
    * Specifies the message that was signed. You can submit a raw message of up to 4096 bytes, or a hash digest of the message. If you submit a digest, use the MessageType parameter with a value of DIGEST. If the message specified here is different from the message that was signed, the signature verification fails. A message and its hash digest are considered to be the same message.
    */
  var Message: PlaintextType = js.native
  
  /**
    * Tells AWS KMS whether the value of the Message parameter is a message or message digest. The default value, RAW, indicates a message. To indicate a message digest, enter DIGEST.  Use the DIGEST value only when the value of the Message parameter is a message digest. If you use the DIGEST value with a raw message, the security of the verification operation can be compromised. 
    */
  var MessageType: js.UndefOr[typingsSlinky.awsSdk.kmsMod.MessageType] = js.native
  
  /**
    * The signature that the Sign operation generated.
    */
  var Signature: CiphertextType = js.native
  
  /**
    * The signing algorithm that was used to sign the message. If you submit a different algorithm, the signature verification fails.
    */
  var SigningAlgorithm: SigningAlgorithmSpec = js.native
}
object VerifyRequest {
  
  @scala.inline
  def apply(
    KeyId: KeyIdType,
    Message: PlaintextType,
    Signature: CiphertextType,
    SigningAlgorithm: SigningAlgorithmSpec
  ): VerifyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyRequest]
  }
  
  @scala.inline
  implicit class VerifyRequestMutableBuilder[Self <: VerifyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrantTokens(value: GrantTokenList): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    @scala.inline
    def setGrantTokensVarargs(value: GrantTokenType*): Self = StObject.set(x, "GrantTokens", js.Array(value :_*))
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: PlaintextType): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    @scala.inline
    def setMessageUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: CiphertextType): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAlgorithm(value: SigningAlgorithmSpec): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
  }
}
