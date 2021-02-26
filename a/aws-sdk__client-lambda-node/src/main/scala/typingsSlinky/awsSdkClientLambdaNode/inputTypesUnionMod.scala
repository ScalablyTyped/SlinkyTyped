package typingsSlinky.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.`nodejs4Dot3-edge`
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore1Dot0
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot0
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot1
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.go1Dotx
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.java8
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs4Dot3
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs6Dot10
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs8Dot10
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python2Dot7
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python3Dot6
import typingsSlinky.awsSdkClientLambdaNode.typesFunctionCodeMod.FunctionCode
import typingsSlinky.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput
    - typingsSlinky.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput
    - typingsSlinky.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput
    - typingsSlinky.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput
    - typingsSlinky.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput
    - typingsSlinky.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput
    - typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput
    - typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput
    - typingsSlinky.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput
    - typingsSlinky.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput
    - typingsSlinky.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput
    - typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput
    - typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput
    - typingsSlinky.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput
    - typingsSlinky.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput
    - typingsSlinky.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput[typingsSlinky.node.streamMod.Readable]
    - typingsSlinky.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput
    - typingsSlinky.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
    - typingsSlinky.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput
    - typingsSlinky.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput
    - typingsSlinky.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
    - typingsSlinky.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput
    - typingsSlinky.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput
    - typingsSlinky.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput
    - typingsSlinky.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput
    - typingsSlinky.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput
    - typingsSlinky.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput
    - typingsSlinky.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
    - typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput
    - typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput
  */
  type InputTypesUnion = _InputTypesUnion | InvokeAsyncInput[Readable]
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    @scala.inline
    def AddPermissionInput(Action: String, FunctionName: String, Principal: String, StatementId: String): typingsSlinky.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput]
    }
    
    @scala.inline
    def CreateAliasInput(FunctionName: String, FunctionVersion: String, Name: String): typingsSlinky.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], FunctionVersion = FunctionVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput]
    }
    
    @scala.inline
    def CreateEventSourceMappingInput(EventSourceArn: String, FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(EventSourceArn = EventSourceArn.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput]
    }
    
    @scala.inline
    def CreateFunctionInput(
      Code: FunctionCode,
      FunctionName: String,
      Handler: String,
      Role: String,
      Runtime: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
    ): typingsSlinky.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Handler = Handler.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput]
    }
    
    @scala.inline
    def DeleteAliasInput(FunctionName: String, Name: String): typingsSlinky.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    @scala.inline
    def DeleteEventSourceMappingInput(UUID: String): typingsSlinky.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput]
    }
    
    @scala.inline
    def DeleteFunctionConcurrencyInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput]
    }
    
    @scala.inline
    def DeleteFunctionInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput]
    }
    
    @scala.inline
    def GetAccountSettingsInput(): typingsSlinky.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput]
    }
    
    @scala.inline
    def GetAliasInput(FunctionName: String, Name: String): typingsSlinky.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput]
    }
    
    @scala.inline
    def GetEventSourceMappingInput(UUID: String): typingsSlinky.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput]
    }
    
    @scala.inline
    def GetFunctionConfigurationInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput]
    }
    
    @scala.inline
    def GetFunctionInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput]
    }
    
    @scala.inline
    def GetPolicyInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput]
    }
    
    @scala.inline
    def InvokeInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput]
    }
    
    @scala.inline
    def ListAliasesInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput]
    }
    
    @scala.inline
    def ListEventSourceMappingsInput(): typingsSlinky.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput]
    }
    
    @scala.inline
    def ListFunctionsInput(): typingsSlinky.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput]
    }
    
    @scala.inline
    def ListTagsInput(Resource: String): typingsSlinky.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput = {
      val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput]
    }
    
    @scala.inline
    def ListVersionsByFunctionInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput]
    }
    
    @scala.inline
    def PublishVersionInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput]
    }
    
    @scala.inline
    def PutFunctionConcurrencyInput(FunctionName: String, ReservedConcurrentExecutions: Double): typingsSlinky.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], ReservedConcurrentExecutions = ReservedConcurrentExecutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput]
    }
    
    @scala.inline
    def RemovePermissionInput(FunctionName: String, StatementId: String): typingsSlinky.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput]
    }
    
    @scala.inline
    def TagResourceInput(Resource: String, Tags: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): typingsSlinky.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput]
    }
    
    @scala.inline
    def UntagResourceInput(Resource: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    @scala.inline
    def UpdateAliasInput(FunctionName: String, Name: String): typingsSlinky.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    @scala.inline
    def UpdateEventSourceMappingInput(UUID: String): typingsSlinky.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput]
    }
    
    @scala.inline
    def UpdateFunctionCodeInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput]
    }
    
    @scala.inline
    def UpdateFunctionConfigurationInput(FunctionName: String): typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput]
    }
  }
}
