package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRepositoryTriggerNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRepositoryTriggerNameExceptionDetails> * / any */ @js.native
  trait InvalidRepositoryTriggerNameException
    extends PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerNameException = js.native
  }
  object InvalidRepositoryTriggerNameException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerNameException
    ): InvalidRepositoryTriggerNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidRepositoryTriggerNameException]
    }
    
    @scala.inline
    implicit class InvalidRepositoryTriggerNameExceptionMutableBuilder[Self <: InvalidRepositoryTriggerNameException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidRepositoryTriggerNameExceptionDetails extends StObject
}
