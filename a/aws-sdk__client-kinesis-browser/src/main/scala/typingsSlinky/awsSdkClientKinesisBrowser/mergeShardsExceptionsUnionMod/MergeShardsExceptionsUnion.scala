package typingsSlinky.awsSdkClientKinesisBrowser.mergeShardsExceptionsUnionMod

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
trait MergeShardsExceptionsUnion extends js.Object

object MergeShardsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): MergeShardsExceptionsUnion = value.asInstanceOf[MergeShardsExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): MergeShardsExceptionsUnion = value.asInstanceOf[MergeShardsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): MergeShardsExceptionsUnion = value.asInstanceOf[MergeShardsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): MergeShardsExceptionsUnion = value.asInstanceOf[MergeShardsExceptionsUnion]
}

