package typingsSlinky.awsSdkClientKinesisBrowser.enableEnhancedMonitoringExceptionsUnionMod

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
trait EnableEnhancedMonitoringExceptionsUnion extends js.Object

object EnableEnhancedMonitoringExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): EnableEnhancedMonitoringExceptionsUnion = value.asInstanceOf[EnableEnhancedMonitoringExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): EnableEnhancedMonitoringExceptionsUnion = value.asInstanceOf[EnableEnhancedMonitoringExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): EnableEnhancedMonitoringExceptionsUnion = value.asInstanceOf[EnableEnhancedMonitoringExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): EnableEnhancedMonitoringExceptionsUnion = value.asInstanceOf[EnableEnhancedMonitoringExceptionsUnion]
}

