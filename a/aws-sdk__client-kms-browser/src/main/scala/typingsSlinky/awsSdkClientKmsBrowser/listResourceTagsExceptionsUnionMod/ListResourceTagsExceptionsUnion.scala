package typingsSlinky.awsSdkClientKmsBrowser.listResourceTagsExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
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

