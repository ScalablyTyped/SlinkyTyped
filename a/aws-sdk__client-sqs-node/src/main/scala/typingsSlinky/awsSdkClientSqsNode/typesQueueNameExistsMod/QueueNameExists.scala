package typingsSlinky.awsSdkClientSqsNode.typesQueueNameExistsMod

import typingsSlinky.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
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

