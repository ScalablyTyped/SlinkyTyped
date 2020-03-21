package typingsSlinky.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod

import typingsSlinky.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptHandleIsInvalid
  extends ServiceException[ReceiptHandleIsInvalidDetails]
     with ChangeMessageVisibilityExceptionsUnion
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_ReceiptHandleIsInvalid: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid = js.native
}

