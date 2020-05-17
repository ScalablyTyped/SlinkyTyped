package typingsSlinky.awsSdkClientSqsNode.sendMessageExceptionsUnionMod

import typingsSlinky.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents
import typingsSlinky.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents
  - typingsSlinky.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation
*/
trait SendMessageExceptionsUnion extends js.Object

object SendMessageExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidMessageContents): SendMessageExceptionsUnion = value.asInstanceOf[SendMessageExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperation): SendMessageExceptionsUnion = value.asInstanceOf[SendMessageExceptionsUnion]
}

