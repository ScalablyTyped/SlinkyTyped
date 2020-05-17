package typingsSlinky.awsSdkClientKmsNode.disableKeyExceptionsUnionMod

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
trait DisableKeyExceptionsUnion extends js.Object

object DisableKeyExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): DisableKeyExceptionsUnion = value.asInstanceOf[DisableKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): DisableKeyExceptionsUnion = value.asInstanceOf[DisableKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): DisableKeyExceptionsUnion = value.asInstanceOf[DisableKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): DisableKeyExceptionsUnion = value.asInstanceOf[DisableKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DisableKeyExceptionsUnion = value.asInstanceOf[DisableKeyExceptionsUnion]
}

