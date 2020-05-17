package typingsSlinky.awsSdkClientKinesisBrowser.listTagsForStreamExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
*/
trait ListTagsForStreamExceptionsUnion extends js.Object

object ListTagsForStreamExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): ListTagsForStreamExceptionsUnion = value.asInstanceOf[ListTagsForStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): ListTagsForStreamExceptionsUnion = value.asInstanceOf[ListTagsForStreamExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListTagsForStreamExceptionsUnion = value.asInstanceOf[ListTagsForStreamExceptionsUnion]
}

