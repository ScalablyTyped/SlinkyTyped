package typingsSlinky.awsSdkClientSqsNode.typesQueueDoesNotExistMod

import typingsSlinky.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
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

