package typingsSlinky.awsSdkClientKmsBrowser.tagResourceExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
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
  - typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException
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

