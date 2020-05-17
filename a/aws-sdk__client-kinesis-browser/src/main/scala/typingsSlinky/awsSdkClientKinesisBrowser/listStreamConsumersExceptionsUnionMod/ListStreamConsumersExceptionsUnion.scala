package typingsSlinky.awsSdkClientKinesisBrowser.listStreamConsumersExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod.ExpiredNextTokenException
import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod.ExpiredNextTokenException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
*/
trait ListStreamConsumersExceptionsUnion extends js.Object

object ListStreamConsumersExceptionsUnion {
  @scala.inline
  implicit def apply(value: ExpiredNextTokenException): ListStreamConsumersExceptionsUnion = value.asInstanceOf[ListStreamConsumersExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArgumentException): ListStreamConsumersExceptionsUnion = value.asInstanceOf[ListStreamConsumersExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): ListStreamConsumersExceptionsUnion = value.asInstanceOf[ListStreamConsumersExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): ListStreamConsumersExceptionsUnion = value.asInstanceOf[ListStreamConsumersExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListStreamConsumersExceptionsUnion = value.asInstanceOf[ListStreamConsumersExceptionsUnion]
}

