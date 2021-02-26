package typingsSlinky.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCommentExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException
    - typingsSlinky.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException
    - typingsSlinky.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException
  */
  trait GetCommentExceptionsUnion extends StObject
  object GetCommentExceptionsUnion {
    
    @scala.inline
    def CommentDeletedException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDeletedException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod.CommentDeletedException]
    }
    
    @scala.inline
    def CommentDoesNotExistException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDoesNotExistException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod.CommentDoesNotExistException]
    }
    
    @scala.inline
    def CommentIdRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentIdRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesCommentIdRequiredExceptionMod.CommentIdRequiredException]
    }
    
    @scala.inline
    def InvalidCommentIdException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommentIdException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod.InvalidCommentIdException]
    }
  }
}
