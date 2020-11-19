package typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyOutputMod

import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateDataKeyOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>The encrypted data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
    */
  var CiphertextBlob: js.UndefOr[js.typedarray.Uint8Array] = js.native
  
  /**
    * <p>The identifier of the CMK under which the data encryption key was generated and encrypted.</p>
    */
  var KeyId: js.UndefOr[String] = js.native
  
  /**
    * <p>The data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded. Use this data key for local encryption and decryption, then remove it from memory as soon as possible.</p>
    */
  var Plaintext: js.UndefOr[js.typedarray.Uint8Array] = js.native
}
object GenerateDataKeyOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GenerateDataKeyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateDataKeyOutput]
  }
  
  @scala.inline
  implicit class GenerateDataKeyOutputOps[Self <: GenerateDataKeyOutput] (val x: Self) extends AnyVal {
    
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextBlob(value: js.typedarray.Uint8Array): Self = this.set("CiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphertextBlob: Self = this.set("CiphertextBlob", js.undefined)
    
    @scala.inline
    def setKeyId(value: String): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    
    @scala.inline
    def setPlaintext(value: js.typedarray.Uint8Array): Self = this.set("Plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaintext: Self = this.set("Plaintext", js.undefined)
  }
}
