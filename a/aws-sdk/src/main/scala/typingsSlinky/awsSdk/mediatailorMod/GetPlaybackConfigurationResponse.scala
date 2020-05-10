package typingsSlinky.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlaybackConfigurationResponse extends js.Object {
  /**
    * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[string] = js.native
  /**
    * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management. 
    */
  var CdnConfiguration: js.UndefOr[typingsSlinky.awsSdk.mediatailorMod.CdnConfiguration] = js.native
  /**
    * The configuration for DASH content. 
    */
  var DashConfiguration: js.UndefOr[typingsSlinky.awsSdk.mediatailorMod.DashConfiguration] = js.native
  /**
    * The configuration for HLS content. 
    */
  var HlsConfiguration: js.UndefOr[typingsSlinky.awsSdk.mediatailorMod.HlsConfiguration] = js.native
  /**
    * The configuration for pre-roll ad insertion.
    */
  var LivePreRollConfiguration: js.UndefOr[typingsSlinky.awsSdk.mediatailorMod.LivePreRollConfiguration] = js.native
  /**
    * The identifier for the playback configuration.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The maximum duration of underfilled ad time (in seconds) allowed in an ad break.
    */
  var PersonalizationThresholdSeconds: js.UndefOr[integerMin1] = js.native
  /**
    * The Amazon Resource Name (ARN) for the playback configuration. 
    */
  var PlaybackConfigurationArn: js.UndefOr[string] = js.native
  /**
    * The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use server-side reporting. 
    */
  var PlaybackEndpointPrefix: js.UndefOr[string] = js.native
  /**
    * The URL that the player uses to initialize a session that uses client-side reporting. 
    */
  var SessionInitializationEndpointPrefix: js.UndefOr[string] = js.native
  /**
    * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID playback configurations. For VPAID, the slate is required because MediaTailor provides it in the slots designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video. 
    */
  var SlateAdUrl: js.UndefOr[string] = js.native
  /**
    * The tags assigned to the playback configuration. 
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  /**
    * The name that is used to associate this playback configuration with a custom transcode profile. This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom profiles with the help of AWS Support.
    */
  var TranscodeProfileName: js.UndefOr[string] = js.native
  /**
    * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
    */
  var VideoContentSourceUrl: js.UndefOr[string] = js.native
}

object GetPlaybackConfigurationResponse {
  @scala.inline
  def apply(): GetPlaybackConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlaybackConfigurationResponse]
  }
  @scala.inline
  implicit class GetPlaybackConfigurationResponseOps[Self <: GetPlaybackConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdDecisionServerUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdDecisionServerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdDecisionServerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdDecisionServerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCdnConfiguration(value: CdnConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CdnConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdnConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CdnConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDashConfiguration(value: DashConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsConfiguration(value: HlsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withLivePreRollConfiguration(value: LivePreRollConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LivePreRollConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLivePreRollConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LivePreRollConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonalizationThresholdSeconds(value: integerMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonalizationThresholdSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalizationThresholdSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonalizationThresholdSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaybackConfigurationArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaybackConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaybackConfigurationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaybackConfigurationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaybackEndpointPrefix(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaybackEndpointPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaybackEndpointPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaybackEndpointPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionInitializationEndpointPrefix(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionInitializationEndpointPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionInitializationEndpointPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionInitializationEndpointPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSlateAdUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlateAdUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlateAdUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlateAdUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: mapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscodeProfileName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscodeProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscodeProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscodeProfileName")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoContentSourceUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoContentSourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoContentSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoContentSourceUrl")(js.undefined)
        ret
    }
  }
  
}

