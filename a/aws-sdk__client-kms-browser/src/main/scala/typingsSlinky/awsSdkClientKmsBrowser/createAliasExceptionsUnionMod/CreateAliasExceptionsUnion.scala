package typingsSlinky.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesAlreadyExistsExceptionMod.AlreadyExistsException
import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidAliasNameExceptionMod.InvalidAliasNameException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesAlreadyExistsExceptionMod.AlreadyExistsException
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidAliasNameExceptionMod.InvalidAliasNameException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
  - typingsSlinky.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
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

