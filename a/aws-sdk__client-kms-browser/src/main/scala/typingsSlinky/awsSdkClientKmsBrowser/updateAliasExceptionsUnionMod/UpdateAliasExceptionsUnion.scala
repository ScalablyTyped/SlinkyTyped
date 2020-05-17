package typingsSlinky.awsSdkClientKmsBrowser.updateAliasExceptionsUnionMod

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

