package typingsSlinky.awsSdkClientKinesisBrowser.removeTagsFromStreamExceptionsUnionMod

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
trait RemoveTagsFromStreamExceptionsUnion extends js.Object

object RemoveTagsFromStreamExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): RemoveTagsFromStreamExceptionsUnion = value.asInstanceOf[RemoveTagsFromStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): RemoveTagsFromStreamExceptionsUnion = value.asInstanceOf[RemoveTagsFromStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): RemoveTagsFromStreamExceptionsUnion = value.asInstanceOf[RemoveTagsFromStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): RemoveTagsFromStreamExceptionsUnion = value.asInstanceOf[RemoveTagsFromStreamExceptionsUnion]
}

