package typingsSlinky.awsSdkClientKmsNode.listRetirableGrantsExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
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

