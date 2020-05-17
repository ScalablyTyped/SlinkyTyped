package typingsSlinky.awsSdkClientKmsNode.createAliasExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod.AlreadyExistsException
import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod.InvalidAliasNameException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod.AlreadyExistsException
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod.InvalidAliasNameException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
*/
trait CreateAliasExceptionsUnion extends js.Object

object CreateAliasExceptionsUnion {
  @scala.inline
  implicit def apply(value: AlreadyExistsException): CreateAliasExceptionsUnion = value.asInstanceOf[CreateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): CreateAliasExceptionsUnion = value.asInstanceOf[CreateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidAliasNameException): CreateAliasExceptionsUnion = value.asInstanceOf[CreateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): CreateAliasExceptionsUnion = value.asInstanceOf[CreateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): CreateAliasExceptionsUnion = value.asInstanceOf[CreateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): CreateAliasExceptionsUnion = value.asInstanceOf[CreateAliasExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): CreateAliasExceptionsUnion = value.asInstanceOf[CreateAliasExceptionsUnion]
}

