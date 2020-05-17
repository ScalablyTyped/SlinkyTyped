package typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput
import typingsSlinky.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput
import typingsSlinky.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput
import typingsSlinky.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput
import typingsSlinky.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput
import typingsSlinky.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput
import typingsSlinky.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput
import typingsSlinky.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
import typingsSlinky.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput
import typingsSlinky.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput
import typingsSlinky.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
import typingsSlinky.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput
import typingsSlinky.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput
import typingsSlinky.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput
import typingsSlinky.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput
import typingsSlinky.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait InputTypesUnion extends js.Object

object InputTypesUnion {
  @scala.inline
  implicit def apply(value: AddPermissionInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: CreateAliasInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: CreateEventSourceMappingInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: CreateFunctionInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteAliasInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteEventSourceMappingInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteFunctionConcurrencyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteFunctionInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetAccountSettingsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetAliasInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetEventSourceMappingInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetFunctionConfigurationInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetFunctionInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetPolicyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: InvokeAsyncInput[Readable]): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: InvokeInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListAliasesInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListEventSourceMappingsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListFunctionsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListTagsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListVersionsByFunctionInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: PublishVersionInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: PutFunctionConcurrencyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: RemovePermissionInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: TagResourceInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: UntagResourceInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: UpdateAliasInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: UpdateEventSourceMappingInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: UpdateFunctionCodeInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: UpdateFunctionConfigurationInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
}

