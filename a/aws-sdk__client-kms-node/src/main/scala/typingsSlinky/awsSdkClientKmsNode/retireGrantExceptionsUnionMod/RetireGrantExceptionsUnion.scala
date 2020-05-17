package typingsSlinky.awsSdkClientKmsNode.retireGrantExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantIdExceptionMod.InvalidGrantIdException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantIdExceptionMod.InvalidGrantIdException
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait RetireGrantExceptionsUnion extends js.Object

object RetireGrantExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidGrantIdException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidGrantTokenException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
}

