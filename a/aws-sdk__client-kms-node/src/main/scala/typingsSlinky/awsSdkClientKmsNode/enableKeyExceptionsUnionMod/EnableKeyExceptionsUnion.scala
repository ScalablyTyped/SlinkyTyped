package typingsSlinky.awsSdkClientKmsNode.enableKeyExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

