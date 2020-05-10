package typingsSlinky.awsSdkClientSqsNode.typesQueueNameExistsMod

import typingsSlinky.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueNameExists
  extends ServiceException[QueueNameExistsDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueNameExists: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists = js.native
}

object QueueNameExists {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: QueueNameExistsDetails,
    message: String,
    name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists
  ): QueueNameExists = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueNameExists]
  }
  @scala.inline
  implicit class QueueNameExistsOps[Self <: QueueNameExists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

