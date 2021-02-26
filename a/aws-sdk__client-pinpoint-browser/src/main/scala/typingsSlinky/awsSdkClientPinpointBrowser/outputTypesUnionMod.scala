package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.typesActivitiesResponseMod.UnmarshalledActivitiesResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesAdmchannelresponseMod.UnmarshalledADMChannelResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnschannelresponseMod.UnmarshalledAPNSChannelResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnssandboxchannelresponseMod.UnmarshalledAPNSSandboxChannelResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnsvoipchannelresponseMod.UnmarshalledAPNSVoipChannelResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelresponseMod.UnmarshalledAPNSVoipSandboxChannelResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationResponseMod.UnmarshalledApplicationResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod.UnmarshalledApplicationSettingsResource
import typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationsResponseMod.UnmarshalledApplicationsResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesAttributesResourceMod.UnmarshalledAttributesResource
import typingsSlinky.awsSdkClientPinpointBrowser.typesBaiduChannelResponseMod.UnmarshalledBaiduChannelResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignsResponseMod.UnmarshalledCampaignsResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesChannelsResponseMod.UnmarshalledChannelsResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesEmailChannelResponseMod.UnmarshalledEmailChannelResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointsResponseMod.UnmarshalledEndpointsResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventStreamMod.UnmarshalledEventStream
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventsResponseMod.UnmarshalledEventsResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobsResponseMod.UnmarshalledExportJobsResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesGcmchannelresponseMod.UnmarshalledGCMChannelResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobsResponseMod.UnmarshalledImportJobsResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageBodyMod.UnmarshalledMessageBody
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageResponseMod.UnmarshalledMessageResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesNumberValidateResponseMod.UnmarshalledNumberValidateResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentsResponseMod.UnmarshalledSegmentsResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod.UnmarshalledSendUsersMessageResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesSmschannelresponseMod.UnmarshalledSMSChannelResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
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
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    @scala.inline
    def CreateAppOutput($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput]
    }
    
    @scala.inline
    def CreateCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput]
    }
    
    @scala.inline
    def CreateExportJobOutput($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput]
    }
    
    @scala.inline
    def CreateImportJobOutput($metadata: ResponseMetadata, ImportJobResponse: UnmarshalledImportJobResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput]
    }
    
    @scala.inline
    def CreateSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput]
    }
    
    @scala.inline
    def DeleteAdmChannelOutput($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAdmChannelOutputMod.DeleteAdmChannelOutput]
    }
    
    @scala.inline
    def DeleteApnsChannelOutput($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput]
    }
    
    @scala.inline
    def DeleteApnsSandboxChannelOutput($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput]
    }
    
    @scala.inline
    def DeleteApnsVoipChannelOutput($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipChannelOutputMod.DeleteApnsVoipChannelOutput]
    }
    
    @scala.inline
    def DeleteApnsVoipSandboxChannelOutput(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput]
    }
    
    @scala.inline
    def DeleteAppOutput($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput]
    }
    
    @scala.inline
    def DeleteBaiduChannelOutput($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput]
    }
    
    @scala.inline
    def DeleteCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteCampaignOutputMod.DeleteCampaignOutput]
    }
    
    @scala.inline
    def DeleteEmailChannelOutput($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput]
    }
    
    @scala.inline
    def DeleteEndpointOutput($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput]
    }
    
    @scala.inline
    def DeleteEventStreamOutput($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput]
    }
    
    @scala.inline
    def DeleteGcmChannelOutput($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteGcmChannelOutputMod.DeleteGcmChannelOutput]
    }
    
    @scala.inline
    def DeleteSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput]
    }
    
    @scala.inline
    def DeleteSmsChannelOutput($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSmsChannelOutputMod.DeleteSmsChannelOutput]
    }
    
    @scala.inline
    def DeleteUserEndpointsOutput($metadata: ResponseMetadata, EndpointsResponse: UnmarshalledEndpointsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput]
    }
    
    @scala.inline
    def GetAdmChannelOutput($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput]
    }
    
    @scala.inline
    def GetApnsChannelOutput($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod.GetApnsChannelOutput]
    }
    
    @scala.inline
    def GetApnsSandboxChannelOutput($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput]
    }
    
    @scala.inline
    def GetApnsVoipChannelOutput($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput]
    }
    
    @scala.inline
    def GetApnsVoipSandboxChannelOutput(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetApnsVoipSandboxChannelOutputMod.GetApnsVoipSandboxChannelOutput]
    }
    
    @scala.inline
    def GetAppOutput($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput]
    }
    
    @scala.inline
    def GetApplicationSettingsOutput($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): typingsSlinky.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput]
    }
    
    @scala.inline
    def GetAppsOutput($metadata: ResponseMetadata, ApplicationsResponse: UnmarshalledApplicationsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput]
    }
    
    @scala.inline
    def GetBaiduChannelOutput($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput]
    }
    
    @scala.inline
    def GetCampaignActivitiesOutput($metadata: ResponseMetadata, ActivitiesResponse: UnmarshalledActivitiesResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ActivitiesResponse = ActivitiesResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput]
    }
    
    @scala.inline
    def GetCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput]
    }
    
    @scala.inline
    def GetCampaignVersionOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput]
    }
    
    @scala.inline
    def GetCampaignVersionsOutput($metadata: ResponseMetadata, CampaignsResponse: UnmarshalledCampaignsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod.GetCampaignVersionsOutput]
    }
    
    @scala.inline
    def GetCampaignsOutput($metadata: ResponseMetadata, CampaignsResponse: UnmarshalledCampaignsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput]
    }
    
    @scala.inline
    def GetChannelsOutput($metadata: ResponseMetadata, ChannelsResponse: UnmarshalledChannelsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput]
    }
    
    @scala.inline
    def GetEmailChannelOutput($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetEmailChannelOutputMod.GetEmailChannelOutput]
    }
    
    @scala.inline
    def GetEndpointOutput($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput]
    }
    
    @scala.inline
    def GetEventStreamOutput($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): typingsSlinky.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput]
    }
    
    @scala.inline
    def GetExportJobOutput($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput]
    }
    
    @scala.inline
    def GetExportJobsOutput($metadata: ResponseMetadata, ExportJobsResponse: UnmarshalledExportJobsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput]
    }
    
    @scala.inline
    def GetGcmChannelOutput($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput]
    }
    
    @scala.inline
    def GetImportJobOutput($metadata: ResponseMetadata, ImportJobResponse: UnmarshalledImportJobResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput]
    }
    
    @scala.inline
    def GetImportJobsOutput($metadata: ResponseMetadata, ImportJobsResponse: UnmarshalledImportJobsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput]
    }
    
    @scala.inline
    def GetSegmentExportJobsOutput($metadata: ResponseMetadata, ExportJobsResponse: UnmarshalledExportJobsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput]
    }
    
    @scala.inline
    def GetSegmentImportJobsOutput($metadata: ResponseMetadata, ImportJobsResponse: UnmarshalledImportJobsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput]
    }
    
    @scala.inline
    def GetSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput]
    }
    
    @scala.inline
    def GetSegmentVersionOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput]
    }
    
    @scala.inline
    def GetSegmentVersionsOutput($metadata: ResponseMetadata, SegmentsResponse: UnmarshalledSegmentsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput]
    }
    
    @scala.inline
    def GetSegmentsOutput($metadata: ResponseMetadata, SegmentsResponse: UnmarshalledSegmentsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput]
    }
    
    @scala.inline
    def GetSmsChannelOutput($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput]
    }
    
    @scala.inline
    def GetUserEndpointsOutput($metadata: ResponseMetadata, EndpointsResponse: UnmarshalledEndpointsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput]
    }
    
    @scala.inline
    def PhoneNumberValidateOutput($metadata: ResponseMetadata, NumberValidateResponse: UnmarshalledNumberValidateResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], NumberValidateResponse = NumberValidateResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput]
    }
    
    @scala.inline
    def PutEventStreamOutput($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput]
    }
    
    @scala.inline
    def PutEventsOutput($metadata: ResponseMetadata, EventsResponse: UnmarshalledEventsResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventsResponse = EventsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput]
    }
    
    @scala.inline
    def RemoveAttributesOutput($metadata: ResponseMetadata, AttributesResource: UnmarshalledAttributesResource): typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AttributesResource = AttributesResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput]
    }
    
    @scala.inline
    def SendMessagesOutput($metadata: ResponseMetadata, MessageResponse: UnmarshalledMessageResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageResponse = MessageResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput]
    }
    
    @scala.inline
    def SendUsersMessagesOutput($metadata: ResponseMetadata, SendUsersMessageResponse: UnmarshalledSendUsersMessageResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SendUsersMessageResponse = SendUsersMessageResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput]
    }
    
    @scala.inline
    def UpdateAdmChannelOutput($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput]
    }
    
    @scala.inline
    def UpdateApnsChannelOutput($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput]
    }
    
    @scala.inline
    def UpdateApnsSandboxChannelOutput($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput]
    }
    
    @scala.inline
    def UpdateApnsVoipChannelOutput($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput]
    }
    
    @scala.inline
    def UpdateApnsVoipSandboxChannelOutput(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput]
    }
    
    @scala.inline
    def UpdateApplicationSettingsOutput($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput]
    }
    
    @scala.inline
    def UpdateBaiduChannelOutput($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput]
    }
    
    @scala.inline
    def UpdateCampaignOutput($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput]
    }
    
    @scala.inline
    def UpdateEmailChannelOutput($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEmailChannelOutputMod.UpdateEmailChannelOutput]
    }
    
    @scala.inline
    def UpdateEndpointOutput($metadata: ResponseMetadata, MessageBody: UnmarshalledMessageBody): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput]
    }
    
    @scala.inline
    def UpdateEndpointsBatchOutput($metadata: ResponseMetadata, MessageBody: UnmarshalledMessageBody): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput]
    }
    
    @scala.inline
    def UpdateGcmChannelOutput($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput]
    }
    
    @scala.inline
    def UpdateSegmentOutput($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput]
    }
    
    @scala.inline
    def UpdateSmsChannelOutput($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput]
    }
  }
}
