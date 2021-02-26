package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.listBranchesExceptionsUnionMod.ListBranchesExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidContinuationTokenExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidContinuationTokenExceptionDetails> * / any */ @js.native
  trait InvalidContinuationTokenException
    extends DescribePullRequestEventsExceptionsUnion
       with GetCommentsForComparedCommitExceptionsUnion
       with GetCommentsForPullRequestExceptionsUnion
       with GetDifferencesExceptionsUnion
       with ListBranchesExceptionsUnion
       with ListPullRequestsExceptionsUnion
       with ListRepositoriesExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidContinuationTokenException = js.native
  }
  object InvalidContinuationTokenException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidContinuationTokenException
    ): InvalidContinuationTokenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidContinuationTokenException]
    }
    
    @scala.inline
    implicit class InvalidContinuationTokenExceptionMutableBuilder[Self <: InvalidContinuationTokenException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidContinuationTokenException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidContinuationTokenExceptionDetails extends StObject
}
