package typingsSlinky.awsSdkClientKmsBrowser.listRetirableGrantsExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
*/
trait ListRetirableGrantsExceptionsUnion extends js.Object

object ListRetirableGrantsExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): ListRetirableGrantsExceptionsUnion = value.asInstanceOf[ListRetirableGrantsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): ListRetirableGrantsExceptionsUnion = value.asInstanceOf[ListRetirableGrantsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidMarkerException): ListRetirableGrantsExceptionsUnion = value.asInstanceOf[ListRetirableGrantsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): ListRetirableGrantsExceptionsUnion = value.asInstanceOf[ListRetirableGrantsExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): ListRetirableGrantsExceptionsUnion = value.asInstanceOf[ListRetirableGrantsExceptionsUnion]
}

