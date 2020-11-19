package typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod

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
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooManyRequestsException
  extends ServiceException[TooManyRequestsExceptionDetails]
     with AddPermissionExceptionsUnion
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
  
  @JSName("name")
  var name_TooManyRequestsException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.TooManyRequestsException = js.native
}
object TooManyRequestsException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TooManyRequestsExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.TooManyRequestsException
  ): TooManyRequestsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooManyRequestsException]
  }
  
  @scala.inline
  implicit class TooManyRequestsExceptionOps[Self <: TooManyRequestsException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.TooManyRequestsException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
