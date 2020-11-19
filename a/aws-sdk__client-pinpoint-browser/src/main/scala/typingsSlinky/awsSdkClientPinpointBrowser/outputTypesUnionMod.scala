package typingsSlinky.awsSdkClientPinpointBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/types/OutputTypesUnion", JSImport.Namespace)
@js.native
object outputTypesUnionMod extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput
    - typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput
  */
  trait OutputTypesUnion extends js.Object
}
