package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateDataKeyWithoutPlaintextRequest extends js.Object {
  
  /**
    * Specifies the encryption context that will be used when encrypting the data key. An encryption context is a collection of non-secret key-value pairs that represents additional authenticated data. When you use an encryption context to encrypt data, you must specify the same (an exact case-sensitive match) encryption context to decrypt the data. An encryption context is optional when encrypting with a symmetric CMK, but it is highly recommended. For more information, see Encryption Context in the AWS Key Management Service Developer Guide.
    */
  var EncryptionContext: js.UndefOr[EncryptionContextType] = js.native
  
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.native
  
  /**
    * The identifier of the symmetric customer master key (CMK) that encrypts the data key. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: KeyIdType = js.native
  
  /**
    * The length of the data key. Use AES_128 to generate a 128-bit symmetric key, or AES_256 to generate a 256-bit symmetric key.
    */
  var KeySpec: js.UndefOr[DataKeySpec] = js.native
  
  /**
    * The length of the data key in bytes. For example, use the value 64 to generate a 512-bit data key (64 bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use the KeySpec field instead of this one.
    */
  var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.native
}
object GenerateDataKeyWithoutPlaintextRequest {
  
  @scala.inline
  def apply(KeyId: KeyIdType): GenerateDataKeyWithoutPlaintextRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateDataKeyWithoutPlaintextRequest]
  }
  
  @scala.inline
  implicit class GenerateDataKeyWithoutPlaintextRequestOps[Self <: GenerateDataKeyWithoutPlaintextRequest] (val x: Self) extends AnyVal {
    
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
    def setEncryptionContext(value: EncryptionContextType): Self = this.set("EncryptionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionContext: Self = this.set("EncryptionContext", js.undefined)
    
    @scala.inline
    def setGrantTokensVarargs(value: GrantTokenType*): Self = this.set("GrantTokens", js.Array(value :_*))
    
    @scala.inline
    def setGrantTokens(value: GrantTokenList): Self = this.set("GrantTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantTokens: Self = this.set("GrantTokens", js.undefined)
    
    @scala.inline
    def setKeySpec(value: DataKeySpec): Self = this.set("KeySpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySpec: Self = this.set("KeySpec", js.undefined)
    
    @scala.inline
    def setNumberOfBytes(value: NumberOfBytesType): Self = this.set("NumberOfBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfBytes: Self = this.set("NumberOfBytes", js.undefined)
  }
}
