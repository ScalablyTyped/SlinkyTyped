package typingsSlinky.awsSdkClientKmsNode.revokeGrantExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantIdExceptionMod.InvalidGrantIdException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantIdExceptionMod.InvalidGrantIdException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

