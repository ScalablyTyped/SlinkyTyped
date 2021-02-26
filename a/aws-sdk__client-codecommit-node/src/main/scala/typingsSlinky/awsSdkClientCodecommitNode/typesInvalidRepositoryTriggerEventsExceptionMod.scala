package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRepositoryTriggerEventsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRepositoryTriggerEventsExceptionDetails> * / any */ @js.native
  trait InvalidRepositoryTriggerEventsException
    extends PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerEventsException = js.native
  }
  object InvalidRepositoryTriggerEventsException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerEventsException
    ): InvalidRepositoryTriggerEventsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidRepositoryTriggerEventsException]
    }
    
    @scala.inline
    implicit class InvalidRepositoryTriggerEventsExceptionMutableBuilder[Self <: InvalidRepositoryTriggerEventsException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerEventsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidRepositoryTriggerEventsExceptionDetails extends StObject
}
