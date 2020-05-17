package typingsSlinky.awsSdkClientKmsBrowser.listGrantsExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait ListGrantsExceptionsUnion extends js.Object

object ListGrantsExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): ListGrantsExceptionsUnion = value.asInstanceOf[ListGrantsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): ListGrantsExceptionsUnion = value.asInstanceOf[ListGrantsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidMarkerException): ListGrantsExceptionsUnion = value.asInstanceOf[ListGrantsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): ListGrantsExceptionsUnion = value.asInstanceOf[ListGrantsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): ListGrantsExceptionsUnion = value.asInstanceOf[ListGrantsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): ListGrantsExceptionsUnion = value.asInstanceOf[ListGrantsExceptionsUnion]
}

