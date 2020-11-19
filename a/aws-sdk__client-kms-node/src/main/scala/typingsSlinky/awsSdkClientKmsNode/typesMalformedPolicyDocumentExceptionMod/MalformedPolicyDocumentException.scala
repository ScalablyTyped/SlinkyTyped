package typingsSlinky.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod

import typingsSlinky.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MalformedPolicyDocumentException
  extends ServiceException[MalformedPolicyDocumentExceptionDetails]
     with CreateKeyExceptionsUnion
     with PutKeyPolicyExceptionsUnion {
  
  @JSName("name")
  var name_MalformedPolicyDocumentException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.MalformedPolicyDocumentException = js.native
}
object MalformedPolicyDocumentException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MalformedPolicyDocumentExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.MalformedPolicyDocumentException
  ): MalformedPolicyDocumentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MalformedPolicyDocumentException]
  }
  
  @scala.inline
  implicit class MalformedPolicyDocumentExceptionOps[Self <: MalformedPolicyDocumentException] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.MalformedPolicyDocumentException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
