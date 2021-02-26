package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMaximumOpenPullRequestsExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MaximumOpenPullRequestsExceededExceptionDetails> * / any */ @js.native
  trait MaximumOpenPullRequestsExceededException extends CreatePullRequestExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumOpenPullRequestsExceededException = js.native
  }
  object MaximumOpenPullRequestsExceededException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumOpenPullRequestsExceededException
    ): MaximumOpenPullRequestsExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaximumOpenPullRequestsExceededException]
    }
    
    @scala.inline
    implicit class MaximumOpenPullRequestsExceededExceptionMutableBuilder[Self <: MaximumOpenPullRequestsExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumOpenPullRequestsExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaximumOpenPullRequestsExceededExceptionDetails extends StObject
}
