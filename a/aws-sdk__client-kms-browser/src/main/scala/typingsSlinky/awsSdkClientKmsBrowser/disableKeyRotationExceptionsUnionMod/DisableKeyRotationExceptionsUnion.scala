package typingsSlinky.awsSdkClientKmsBrowser.disableKeyRotationExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
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

