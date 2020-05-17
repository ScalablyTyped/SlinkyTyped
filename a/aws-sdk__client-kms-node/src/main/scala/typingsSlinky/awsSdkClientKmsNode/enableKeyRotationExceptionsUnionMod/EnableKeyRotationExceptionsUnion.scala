package typingsSlinky.awsSdkClientKmsNode.enableKeyRotationExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import typingsSlinky.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
*/
trait EnableKeyRotationExceptionsUnion extends js.Object

object EnableKeyRotationExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): EnableKeyRotationExceptionsUnion = value.asInstanceOf[EnableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: DisabledException): EnableKeyRotationExceptionsUnion = value.asInstanceOf[EnableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): EnableKeyRotationExceptionsUnion = value.asInstanceOf[EnableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): EnableKeyRotationExceptionsUnion = value.asInstanceOf[EnableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): EnableKeyRotationExceptionsUnion = value.asInstanceOf[EnableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): EnableKeyRotationExceptionsUnion = value.asInstanceOf[EnableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperationException): EnableKeyRotationExceptionsUnion = value.asInstanceOf[EnableKeyRotationExceptionsUnion]
}

