package typingsSlinky.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod

import typingsSlinky.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat
import typingsSlinky.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat
  - typingsSlinky.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
*/
trait DeleteMessageExceptionsUnion extends js.Object

object DeleteMessageExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidIdFormat): DeleteMessageExceptionsUnion = value.asInstanceOf[DeleteMessageExceptionsUnion]
  @scala.inline
  implicit def apply(value: ReceiptHandleIsInvalid): DeleteMessageExceptionsUnion = value.asInstanceOf[DeleteMessageExceptionsUnion]
}

