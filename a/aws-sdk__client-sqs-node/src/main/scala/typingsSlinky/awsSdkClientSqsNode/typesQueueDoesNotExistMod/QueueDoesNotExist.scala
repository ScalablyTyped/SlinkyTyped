package typingsSlinky.awsSdkClientSqsNode.typesQueueDoesNotExistMod

import typingsSlinky.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueDoesNotExist
  extends ServiceException[QueueDoesNotExistDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDoesNotExist: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist = js.native
}

object QueueDoesNotExist {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: QueueDoesNotExistDetails,
    message: String,
    name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist
  ): QueueDoesNotExist = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueDoesNotExist]
  }
  @scala.inline
  implicit class QueueDoesNotExistOps[Self <: QueueDoesNotExist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

