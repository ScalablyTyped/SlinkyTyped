package typingsSlinky.awsSdkClientKmsNode.tagResourceExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import typingsSlinky.awsSdkClientKmsNode.typesTagExceptionMod.TagException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsNode.typesTagExceptionMod.TagException
*/
trait TagResourceExceptionsUnion extends js.Object

object TagResourceExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArnException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: TagException): TagResourceExceptionsUnion = value.asInstanceOf[TagResourceExceptionsUnion]
}

