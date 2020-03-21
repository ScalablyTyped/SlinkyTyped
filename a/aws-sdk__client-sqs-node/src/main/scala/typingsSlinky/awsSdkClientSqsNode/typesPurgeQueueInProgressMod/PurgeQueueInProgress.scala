package typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInProgressMod

import typingsSlinky.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurgeQueueInProgress
  extends ServiceException[PurgeQueueInProgressDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_PurgeQueueInProgress: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress = js.native
}

