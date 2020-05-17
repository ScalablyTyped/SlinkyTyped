package typingsSlinky.awsSdkClientKmsNode.untagResourceExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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
  - typingsSlinky.awsSdkClientKmsNode.typesTagExceptionMod.TagException
*/
trait UntagResourceExceptionsUnion extends js.Object

object UntagResourceExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArnException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
  @scala.inline
  implicit def apply(value: TagException): UntagResourceExceptionsUnion = value.asInstanceOf[UntagResourceExceptionsUnion]
}

