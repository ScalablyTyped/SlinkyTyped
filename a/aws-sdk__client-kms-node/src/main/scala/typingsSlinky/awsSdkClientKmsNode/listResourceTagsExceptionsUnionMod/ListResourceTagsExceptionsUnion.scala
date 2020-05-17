package typingsSlinky.awsSdkClientKmsNode.listResourceTagsExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
*/
trait ListResourceTagsExceptionsUnion extends js.Object

object ListResourceTagsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArnException): ListResourceTagsExceptionsUnion = value.asInstanceOf[ListResourceTagsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidMarkerException): ListResourceTagsExceptionsUnion = value.asInstanceOf[ListResourceTagsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): ListResourceTagsExceptionsUnion = value.asInstanceOf[ListResourceTagsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): ListResourceTagsExceptionsUnion = value.asInstanceOf[ListResourceTagsExceptionsUnion]
}

