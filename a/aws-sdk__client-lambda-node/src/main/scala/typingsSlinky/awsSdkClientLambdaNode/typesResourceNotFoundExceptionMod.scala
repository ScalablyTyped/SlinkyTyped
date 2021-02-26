package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.deleteEventSourceMappingExceptionsUnionMod.DeleteEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.deleteFunctionConcurrencyExceptionsUnionMod.DeleteFunctionConcurrencyExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.deleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getAliasExceptionsUnionMod.GetAliasExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getEventSourceMappingExceptionsUnionMod.GetEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getFunctionConfigurationExceptionsUnionMod.GetFunctionConfigurationExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getFunctionExceptionsUnionMod.GetFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getPolicyExceptionsUnionMod.GetPolicyExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.listEventSourceMappingsExceptionsUnionMod.ListEventSourceMappingsExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.listTagsExceptionsUnionMod.ListTagsExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.listVersionsByFunctionExceptionsUnionMod.ListVersionsByFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.putFunctionConcurrencyExceptionsUnionMod.PutFunctionConcurrencyExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.removePermissionExceptionsUnionMod.RemovePermissionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesResourceNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceNotFoundExceptionDetails> * / any */ @js.native
  trait ResourceNotFoundException
    extends AddPermissionExceptionsUnion
       with CreateAliasExceptionsUnion
       with CreateEventSourceMappingExceptionsUnion
       with CreateFunctionExceptionsUnion
       with DeleteEventSourceMappingExceptionsUnion
       with DeleteFunctionConcurrencyExceptionsUnion
       with DeleteFunctionExceptionsUnion
       with GetAliasExceptionsUnion
       with GetEventSourceMappingExceptionsUnion
       with GetFunctionConfigurationExceptionsUnion
       with GetFunctionExceptionsUnion
       with GetPolicyExceptionsUnion
       with InvokeAsyncExceptionsUnion
       with InvokeExceptionsUnion
       with ListAliasesExceptionsUnion
       with ListEventSourceMappingsExceptionsUnion
       with ListTagsExceptionsUnion
       with ListVersionsByFunctionExceptionsUnion
       with PublishVersionExceptionsUnion
       with PutFunctionConcurrencyExceptionsUnion
       with RemovePermissionExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion
       with UpdateAliasExceptionsUnion
       with UpdateEventSourceMappingExceptionsUnion
       with UpdateFunctionCodeExceptionsUnion
       with UpdateFunctionConfigurationExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceNotFoundException = js.native
  }
  object ResourceNotFoundException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceNotFoundException): ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceNotFoundException]
    }
    
    @scala.inline
    implicit class ResourceNotFoundExceptionMutableBuilder[Self <: ResourceNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceNotFoundExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.native
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.native
  }
  object ResourceNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): ResourceNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class ResourceNotFoundExceptionDetailsMutableBuilder[Self <: ResourceNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
