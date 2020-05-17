package typingsSlinky.awsSdkClientKmsBrowser.listKeyPoliciesExceptionsUnionMod

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

