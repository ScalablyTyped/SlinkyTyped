package typingsSlinky.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod

import typingsSlinky.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight
import typingsSlinky.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight
  - typingsSlinky.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
*/
trait ChangeMessageVisibilityExceptionsUnion extends js.Object

object ChangeMessageVisibilityExceptionsUnion {
  @scala.inline
  implicit def apply(value: MessageNotInflight): ChangeMessageVisibilityExceptionsUnion = value.asInstanceOf[ChangeMessageVisibilityExceptionsUnion]
  @scala.inline
  implicit def apply(value: ReceiptHandleIsInvalid): ChangeMessageVisibilityExceptionsUnion = value.asInstanceOf[ChangeMessageVisibilityExceptionsUnion]
}

