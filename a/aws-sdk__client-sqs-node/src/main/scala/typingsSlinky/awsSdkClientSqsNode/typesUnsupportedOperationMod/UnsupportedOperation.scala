package typingsSlinky.awsSdkClientSqsNode.typesUnsupportedOperationMod

import typingsSlinky.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.sendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedOperation
  extends ServiceException[UnsupportedOperationDetails]
     with SendMessageBatchExceptionsUnion
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_UnsupportedOperation: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation
}

object UnsupportedOperation {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: UnsupportedOperationDetails,
    message: String,
    name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation,
    stack: String = null
  ): UnsupportedOperation = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOperation]
  }
}

