package typingsSlinky.awsSdkClientKmsBrowser.untagResourceExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import typingsSlinky.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException
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

