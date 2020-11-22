package typingsSlinky.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackConfiguration extends js.Object {
  
  /**
    * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[string] = js.native
  
  /**
    * The configuration for Avail Suppression. Ad suppression can be used to turn off ad personalization in a long manifest, or if a viewer joins mid-break.
    */
  var AvailSuppression: js.UndefOr[typingsSlinky.awsSdk.mediatailorMod.AvailSuppression] = js.native
  
  /**
    * The configuration for bumpers. Bumpers are short audio or video clips that play at the start or before the end of an ad break. 
    */
  var Bumper: js.UndefOr[typingsSlinky.awsSdk.mediatailorMod.Bumper] = js.native
  
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
    * The configuration for manifest processing rules. Manifest processing rules enable customization of the personalized manifests created by MediaTailor.
    */
  var ManifestProcessingRules: js.UndefOr[typingsSlinky.awsSdk.mediatailorMod.ManifestProcessingRules] = js.native
  
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
object PlaybackConfiguration {
  
  @scala.inline
  def apply(): PlaybackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaybackConfiguration]
  }
  
  @scala.inline
  implicit class PlaybackConfigurationOps[Self <: PlaybackConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAdDecisionServerUrl(value: string): Self = this.set("AdDecisionServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdDecisionServerUrl: Self = this.set("AdDecisionServerUrl", js.undefined)
    
    @scala.inline
    def setAvailSuppression(value: AvailSuppression): Self = this.set("AvailSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailSuppression: Self = this.set("AvailSuppression", js.undefined)
    
    @scala.inline
    def setBumper(value: Bumper): Self = this.set("Bumper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBumper: Self = this.set("Bumper", js.undefined)
    
    @scala.inline
    def setCdnConfiguration(value: CdnConfiguration): Self = this.set("CdnConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdnConfiguration: Self = this.set("CdnConfiguration", js.undefined)
    
    @scala.inline
    def setDashConfiguration(value: DashConfiguration): Self = this.set("DashConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashConfiguration: Self = this.set("DashConfiguration", js.undefined)
    
    @scala.inline
    def setHlsConfiguration(value: HlsConfiguration): Self = this.set("HlsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsConfiguration: Self = this.set("HlsConfiguration", js.undefined)
    
    @scala.inline
    def setManifestProcessingRules(value: ManifestProcessingRules): Self = this.set("ManifestProcessingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestProcessingRules: Self = this.set("ManifestProcessingRules", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPersonalizationThresholdSeconds(value: integerMin1): Self = this.set("PersonalizationThresholdSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalizationThresholdSeconds: Self = this.set("PersonalizationThresholdSeconds", js.undefined)
    
    @scala.inline
    def setPlaybackConfigurationArn(value: string): Self = this.set("PlaybackConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaybackConfigurationArn: Self = this.set("PlaybackConfigurationArn", js.undefined)
    
    @scala.inline
    def setPlaybackEndpointPrefix(value: string): Self = this.set("PlaybackEndpointPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaybackEndpointPrefix: Self = this.set("PlaybackEndpointPrefix", js.undefined)
    
    @scala.inline
    def setSessionInitializationEndpointPrefix(value: string): Self = this.set("SessionInitializationEndpointPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionInitializationEndpointPrefix: Self = this.set("SessionInitializationEndpointPrefix", js.undefined)
    
    @scala.inline
    def setSlateAdUrl(value: string): Self = this.set("SlateAdUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlateAdUrl: Self = this.set("SlateAdUrl", js.undefined)
    
    @scala.inline
    def setTags(value: mapOfString): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTranscodeProfileName(value: string): Self = this.set("TranscodeProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscodeProfileName: Self = this.set("TranscodeProfileName", js.undefined)
    
    @scala.inline
    def setVideoContentSourceUrl(value: string): Self = this.set("VideoContentSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoContentSourceUrl: Self = this.set("VideoContentSourceUrl", js.undefined)
  }
}
