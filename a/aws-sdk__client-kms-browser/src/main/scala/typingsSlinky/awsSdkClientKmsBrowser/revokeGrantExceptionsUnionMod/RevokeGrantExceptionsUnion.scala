package typingsSlinky.awsSdkClientKmsBrowser.revokeGrantExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantIdExceptionMod.InvalidGrantIdException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantIdExceptionMod.InvalidGrantIdException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait RevokeGrantExceptionsUnion extends js.Object

object RevokeGrantExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): RevokeGrantExceptionsUnion = value.asInstanceOf[RevokeGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): RevokeGrantExceptionsUnion = value.asInstanceOf[RevokeGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidGrantIdException): RevokeGrantExceptionsUnion = value.asInstanceOf[RevokeGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): RevokeGrantExceptionsUnion = value.asInstanceOf[RevokeGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): RevokeGrantExceptionsUnion = value.asInstanceOf[RevokeGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): RevokeGrantExceptionsUnion = value.asInstanceOf[RevokeGrantExceptionsUnion]
}

