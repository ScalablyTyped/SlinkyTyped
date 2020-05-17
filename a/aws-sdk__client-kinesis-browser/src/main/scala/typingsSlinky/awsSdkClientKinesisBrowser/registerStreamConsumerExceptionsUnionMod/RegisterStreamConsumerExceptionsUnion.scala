package typingsSlinky.awsSdkClientKinesisBrowser.registerStreamConsumerExceptionsUnionMod

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
trait RegisterStreamConsumerExceptionsUnion extends js.Object

object RegisterStreamConsumerExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): RegisterStreamConsumerExceptionsUnion = value.asInstanceOf[RegisterStreamConsumerExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): RegisterStreamConsumerExceptionsUnion = value.asInstanceOf[RegisterStreamConsumerExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): RegisterStreamConsumerExceptionsUnion = value.asInstanceOf[RegisterStreamConsumerExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): RegisterStreamConsumerExceptionsUnion = value.asInstanceOf[RegisterStreamConsumerExceptionsUnion]
}

