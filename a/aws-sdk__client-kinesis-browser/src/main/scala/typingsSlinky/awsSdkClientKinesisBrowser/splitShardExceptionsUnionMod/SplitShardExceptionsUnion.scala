package typingsSlinky.awsSdkClientKinesisBrowser.splitShardExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
*/
trait SplitShardExceptionsUnion extends js.Object

object SplitShardExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): SplitShardExceptionsUnion = value.asInstanceOf[SplitShardExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): SplitShardExceptionsUnion = value.asInstanceOf[SplitShardExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): SplitShardExceptionsUnion = value.asInstanceOf[SplitShardExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): SplitShardExceptionsUnion = value.asInstanceOf[SplitShardExceptionsUnion]
}

