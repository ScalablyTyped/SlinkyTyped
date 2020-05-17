package typingsSlinky.awsSdkClientKmsBrowser.createGrantExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
  - typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait CreateGrantExceptionsUnion extends js.Object

object CreateGrantExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): CreateGrantExceptionsUnion = value.asInstanceOf[CreateGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: DisabledException): CreateGrantExceptionsUnion = value.asInstanceOf[CreateGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): CreateGrantExceptionsUnion = value.asInstanceOf[CreateGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidGrantTokenException): CreateGrantExceptionsUnion = value.asInstanceOf[CreateGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): CreateGrantExceptionsUnion = value.asInstanceOf[CreateGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): CreateGrantExceptionsUnion = value.asInstanceOf[CreateGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): CreateGrantExceptionsUnion = value.asInstanceOf[CreateGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): CreateGrantExceptionsUnion = value.asInstanceOf[CreateGrantExceptionsUnion]
}

