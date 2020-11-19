package typingsSlinky.awsSdkClientSqsNode.typesUnsupportedOperationMod

import typingsSlinky.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.sendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsupportedOperation
  extends ServiceException[UnsupportedOperationDetails]
     with SendMessageBatchExceptionsUnion
     with SendMessageExceptionsUnion {
  
  @JSName("name")
  var name_UnsupportedOperation: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation = js.native
}
object UnsupportedOperation {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: UnsupportedOperationDetails,
    message: String,
    name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation
  ): UnsupportedOperation = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOperation]
  }
  
  @scala.inline
  implicit class UnsupportedOperationOps[Self <: UnsupportedOperation] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
