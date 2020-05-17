package typingsSlinky.awsSdkClientKmsBrowser.getKeyPolicyExceptionsUnionMod

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

