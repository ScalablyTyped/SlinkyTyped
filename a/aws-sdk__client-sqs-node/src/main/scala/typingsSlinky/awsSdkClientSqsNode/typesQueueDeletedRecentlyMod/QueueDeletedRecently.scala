package typingsSlinky.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod

import typingsSlinky.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueDeletedRecently
  extends ServiceException[QueueDeletedRecentlyDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDeletedRecently: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDeletedRecently = js.native
}

