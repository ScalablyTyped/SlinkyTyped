package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryTriggerNameRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryTriggerNameRequiredExceptionDetails> * / any */ @js.native
  trait RepositoryTriggerNameRequiredException
    extends PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerNameRequiredException = js.native
  }
  object RepositoryTriggerNameRequiredException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerNameRequiredException
    ): RepositoryTriggerNameRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryTriggerNameRequiredException]
    }
    
    @scala.inline
    implicit class RepositoryTriggerNameRequiredExceptionMutableBuilder[Self <: RepositoryTriggerNameRequiredException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerNameRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RepositoryTriggerNameRequiredExceptionDetails extends StObject
}
