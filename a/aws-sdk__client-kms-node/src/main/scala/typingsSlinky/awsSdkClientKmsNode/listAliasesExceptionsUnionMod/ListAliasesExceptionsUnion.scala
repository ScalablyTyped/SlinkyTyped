package typingsSlinky.awsSdkClientKmsNode.listAliasesExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
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

