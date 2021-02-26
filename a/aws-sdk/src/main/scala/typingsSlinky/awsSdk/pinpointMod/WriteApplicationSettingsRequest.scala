package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteApplicationSettingsRequest extends StObject {
  
  /**
    * The settings for the AWS Lambda function to invoke by default as a code hook for campaigns in the application. You can use this hook to customize segments that are used by campaigns in the application. To override these settings and define custom settings for a specific campaign, use the CampaignHook object of the Campaign resource.
    */
  var CampaignHook: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.CampaignHook] = js.native
  
  /**
    * Specifies whether to enable application-related alarms in Amazon CloudWatch.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[boolean] = js.native
  
  var EventTaggingEnabled: js.UndefOr[boolean] = js.native
  
  /**
    * The default sending limits for campaigns in the application. To override these limits and define custom limits for a specific campaign or journey, use the Campaign resource or the Journey resource, respectively.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  
  /**
    * The default quiet time for campaigns in the application. Quiet time is a specific time range when messages aren't sent to endpoints, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint is set to a valid value. The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start property for the application (or a campaign or journey that has custom quiet time settings). The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End property for the application (or a campaign or journey that has custom quiet time settings). If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign or journey, even if quiet time is enabled. To override the default quiet time settings for a specific campaign or journey, use the Campaign resource or the Journey resource to define a custom quiet time for the campaign or journey.
    */
  var QuietTime: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.QuietTime] = js.native
}
object WriteApplicationSettingsRequest {
  
  @scala.inline
  def apply(): WriteApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteApplicationSettingsRequest]
  }
  
  @scala.inline
  implicit class WriteApplicationSettingsRequestMutableBuilder[Self <: WriteApplicationSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignHook(value: CampaignHook): Self = StObject.set(x, "CampaignHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignHookUndefined: Self = StObject.set(x, "CampaignHook", js.undefined)
    
    @scala.inline
    def setCloudWatchMetricsEnabled(value: boolean): Self = StObject.set(x, "CloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "CloudWatchMetricsEnabled", js.undefined)
    
    @scala.inline
    def setEventTaggingEnabled(value: boolean): Self = StObject.set(x, "EventTaggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTaggingEnabledUndefined: Self = StObject.set(x, "EventTaggingEnabled", js.undefined)
    
    @scala.inline
    def setLimits(value: CampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
    
    @scala.inline
    def setQuietTime(value: QuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
  }
}
