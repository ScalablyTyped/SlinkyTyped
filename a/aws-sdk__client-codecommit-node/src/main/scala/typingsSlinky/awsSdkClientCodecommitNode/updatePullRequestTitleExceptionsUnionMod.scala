package typingsSlinky.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatePullRequestTitleExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException
    - typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException
    - typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException
  */
  trait UpdatePullRequestTitleExceptionsUnion extends StObject
  object UpdatePullRequestTitleExceptionsUnion {
    
    @scala.inline
    def InvalidPullRequestIdException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestIdException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException]
    }
    
    @scala.inline
    def InvalidTitleException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTitleException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException]
    }
    
    @scala.inline
    def PullRequestAlreadyClosedException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestAlreadyClosedException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException]
    }
    
    @scala.inline
    def PullRequestDoesNotExistException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestDoesNotExistException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException]
    }
    
    @scala.inline
    def PullRequestIdRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestIdRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException]
    }
    
    @scala.inline
    def TitleRequiredException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TitleRequiredException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException]
    }
  }
}
