package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWriteApplicationSettingsRequestMod {
  
  @js.native
  trait UnmarshalledWriteApplicationSettingsRequest extends WriteApplicationSettingsRequest {
    
    /**
      * Default campaign hook information.
      */
    @JSName("CampaignHook")
    var CampaignHook_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledCampaignHook] = js.native
    
    /**
      * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
      */
    @JSName("Limits")
    var Limits_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledCampaignLimits] = js.native
    
    /**
      * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
      */
    @JSName("QuietTime")
    var QuietTime_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledQuietTime] = js.native
  }
  object UnmarshalledWriteApplicationSettingsRequest {
    
    @scala.inline
    def apply(): UnmarshalledWriteApplicationSettingsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledWriteApplicationSettingsRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledWriteApplicationSettingsRequestMutableBuilder[Self <: UnmarshalledWriteApplicationSettingsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCampaignHook(value: UnmarshalledCampaignHook): Self = StObject.set(x, "CampaignHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignHookUndefined: Self = StObject.set(x, "CampaignHook", js.undefined)
      
      @scala.inline
      def setLimits(value: UnmarshalledCampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      @scala.inline
      def setQuietTime(value: UnmarshalledQuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    }
  }
  
  @js.native
  trait WriteApplicationSettingsRequest extends StObject {
    
    /**
      * Default campaign hook information.
      */
    var CampaignHook: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook] = js.native
    
    /**
      * The CloudWatchMetrics settings for the app.
      */
    var CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
      */
    var Limits: js.UndefOr[CampaignLimits] = js.native
    
    /**
      * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
      */
    var QuietTime: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.native
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
      def setCloudWatchMetricsEnabled(value: Boolean): Self = StObject.set(x, "CloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "CloudWatchMetricsEnabled", js.undefined)
      
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
}
