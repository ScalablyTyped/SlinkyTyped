package typingsSlinky.awsSdkClientKinesisBrowser.createStreamExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
*/
trait CreateStreamExceptionsUnion extends js.Object

object CreateStreamExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): CreateStreamExceptionsUnion = value.asInstanceOf[CreateStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): CreateStreamExceptionsUnion = value.asInstanceOf[CreateStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): CreateStreamExceptionsUnion = value.asInstanceOf[CreateStreamExceptionsUnion]
}

