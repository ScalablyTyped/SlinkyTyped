package typingsSlinky.awsSdkClientKmsBrowser.updateKeyDescriptionExceptionsUnionMod

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
trait UpdateKeyDescriptionExceptionsUnion extends js.Object

object UpdateKeyDescriptionExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): UpdateKeyDescriptionExceptionsUnion = value.asInstanceOf[UpdateKeyDescriptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): UpdateKeyDescriptionExceptionsUnion = value.asInstanceOf[UpdateKeyDescriptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): UpdateKeyDescriptionExceptionsUnion = value.asInstanceOf[UpdateKeyDescriptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): UpdateKeyDescriptionExceptionsUnion = value.asInstanceOf[UpdateKeyDescriptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateKeyDescriptionExceptionsUnion = value.asInstanceOf[UpdateKeyDescriptionExceptionsUnion]
}

