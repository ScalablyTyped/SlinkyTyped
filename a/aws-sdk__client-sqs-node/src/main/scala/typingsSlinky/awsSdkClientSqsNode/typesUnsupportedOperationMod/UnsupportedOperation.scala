package typingsSlinky.awsSdkClientSqsNode.typesUnsupportedOperationMod

import typingsSlinky.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.sendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsupportedOperation
  extends ServiceException[UnsupportedOperationDetails]
     with SendMessageBatchExceptionsUnion
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_UnsupportedOperation: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation = js.native
}

