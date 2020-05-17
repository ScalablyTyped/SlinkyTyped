package typingsSlinky.awsSdkClientKinesisBrowser.stopStreamEncryptionExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
*/
trait StopStreamEncryptionExceptionsUnion extends js.Object

object StopStreamEncryptionExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): StopStreamEncryptionExceptionsUnion = value.asInstanceOf[StopStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): StopStreamEncryptionExceptionsUnion = value.asInstanceOf[StopStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): StopStreamEncryptionExceptionsUnion = value.asInstanceOf[StopStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): StopStreamEncryptionExceptionsUnion = value.asInstanceOf[StopStreamEncryptionExceptionsUnion]
}

