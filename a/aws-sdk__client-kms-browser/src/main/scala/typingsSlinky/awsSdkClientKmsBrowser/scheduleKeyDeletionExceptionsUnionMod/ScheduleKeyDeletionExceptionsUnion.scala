package typingsSlinky.awsSdkClientKmsBrowser.scheduleKeyDeletionExceptionsUnionMod

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

