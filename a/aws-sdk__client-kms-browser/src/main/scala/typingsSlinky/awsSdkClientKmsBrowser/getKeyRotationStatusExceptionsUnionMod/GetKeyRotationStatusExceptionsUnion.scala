package typingsSlinky.awsSdkClientKmsBrowser.getKeyRotationStatusExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
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
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
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

