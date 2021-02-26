package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.deleteAliasExceptionsUnionMod.DeleteAliasExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.deleteEventSourceMappingExceptionsUnionMod.DeleteEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.deleteFunctionConcurrencyExceptionsUnionMod.DeleteFunctionConcurrencyExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.deleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getAccountSettingsExceptionsUnionMod.GetAccountSettingsExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getAliasExceptionsUnionMod.GetAliasExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getEventSourceMappingExceptionsUnionMod.GetEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getFunctionConfigurationExceptionsUnionMod.GetFunctionConfigurationExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getFunctionExceptionsUnionMod.GetFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.getPolicyExceptionsUnionMod.GetPolicyExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.listEventSourceMappingsExceptionsUnionMod.ListEventSourceMappingsExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.listFunctionsExceptionsUnionMod.ListFunctionsExceptionsUnion
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

object typesServiceExceptionMod {
  
  @js.native
  trait ServiceException
    extends AddPermissionExceptionsUnion
       with CreateAliasExceptionsUnion
       with CreateEventSourceMappingExceptionsUnion
       with CreateFunctionExceptionsUnion
       with DeleteAliasExceptionsUnion
       with DeleteEventSourceMappingExceptionsUnion
       with DeleteFunctionConcurrencyExceptionsUnion
       with DeleteFunctionExceptionsUnion
       with GetAccountSettingsExceptionsUnion
       with GetAliasExceptionsUnion
       with GetEventSourceMappingExceptionsUnion
       with GetFunctionConfigurationExceptionsUnion
       with GetFunctionExceptionsUnion
       with GetPolicyExceptionsUnion
       with InvokeAsyncExceptionsUnion
       with InvokeExceptionsUnion
       with ListAliasesExceptionsUnion
       with ListEventSourceMappingsExceptionsUnion
       with ListFunctionsExceptionsUnion
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
    
    var name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ServiceException = js.native
  }
  object ServiceException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ServiceException): ServiceException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceException]
    }
    
    @scala.inline
    implicit class ServiceExceptionMutableBuilder[Self <: ServiceException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ServiceException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.native
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.native
  }
  object ServiceExceptionDetails {
    
    @scala.inline
    def apply(): ServiceExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceExceptionDetails]
    }
    
    @scala.inline
    implicit class ServiceExceptionDetailsMutableBuilder[Self <: ServiceExceptionDetails] (val x: Self) extends AnyVal {
      
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
