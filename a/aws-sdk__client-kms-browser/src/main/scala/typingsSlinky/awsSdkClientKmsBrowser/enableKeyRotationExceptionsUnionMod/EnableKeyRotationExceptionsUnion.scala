package typingsSlinky.awsSdkClientKmsBrowser.enableKeyRotationExceptionsUnionMod

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

