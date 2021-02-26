package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMaximumRepositoryTriggersExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MaximumRepositoryTriggersExceededExceptionDetails> * / any */ @js.native
  trait MaximumRepositoryTriggersExceededException
    extends PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryTriggersExceededException = js.native
  }
  object MaximumRepositoryTriggersExceededException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryTriggersExceededException
    ): MaximumRepositoryTriggersExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaximumRepositoryTriggersExceededException]
    }
    
    @scala.inline
    implicit class MaximumRepositoryTriggersExceededExceptionMutableBuilder[Self <: MaximumRepositoryTriggersExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryTriggersExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaximumRepositoryTriggersExceededExceptionDetails extends StObject
}
