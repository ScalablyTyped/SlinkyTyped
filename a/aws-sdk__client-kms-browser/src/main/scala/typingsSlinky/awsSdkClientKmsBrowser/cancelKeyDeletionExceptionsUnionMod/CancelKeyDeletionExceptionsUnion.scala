package typingsSlinky.awsSdkClientKmsBrowser.cancelKeyDeletionExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait CancelKeyDeletionExceptionsUnion extends js.Object

object CancelKeyDeletionExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): CancelKeyDeletionExceptionsUnion = value.asInstanceOf[CancelKeyDeletionExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): CancelKeyDeletionExceptionsUnion = value.asInstanceOf[CancelKeyDeletionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): CancelKeyDeletionExceptionsUnion = value.asInstanceOf[CancelKeyDeletionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): CancelKeyDeletionExceptionsUnion = value.asInstanceOf[CancelKeyDeletionExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): CancelKeyDeletionExceptionsUnion = value.asInstanceOf[CancelKeyDeletionExceptionsUnion]
}

