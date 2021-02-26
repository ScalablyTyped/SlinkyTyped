package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getPullRequestExceptionsUnionMod.GetPullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.updatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PullRequestDoesNotExistExceptionDetails> * / any */ @js.native
  trait PullRequestDoesNotExistException
    extends DescribePullRequestEventsExceptionsUnion
       with GetCommentsForPullRequestExceptionsUnion
       with GetPullRequestExceptionsUnion
       with MergePullRequestByFastForwardExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion
       with UpdatePullRequestDescriptionExceptionsUnion
       with UpdatePullRequestStatusExceptionsUnion
       with UpdatePullRequestTitleExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestDoesNotExistException = js.native
  }
  object PullRequestDoesNotExistException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestDoesNotExistException
    ): PullRequestDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PullRequestDoesNotExistException]
    }
    
    @scala.inline
    implicit class PullRequestDoesNotExistExceptionMutableBuilder[Self <: PullRequestDoesNotExistException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PullRequestDoesNotExistExceptionDetails extends StObject
}
