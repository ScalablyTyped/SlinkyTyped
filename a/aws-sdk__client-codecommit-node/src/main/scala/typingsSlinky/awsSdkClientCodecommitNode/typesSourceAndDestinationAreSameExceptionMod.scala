package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSourceAndDestinationAreSameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_SourceAndDestinationAreSameExceptionDetails> * / any */ @js.native
  trait SourceAndDestinationAreSameException extends CreatePullRequestExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException = js.native
  }
  object SourceAndDestinationAreSameException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException
    ): SourceAndDestinationAreSameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceAndDestinationAreSameException]
    }
    
    @scala.inline
    implicit class SourceAndDestinationAreSameExceptionMutableBuilder[Self <: SourceAndDestinationAreSameException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceAndDestinationAreSameExceptionDetails extends StObject
}
