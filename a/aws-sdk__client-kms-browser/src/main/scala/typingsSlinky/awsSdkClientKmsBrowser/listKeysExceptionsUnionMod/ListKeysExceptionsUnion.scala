package typingsSlinky.awsSdkClientKmsBrowser.listKeysExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
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

