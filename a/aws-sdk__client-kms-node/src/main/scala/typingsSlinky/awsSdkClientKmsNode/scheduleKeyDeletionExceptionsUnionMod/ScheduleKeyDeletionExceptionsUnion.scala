package typingsSlinky.awsSdkClientKmsNode.scheduleKeyDeletionExceptionsUnionMod

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
trait ScheduleKeyDeletionExceptionsUnion extends js.Object

object ScheduleKeyDeletionExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): ScheduleKeyDeletionExceptionsUnion = value.asInstanceOf[ScheduleKeyDeletionExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): ScheduleKeyDeletionExceptionsUnion = value.asInstanceOf[ScheduleKeyDeletionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): ScheduleKeyDeletionExceptionsUnion = value.asInstanceOf[ScheduleKeyDeletionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): ScheduleKeyDeletionExceptionsUnion = value.asInstanceOf[ScheduleKeyDeletionExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): ScheduleKeyDeletionExceptionsUnion = value.asInstanceOf[ScheduleKeyDeletionExceptionsUnion]
}

