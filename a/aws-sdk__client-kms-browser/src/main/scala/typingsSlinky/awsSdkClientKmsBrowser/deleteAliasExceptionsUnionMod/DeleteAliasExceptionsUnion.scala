package typingsSlinky.awsSdkClientKmsBrowser.deleteAliasExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

