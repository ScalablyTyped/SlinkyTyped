package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.deleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesResourceConflictExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceConflictExceptionDetails> * / any */ @js.native
  trait ResourceConflictException
    extends AddPermissionExceptionsUnion
       with CreateAliasExceptionsUnion
       with CreateEventSourceMappingExceptionsUnion
       with CreateFunctionExceptionsUnion
       with DeleteFunctionExceptionsUnion
       with UpdateEventSourceMappingExceptionsUnion
       with UpdateFunctionConfigurationExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceConflictException = js.native
  }
  object ResourceConflictException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceConflictException): ResourceConflictException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceConflictException]
    }
    
    @scala.inline
    implicit class ResourceConflictExceptionMutableBuilder[Self <: ResourceConflictException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceConflictException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceConflictExceptionDetails extends StObject {
    
    /**
      * <p>The exception type.</p>
      */
    var Type: js.UndefOr[String] = js.native
    
    /**
      * <p>The exception message.</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object ResourceConflictExceptionDetails {
    
    @scala.inline
    def apply(): ResourceConflictExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceConflictExceptionDetails]
    }
    
    @scala.inline
    implicit class ResourceConflictExceptionDetailsMutableBuilder[Self <: ResourceConflictExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
