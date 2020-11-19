package typingsSlinky.awsSdkClientKmsNode.typesDisabledExceptionMod

import typingsSlinky.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisabledException
  extends ServiceException[DisabledExceptionDetails]
     with CreateGrantExceptionsUnion
     with DecryptExceptionsUnion
     with DisableKeyRotationExceptionsUnion
     with EnableKeyRotationExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion {
  
  @JSName("name")
  var name_DisabledException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException = js.native
}
object DisabledException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DisabledExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException
  ): DisabledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledException]
  }
  
  @scala.inline
  implicit class DisabledExceptionOps[Self <: DisabledException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
