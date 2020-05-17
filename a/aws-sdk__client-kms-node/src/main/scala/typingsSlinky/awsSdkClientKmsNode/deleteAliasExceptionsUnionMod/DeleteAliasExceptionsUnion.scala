package typingsSlinky.awsSdkClientKmsNode.deleteAliasExceptionsUnionMod

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
trait DeleteAliasExceptionsUnion extends js.Object

object DeleteAliasExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): DeleteAliasExceptionsUnion = value.asInstanceOf[DeleteAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): DeleteAliasExceptionsUnion = value.asInstanceOf[DeleteAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): DeleteAliasExceptionsUnion = value.asInstanceOf[DeleteAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DeleteAliasExceptionsUnion = value.asInstanceOf[DeleteAliasExceptionsUnion]
}

