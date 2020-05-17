package typingsSlinky.awsSdkClientKmsNode.listGrantsExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

