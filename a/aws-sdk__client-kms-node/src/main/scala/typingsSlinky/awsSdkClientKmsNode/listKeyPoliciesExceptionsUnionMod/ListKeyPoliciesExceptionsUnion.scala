package typingsSlinky.awsSdkClientKmsNode.listKeyPoliciesExceptionsUnionMod

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
trait ListKeyPoliciesExceptionsUnion extends js.Object

object ListKeyPoliciesExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): ListKeyPoliciesExceptionsUnion = value.asInstanceOf[ListKeyPoliciesExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): ListKeyPoliciesExceptionsUnion = value.asInstanceOf[ListKeyPoliciesExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): ListKeyPoliciesExceptionsUnion = value.asInstanceOf[ListKeyPoliciesExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): ListKeyPoliciesExceptionsUnion = value.asInstanceOf[ListKeyPoliciesExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): ListKeyPoliciesExceptionsUnion = value.asInstanceOf[ListKeyPoliciesExceptionsUnion]
}

