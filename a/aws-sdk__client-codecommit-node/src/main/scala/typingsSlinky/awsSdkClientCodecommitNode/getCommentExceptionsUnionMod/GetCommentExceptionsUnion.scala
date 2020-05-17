package typingsSlinky.awsSdkClientCodecommitNode.getCommentExceptionsUnionMod

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
trait GetCommentExceptionsUnion extends js.Object

object GetCommentExceptionsUnion {
  @scala.inline
  implicit def apply(value: CommentDeletedException): GetCommentExceptionsUnion = value.asInstanceOf[GetCommentExceptionsUnion]
  @scala.inline
  implicit def apply(value: CommentDoesNotExistException): GetCommentExceptionsUnion = value.asInstanceOf[GetCommentExceptionsUnion]
  @scala.inline
  implicit def apply(value: CommentIdRequiredException): GetCommentExceptionsUnion = value.asInstanceOf[GetCommentExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidCommentIdException): GetCommentExceptionsUnion = value.asInstanceOf[GetCommentExceptionsUnion]
}

