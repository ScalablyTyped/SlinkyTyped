package typingsSlinky.awsSdkClientKmsNode.listKeysExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
*/
trait ListKeysExceptionsUnion extends js.Object

object ListKeysExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): ListKeysExceptionsUnion = value.asInstanceOf[ListKeysExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidMarkerException): ListKeysExceptionsUnion = value.asInstanceOf[ListKeysExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): ListKeysExceptionsUnion = value.asInstanceOf[ListKeysExceptionsUnion]
}

