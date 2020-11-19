package typingsSlinky.awsSdkClientPinpointBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/types/InputTypesUnion", JSImport.Namespace)
@js.native
object inputTypesUnionMod extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput
  */
  trait InputTypesUnion extends js.Object
}
