package typingsSlinky.awsSdkClientKmsBrowser.disableKeyExceptionsUnionMod

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

