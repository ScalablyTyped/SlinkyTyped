package typingsSlinky.awsSdkClientSqsNode.typesBatchRequestTooLongMod

import typingsSlinky.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRequestTooLong
  extends ServiceException[BatchRequestTooLongDetails]
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_BatchRequestTooLong: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong = js.native
}

object BatchRequestTooLong {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BatchRequestTooLongDetails,
    message: String,
    name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong
  ): BatchRequestTooLong = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequestTooLong]
  }
  @scala.inline
  implicit class BatchRequestTooLongOps[Self <: BatchRequestTooLong] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

