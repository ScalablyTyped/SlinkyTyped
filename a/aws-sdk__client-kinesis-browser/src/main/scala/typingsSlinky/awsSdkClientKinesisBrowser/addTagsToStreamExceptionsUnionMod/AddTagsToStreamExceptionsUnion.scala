package typingsSlinky.awsSdkClientKinesisBrowser.addTagsToStreamExceptionsUnionMod

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
trait AddTagsToStreamExceptionsUnion extends js.Object

object AddTagsToStreamExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): AddTagsToStreamExceptionsUnion = value.asInstanceOf[AddTagsToStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): AddTagsToStreamExceptionsUnion = value.asInstanceOf[AddTagsToStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): AddTagsToStreamExceptionsUnion = value.asInstanceOf[AddTagsToStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): AddTagsToStreamExceptionsUnion = value.asInstanceOf[AddTagsToStreamExceptionsUnion]
}

