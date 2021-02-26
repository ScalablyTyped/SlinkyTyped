package typingsSlinky.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatePullRequestDescriptionExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException
    - typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException
    - typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException
  */
  trait UpdatePullRequestDescriptionExceptionsUnion extends StObject
  object UpdatePullRequestDescriptionExceptionsUnion {
    
    @scala.inline
    def InvalidDescriptionException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDescriptionException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException]
    }
    
    @scala.inline
    def InvalidPullRequestIdException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestIdException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException]
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
  }
}
