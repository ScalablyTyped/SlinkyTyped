package typingsSlinky.awsSdkClientSqsNode.createQueueExceptionsUnionMod

import typingsSlinky.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently
import typingsSlinky.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently
  - typingsSlinky.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists
*/
trait CreateQueueExceptionsUnion extends js.Object

object CreateQueueExceptionsUnion {
  @scala.inline
  implicit def apply(value: QueueDeletedRecently): CreateQueueExceptionsUnion = value.asInstanceOf[CreateQueueExceptionsUnion]
  @scala.inline
  implicit def apply(value: QueueNameExists): CreateQueueExceptionsUnion = value.asInstanceOf[CreateQueueExceptionsUnion]
}

