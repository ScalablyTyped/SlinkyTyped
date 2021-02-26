package typingsSlinky.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignRequest extends StObject {
  
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.native
  
  /**
    * Identifies an asymmetric CMK. AWS KMS uses the private key in the asymmetric CMK to sign the message. The KeyUsage type of the CMK must be SIGN_VERIFY. To find the KeyUsage of a CMK, use the DescribeKey operation. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: KeyIdType = js.native
  
  /**
    * Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message, provide the message digest. If you provide a message, AWS KMS generates a hash digest of the message and then signs it.
    */
  var Message: PlaintextType = js.native
  
  /**
    * Tells AWS KMS whether the value of the Message parameter is a message or message digest. The default value, RAW, indicates a message. To indicate a message digest, enter DIGEST.
    */
  var MessageType: js.UndefOr[typingsSlinky.awsSdk.kmsMod.MessageType] = js.native
  
  /**
    * Specifies the signing algorithm to use when signing the message.  Choose an algorithm that is compatible with the type and size of the specified asymmetric CMK.
    */
  var SigningAlgorithm: SigningAlgorithmSpec = js.native
}
object SignRequest {
  
  @scala.inline
  def apply(KeyId: KeyIdType, Message: PlaintextType, SigningAlgorithm: SigningAlgorithmSpec): SignRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignRequest]
  }
  
  @scala.inline
  implicit class SignRequestMutableBuilder[Self <: SignRequest] (val x: Self) extends AnyVal {
    
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
    def setSigningAlgorithm(value: SigningAlgorithmSpec): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
  }
}
