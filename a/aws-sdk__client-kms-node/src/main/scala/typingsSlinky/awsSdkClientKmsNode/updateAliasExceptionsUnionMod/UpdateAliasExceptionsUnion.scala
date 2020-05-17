package typingsSlinky.awsSdkClientKmsNode.updateAliasExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait UpdateAliasExceptionsUnion extends js.Object

object UpdateAliasExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): UpdateAliasExceptionsUnion = value.asInstanceOf[UpdateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): UpdateAliasExceptionsUnion = value.asInstanceOf[UpdateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): UpdateAliasExceptionsUnion = value.asInstanceOf[UpdateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateAliasExceptionsUnion = value.asInstanceOf[UpdateAliasExceptionsUnion]
}

