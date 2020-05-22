package typingsSlinky.awsSdkClientSqsNode.typesBatchRequestTooLongMod

import typingsSlinky.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRequestTooLong
  extends ServiceException[BatchRequestTooLongDetails]
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_BatchRequestTooLong: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong
}

object BatchRequestTooLong {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BatchRequestTooLongDetails,
    message: String,
    name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong,
    stack: String = null
  ): BatchRequestTooLong = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequestTooLong]
  }
}

