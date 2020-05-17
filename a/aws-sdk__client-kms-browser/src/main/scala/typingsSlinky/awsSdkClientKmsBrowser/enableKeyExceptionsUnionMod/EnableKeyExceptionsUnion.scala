package typingsSlinky.awsSdkClientKmsBrowser.enableKeyExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait EnableKeyExceptionsUnion extends js.Object

object EnableKeyExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): EnableKeyExceptionsUnion = value.asInstanceOf[EnableKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): EnableKeyExceptionsUnion = value.asInstanceOf[EnableKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): EnableKeyExceptionsUnion = value.asInstanceOf[EnableKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): EnableKeyExceptionsUnion = value.asInstanceOf[EnableKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): EnableKeyExceptionsUnion = value.asInstanceOf[EnableKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): EnableKeyExceptionsUnion = value.asInstanceOf[EnableKeyExceptionsUnion]
}

