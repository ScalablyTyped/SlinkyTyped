package typingsSlinky.awsSdkClientKmsNode.updateKeyDescriptionExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait UpdateKeyDescriptionExceptionsUnion extends js.Object

object UpdateKeyDescriptionExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): UpdateKeyDescriptionExceptionsUnion = value.asInstanceOf[UpdateKeyDescriptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): UpdateKeyDescriptionExceptionsUnion = value.asInstanceOf[UpdateKeyDescriptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): UpdateKeyDescriptionExceptionsUnion = value.asInstanceOf[UpdateKeyDescriptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): UpdateKeyDescriptionExceptionsUnion = value.asInstanceOf[UpdateKeyDescriptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): UpdateKeyDescriptionExceptionsUnion = value.asInstanceOf[UpdateKeyDescriptionExceptionsUnion]
}

