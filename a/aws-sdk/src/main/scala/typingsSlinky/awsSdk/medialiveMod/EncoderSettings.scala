package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncoderSettings extends StObject {
  
  var AudioDescriptions: listOfAudioDescription = js.native
  
  /**
    * Settings for ad avail blanking.
    */
  var AvailBlanking: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AvailBlanking] = js.native
  
  /**
    * Event-wide configuration settings for ad avail insertion.
    */
  var AvailConfiguration: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AvailConfiguration] = js.native
  
  /**
    * Settings for blackout slate.
    */
  var BlackoutSlate: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.BlackoutSlate] = js.native
  
  /**
    * Settings for caption decriptions
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescription] = js.native
  
  /**
    * Feature Activations
    */
  var FeatureActivations: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FeatureActivations] = js.native
  
  /**
    * Configuration settings that apply to the event as a whole.
    */
  var GlobalConfiguration: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.GlobalConfiguration] = js.native
  
  /**
    * Nielsen configuration settings.
    */
  var NielsenConfiguration: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.NielsenConfiguration] = js.native
  
  var OutputGroups: listOfOutputGroup = js.native
  
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: typingsSlinky.awsSdk.medialiveMod.TimecodeConfig = js.native
  
  var VideoDescriptions: listOfVideoDescription = js.native
}
object EncoderSettings {
  
  @scala.inline
  def apply(
    AudioDescriptions: listOfAudioDescription,
    OutputGroups: listOfOutputGroup,
    TimecodeConfig: TimecodeConfig,
    VideoDescriptions: listOfVideoDescription
  ): EncoderSettings = {
    val __obj = js.Dynamic.literal(AudioDescriptions = AudioDescriptions.asInstanceOf[js.Any], OutputGroups = OutputGroups.asInstanceOf[js.Any], TimecodeConfig = TimecodeConfig.asInstanceOf[js.Any], VideoDescriptions = VideoDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncoderSettings]
  }
  
  @scala.inline
  implicit class EncoderSettingsMutableBuilder[Self <: EncoderSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioDescriptions(value: listOfAudioDescription): Self = StObject.set(x, "AudioDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioDescriptionsVarargs(value: AudioDescription*): Self = StObject.set(x, "AudioDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setAvailBlanking(value: AvailBlanking): Self = StObject.set(x, "AvailBlanking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailBlankingUndefined: Self = StObject.set(x, "AvailBlanking", js.undefined)
    
    @scala.inline
    def setAvailConfiguration(value: AvailConfiguration): Self = StObject.set(x, "AvailConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailConfigurationUndefined: Self = StObject.set(x, "AvailConfiguration", js.undefined)
    
    @scala.inline
    def setBlackoutSlate(value: BlackoutSlate): Self = StObject.set(x, "BlackoutSlate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackoutSlateUndefined: Self = StObject.set(x, "BlackoutSlate", js.undefined)
    
    @scala.inline
    def setCaptionDescriptions(value: listOfCaptionDescription): Self = StObject.set(x, "CaptionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionDescriptionsUndefined: Self = StObject.set(x, "CaptionDescriptions", js.undefined)
    
    @scala.inline
    def setCaptionDescriptionsVarargs(value: CaptionDescription*): Self = StObject.set(x, "CaptionDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setFeatureActivations(value: FeatureActivations): Self = StObject.set(x, "FeatureActivations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureActivationsUndefined: Self = StObject.set(x, "FeatureActivations", js.undefined)
    
    @scala.inline
    def setGlobalConfiguration(value: GlobalConfiguration): Self = StObject.set(x, "GlobalConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalConfigurationUndefined: Self = StObject.set(x, "GlobalConfiguration", js.undefined)
    
    @scala.inline
    def setNielsenConfiguration(value: NielsenConfiguration): Self = StObject.set(x, "NielsenConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNielsenConfigurationUndefined: Self = StObject.set(x, "NielsenConfiguration", js.undefined)
    
    @scala.inline
    def setOutputGroups(value: listOfOutputGroup): Self = StObject.set(x, "OutputGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputGroupsVarargs(value: OutputGroup*): Self = StObject.set(x, "OutputGroups", js.Array(value :_*))
    
    @scala.inline
    def setTimecodeConfig(value: TimecodeConfig): Self = StObject.set(x, "TimecodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDescriptions(value: listOfVideoDescription): Self = StObject.set(x, "VideoDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDescriptionsVarargs(value: VideoDescription*): Self = StObject.set(x, "VideoDescriptions", js.Array(value :_*))
  }
}
