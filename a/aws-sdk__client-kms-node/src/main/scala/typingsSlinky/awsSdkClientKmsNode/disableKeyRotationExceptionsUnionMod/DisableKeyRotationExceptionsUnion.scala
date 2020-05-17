package typingsSlinky.awsSdkClientKmsNode.disableKeyRotationExceptionsUnionMod

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
trait DisableKeyRotationExceptionsUnion extends js.Object

object DisableKeyRotationExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): DisableKeyRotationExceptionsUnion = value.asInstanceOf[DisableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: DisabledException): DisableKeyRotationExceptionsUnion = value.asInstanceOf[DisableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): DisableKeyRotationExceptionsUnion = value.asInstanceOf[DisableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): DisableKeyRotationExceptionsUnion = value.asInstanceOf[DisableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): DisableKeyRotationExceptionsUnion = value.asInstanceOf[DisableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DisableKeyRotationExceptionsUnion = value.asInstanceOf[DisableKeyRotationExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperationException): DisableKeyRotationExceptionsUnion = value.asInstanceOf[DisableKeyRotationExceptionsUnion]
}

