package typingsSlinky.awsSdkClientLambdaNode.typesResourceConflictExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.deleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceConflictException
  extends ServiceException[ResourceConflictExceptionDetails]
     with AddPermissionExceptionsUnion
     with CreateAliasExceptionsUnion
     with CreateEventSourceMappingExceptionsUnion
     with CreateFunctionExceptionsUnion
     with DeleteFunctionExceptionsUnion
     with UpdateEventSourceMappingExceptionsUnion
     with UpdateFunctionConfigurationExceptionsUnion {
  
  @JSName("name")
  var name_ResourceConflictException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceConflictException = js.native
}
object ResourceConflictException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceConflictExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceConflictException
  ): ResourceConflictException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceConflictException]
  }
  
  @scala.inline
  implicit class ResourceConflictExceptionOps[Self <: ResourceConflictException] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceConflictException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
