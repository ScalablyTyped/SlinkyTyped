package typingsSlinky.awsSdkClientKinesisBrowser.decreaseStreamRetentionPeriodExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
*/
trait DecreaseStreamRetentionPeriodExceptionsUnion extends js.Object

object DecreaseStreamRetentionPeriodExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): DecreaseStreamRetentionPeriodExceptionsUnion = value.asInstanceOf[DecreaseStreamRetentionPeriodExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): DecreaseStreamRetentionPeriodExceptionsUnion = value.asInstanceOf[DecreaseStreamRetentionPeriodExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): DecreaseStreamRetentionPeriodExceptionsUnion = value.asInstanceOf[DecreaseStreamRetentionPeriodExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DecreaseStreamRetentionPeriodExceptionsUnion = value.asInstanceOf[DecreaseStreamRetentionPeriodExceptionsUnion]
}

