package typingsSlinky.awsSdkClientKmsBrowser.retireGrantExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantIdExceptionMod.InvalidGrantIdException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidGrantIdExceptionMod.InvalidGrantIdException
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait RetireGrantExceptionsUnion extends js.Object

object RetireGrantExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidGrantIdException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidGrantTokenException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): RetireGrantExceptionsUnion = value.asInstanceOf[RetireGrantExceptionsUnion]
}

