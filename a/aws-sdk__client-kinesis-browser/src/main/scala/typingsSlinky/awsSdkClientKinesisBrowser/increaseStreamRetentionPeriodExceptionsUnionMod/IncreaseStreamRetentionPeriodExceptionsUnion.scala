package typingsSlinky.awsSdkClientKinesisBrowser.increaseStreamRetentionPeriodExceptionsUnionMod

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
trait IncreaseStreamRetentionPeriodExceptionsUnion extends js.Object

object IncreaseStreamRetentionPeriodExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): IncreaseStreamRetentionPeriodExceptionsUnion = value.asInstanceOf[IncreaseStreamRetentionPeriodExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): IncreaseStreamRetentionPeriodExceptionsUnion = value.asInstanceOf[IncreaseStreamRetentionPeriodExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): IncreaseStreamRetentionPeriodExceptionsUnion = value.asInstanceOf[IncreaseStreamRetentionPeriodExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): IncreaseStreamRetentionPeriodExceptionsUnion = value.asInstanceOf[IncreaseStreamRetentionPeriodExceptionsUnion]
}

