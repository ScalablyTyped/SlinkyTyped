package typingsSlinky.awsSdkClientKmsNode.getKeyRotationStatusExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
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
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientKmsNode.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
*/
trait GetKeyRotationStatusExceptionsUnion extends js.Object

object GetKeyRotationStatusExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): GetKeyRotationStatusExceptionsUnion = value.asInstanceOf[GetKeyRotationStatusExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): GetKeyRotationStatusExceptionsUnion = value.asInstanceOf[GetKeyRotationStatusExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): GetKeyRotationStatusExceptionsUnion = value.asInstanceOf[GetKeyRotationStatusExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): GetKeyRotationStatusExceptionsUnion = value.asInstanceOf[GetKeyRotationStatusExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetKeyRotationStatusExceptionsUnion = value.asInstanceOf[GetKeyRotationStatusExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedOperationException): GetKeyRotationStatusExceptionsUnion = value.asInstanceOf[GetKeyRotationStatusExceptionsUnion]
}

