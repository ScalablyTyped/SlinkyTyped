package typingsSlinky.awsSdkClientKmsNode.cancelKeyDeletionExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

