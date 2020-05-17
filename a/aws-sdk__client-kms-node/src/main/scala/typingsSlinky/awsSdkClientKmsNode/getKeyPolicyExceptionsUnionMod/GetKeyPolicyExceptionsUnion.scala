package typingsSlinky.awsSdkClientKmsNode.getKeyPolicyExceptionsUnionMod

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
trait GetKeyPolicyExceptionsUnion extends js.Object

object GetKeyPolicyExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): GetKeyPolicyExceptionsUnion = value.asInstanceOf[GetKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): GetKeyPolicyExceptionsUnion = value.asInstanceOf[GetKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): GetKeyPolicyExceptionsUnion = value.asInstanceOf[GetKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): GetKeyPolicyExceptionsUnion = value.asInstanceOf[GetKeyPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): GetKeyPolicyExceptionsUnion = value.asInstanceOf[GetKeyPolicyExceptionsUnion]
}

