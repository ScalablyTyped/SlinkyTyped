package typingsSlinky.awsSdkClientKmsBrowser.listAliasesExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
*/
trait ListAliasesExceptionsUnion extends js.Object

object ListAliasesExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): ListAliasesExceptionsUnion = value.asInstanceOf[ListAliasesExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidMarkerException): ListAliasesExceptionsUnion = value.asInstanceOf[ListAliasesExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): ListAliasesExceptionsUnion = value.asInstanceOf[ListAliasesExceptionsUnion]
}

