package typingsSlinky.awsSdkClientCodecommitNode.deleteCommentContentExceptionsUnionMod

import typingsSlinky.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException
import typingsSlinky.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException
import typingsSlinky.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException
import typingsSlinky.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException
  - typingsSlinky.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException
  - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException
  - typingsSlinky.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException
*/
trait DeleteCommentContentExceptionsUnion extends js.Object

object DeleteCommentContentExceptionsUnion {
  @scala.inline
  implicit def apply(value: CommentDeletedException): DeleteCommentContentExceptionsUnion = value.asInstanceOf[DeleteCommentContentExceptionsUnion]
  @scala.inline
  implicit def apply(value: CommentDoesNotExistException): DeleteCommentContentExceptionsUnion = value.asInstanceOf[DeleteCommentContentExceptionsUnion]
  @scala.inline
  implicit def apply(value: CommentIdRequiredException): DeleteCommentContentExceptionsUnion = value.asInstanceOf[DeleteCommentContentExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidCommentIdException): DeleteCommentContentExceptionsUnion = value.asInstanceOf[DeleteCommentContentExceptionsUnion]
}

