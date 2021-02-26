package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.typesAdmchannelrequestMod.ADMChannelRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnschannelrequestMod.APNSChannelRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnssandboxchannelrequestMod.APNSSandboxChannelRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnsvoipchannelrequestMod.APNSVoipChannelRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelrequestMod.APNSVoipSandboxChannelRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesBaiduChannelRequestMod.BaiduChannelRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateApplicationRequestMod.CreateApplicationRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesEmailChannelRequestMod.EmailChannelRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointBatchRequestMod.EndpointBatchRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointRequestMod.EndpointRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventsRequestMod.EventsRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobRequestMod.ExportJobRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesGcmchannelrequestMod.GCMChannelRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobRequestMod.ImportJobRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageRequestMod.MessageRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesNumberValidateRequestMod.NumberValidateRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessageRequestMod.SendUsersMessageRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesSmschannelrequestMod.SMSChannelRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAttributesRequestMod.UpdateAttributesRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesWriteApplicationSettingsRequestMod.WriteApplicationSettingsRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod.WriteCampaignRequest
import typingsSlinky.awsSdkClientPinpointBrowser.typesWriteEventStreamMod.WriteEventStream
import typingsSlinky.awsSdkClientPinpointBrowser.typesWriteSegmentRequestMod.WriteSegmentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
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
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def CreateAppInput(CreateApplicationRequest: CreateApplicationRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput = {
      val __obj = js.Dynamic.literal(CreateApplicationRequest = CreateApplicationRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput]
    }
    
    @scala.inline
    def CreateCampaignInput(ApplicationId: String, WriteCampaignRequest: WriteCampaignRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput]
    }
    
    @scala.inline
    def CreateExportJobInput(ApplicationId: String, ExportJobRequest: ExportJobRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ExportJobRequest = ExportJobRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput]
    }
    
    @scala.inline
    def CreateImportJobInput(ApplicationId: String, ImportJobRequest: ImportJobRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ImportJobRequest = ImportJobRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput]
    }
    
    @scala.inline
    def CreateSegmentInput(ApplicationId: String, WriteSegmentRequest: WriteSegmentRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput]
    }
    
    @scala.inline
    def DeleteAdmChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAdmChannelInputMod.DeleteAdmChannelInput]
    }
    
    @scala.inline
    def DeleteApnsChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput]
    }
    
    @scala.inline
    def DeleteApnsSandboxChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput]
    }
    
    @scala.inline
    def DeleteApnsVoipChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelInputMod.DeleteApnsVoipChannelInput]
    }
    
    @scala.inline
    def DeleteApnsVoipSandboxChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput]
    }
    
    @scala.inline
    def DeleteAppInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput]
    }
    
    @scala.inline
    def DeleteBaiduChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput]
    }
    
    @scala.inline
    def DeleteCampaignInput(ApplicationId: String, CampaignId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteCampaignInputMod.DeleteCampaignInput]
    }
    
    @scala.inline
    def DeleteEmailChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput]
    }
    
    @scala.inline
    def DeleteEndpointInput(ApplicationId: String, EndpointId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput]
    }
    
    @scala.inline
    def DeleteEventStreamInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput]
    }
    
    @scala.inline
    def DeleteGcmChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteGcmChannelInputMod.DeleteGcmChannelInput]
    }
    
    @scala.inline
    def DeleteSegmentInput(ApplicationId: String, SegmentId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput]
    }
    
    @scala.inline
    def DeleteSmsChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSmsChannelInputMod.DeleteSmsChannelInput]
    }
    
    @scala.inline
    def DeleteUserEndpointsInput(ApplicationId: String, UserId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput]
    }
    
    @scala.inline
    def GetAdmChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput]
    }
    
    @scala.inline
    def GetApnsChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsChannelInputMod.GetApnsChannelInput]
    }
    
    @scala.inline
    def GetApnsSandboxChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput]
    }
    
    @scala.inline
    def GetApnsVoipChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput]
    }
    
    @scala.inline
    def GetApnsVoipSandboxChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelInputMod.GetApnsVoipSandboxChannelInput]
    }
    
    @scala.inline
    def GetAppInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput]
    }
    
    @scala.inline
    def GetApplicationSettingsInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput]
    }
    
    @scala.inline
    def GetAppsInput(): typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput]
    }
    
    @scala.inline
    def GetBaiduChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput]
    }
    
    @scala.inline
    def GetCampaignActivitiesInput(ApplicationId: String, CampaignId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput]
    }
    
    @scala.inline
    def GetCampaignInput(ApplicationId: String, CampaignId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput]
    }
    
    @scala.inline
    def GetCampaignVersionInput(ApplicationId: String, CampaignId: String, Version: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput]
    }
    
    @scala.inline
    def GetCampaignVersionsInput(ApplicationId: String, CampaignId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionsInputMod.GetCampaignVersionsInput]
    }
    
    @scala.inline
    def GetCampaignsInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput]
    }
    
    @scala.inline
    def GetChannelsInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput]
    }
    
    @scala.inline
    def GetEmailChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetEmailChannelInputMod.GetEmailChannelInput]
    }
    
    @scala.inline
    def GetEndpointInput(ApplicationId: String, EndpointId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput]
    }
    
    @scala.inline
    def GetEventStreamInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput]
    }
    
    @scala.inline
    def GetExportJobInput(ApplicationId: String, JobId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput]
    }
    
    @scala.inline
    def GetExportJobsInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput]
    }
    
    @scala.inline
    def GetGcmChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput]
    }
    
    @scala.inline
    def GetImportJobInput(ApplicationId: String, JobId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput]
    }
    
    @scala.inline
    def GetImportJobsInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput]
    }
    
    @scala.inline
    def GetSegmentExportJobsInput(ApplicationId: String, SegmentId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput]
    }
    
    @scala.inline
    def GetSegmentImportJobsInput(ApplicationId: String, SegmentId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput]
    }
    
    @scala.inline
    def GetSegmentInput(ApplicationId: String, SegmentId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput]
    }
    
    @scala.inline
    def GetSegmentVersionInput(ApplicationId: String, SegmentId: String, Version: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput]
    }
    
    @scala.inline
    def GetSegmentVersionsInput(ApplicationId: String, SegmentId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput]
    }
    
    @scala.inline
    def GetSegmentsInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput]
    }
    
    @scala.inline
    def GetSmsChannelInput(ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput]
    }
    
    @scala.inline
    def GetUserEndpointsInput(ApplicationId: String, UserId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput]
    }
    
    @scala.inline
    def PhoneNumberValidateInput(NumberValidateRequest: NumberValidateRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput = {
      val __obj = js.Dynamic.literal(NumberValidateRequest = NumberValidateRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput]
    }
    
    @scala.inline
    def PutEventStreamInput(ApplicationId: String, WriteEventStream: WriteEventStream): typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteEventStream = WriteEventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput]
    }
    
    @scala.inline
    def PutEventsInput(ApplicationId: String, EventsRequest: EventsRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EventsRequest = EventsRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput]
    }
    
    @scala.inline
    def RemoveAttributesInput(ApplicationId: String, AttributeType: String, UpdateAttributesRequest: UpdateAttributesRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any], UpdateAttributesRequest = UpdateAttributesRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput]
    }
    
    @scala.inline
    def SendMessagesInput(ApplicationId: String, MessageRequest: MessageRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], MessageRequest = MessageRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput]
    }
    
    @scala.inline
    def SendUsersMessagesInput(ApplicationId: String, SendUsersMessageRequest: SendUsersMessageRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendUsersMessageRequest = SendUsersMessageRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput]
    }
    
    @scala.inline
    def UpdateAdmChannelInput(ADMChannelRequest: ADMChannelRequest, ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput = {
      val __obj = js.Dynamic.literal(ADMChannelRequest = ADMChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput]
    }
    
    @scala.inline
    def UpdateApnsChannelInput(APNSChannelRequest: APNSChannelRequest, ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput = {
      val __obj = js.Dynamic.literal(APNSChannelRequest = APNSChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput]
    }
    
    @scala.inline
    def UpdateApnsSandboxChannelInput(APNSSandboxChannelRequest: APNSSandboxChannelRequest, ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput = {
      val __obj = js.Dynamic.literal(APNSSandboxChannelRequest = APNSSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput]
    }
    
    @scala.inline
    def UpdateApnsVoipChannelInput(APNSVoipChannelRequest: APNSVoipChannelRequest, ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput = {
      val __obj = js.Dynamic.literal(APNSVoipChannelRequest = APNSVoipChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput]
    }
    
    @scala.inline
    def UpdateApnsVoipSandboxChannelInput(APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest, ApplicationId: String): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput = {
      val __obj = js.Dynamic.literal(APNSVoipSandboxChannelRequest = APNSVoipSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput]
    }
    
    @scala.inline
    def UpdateApplicationSettingsInput(ApplicationId: String, WriteApplicationSettingsRequest: WriteApplicationSettingsRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteApplicationSettingsRequest = WriteApplicationSettingsRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput]
    }
    
    @scala.inline
    def UpdateBaiduChannelInput(ApplicationId: String, BaiduChannelRequest: BaiduChannelRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], BaiduChannelRequest = BaiduChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput]
    }
    
    @scala.inline
    def UpdateCampaignInput(ApplicationId: String, CampaignId: String, WriteCampaignRequest: WriteCampaignRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput]
    }
    
    @scala.inline
    def UpdateEmailChannelInput(ApplicationId: String, EmailChannelRequest: EmailChannelRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EmailChannelRequest = EmailChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEmailChannelInputMod.UpdateEmailChannelInput]
    }
    
    @scala.inline
    def UpdateEndpointInput(ApplicationId: String, EndpointId: String, EndpointRequest: EndpointRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any], EndpointRequest = EndpointRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput]
    }
    
    @scala.inline
    def UpdateEndpointsBatchInput(ApplicationId: String, EndpointBatchRequest: EndpointBatchRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointBatchRequest = EndpointBatchRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput]
    }
    
    @scala.inline
    def UpdateGcmChannelInput(ApplicationId: String, GCMChannelRequest: GCMChannelRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], GCMChannelRequest = GCMChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput]
    }
    
    @scala.inline
    def UpdateSegmentInput(ApplicationId: String, SegmentId: String, WriteSegmentRequest: WriteSegmentRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput]
    }
    
    @scala.inline
    def UpdateSmsChannelInput(ApplicationId: String, SMSChannelRequest: SMSChannelRequest): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SMSChannelRequest = SMSChannelRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput]
    }
  }
}
