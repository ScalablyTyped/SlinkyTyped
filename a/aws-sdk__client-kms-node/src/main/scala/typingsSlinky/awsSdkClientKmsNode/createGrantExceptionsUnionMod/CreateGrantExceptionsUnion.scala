package typingsSlinky.awsSdkClientKmsNode.createGrantExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
  - typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

