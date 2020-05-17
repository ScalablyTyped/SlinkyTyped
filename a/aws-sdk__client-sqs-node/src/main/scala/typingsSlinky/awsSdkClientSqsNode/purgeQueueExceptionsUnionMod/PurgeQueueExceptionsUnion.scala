package typingsSlinky.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod

import typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress
import typingsSlinky.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist
  - typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress
*/
trait PurgeQueueExceptionsUnion extends js.Object

object PurgeQueueExceptionsUnion {
  @scala.inline
  implicit def apply(value: PurgeQueueInProgress): PurgeQueueExceptionsUnion = value.asInstanceOf[PurgeQueueExceptionsUnion]
  @scala.inline
  implicit def apply(value: QueueDoesNotExist): PurgeQueueExceptionsUnion = value.asInstanceOf[PurgeQueueExceptionsUnion]
}

