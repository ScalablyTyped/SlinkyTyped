package typingsSlinky.reactPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends StObject {
  
  var dailymotion: js.UndefOr[DailyMotionConfig] = js.native
  
  var facebook: js.UndefOr[FacebookConfig] = js.native
  
  var file: js.UndefOr[FileConfig] = js.native
  
  var mixcloud: js.UndefOr[MixcloudConfig] = js.native
  
  var soundcloud: js.UndefOr[SoundCloudConfig] = js.native
  
  var twitch: js.UndefOr[TwitchConfig] = js.native
  
  var vidyard: js.UndefOr[VidyardConfig] = js.native
  
  var vimeo: js.UndefOr[VimeoConfig] = js.native
  
  var wistia: js.UndefOr[WistiaConfig] = js.native
  
  var youtube: js.UndefOr[YouTubeConfig] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailymotion(value: DailyMotionConfig): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailymotionUndefined: Self = StObject.set(x, "dailymotion", js.undefined)
    
    @scala.inline
    def setFacebook(value: FacebookConfig): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
    
    @scala.inline
    def setFile(value: FileConfig): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setMixcloud(value: MixcloudConfig): Self = StObject.set(x, "mixcloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixcloudUndefined: Self = StObject.set(x, "mixcloud", js.undefined)
    
    @scala.inline
    def setSoundcloud(value: SoundCloudConfig): Self = StObject.set(x, "soundcloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundcloudUndefined: Self = StObject.set(x, "soundcloud", js.undefined)
    
    @scala.inline
    def setTwitch(value: TwitchConfig): Self = StObject.set(x, "twitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwitchUndefined: Self = StObject.set(x, "twitch", js.undefined)
    
    @scala.inline
    def setVidyard(value: VidyardConfig): Self = StObject.set(x, "vidyard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVidyardUndefined: Self = StObject.set(x, "vidyard", js.undefined)
    
    @scala.inline
    def setVimeo(value: VimeoConfig): Self = StObject.set(x, "vimeo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVimeoUndefined: Self = StObject.set(x, "vimeo", js.undefined)
    
    @scala.inline
    def setWistia(value: WistiaConfig): Self = StObject.set(x, "wistia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWistiaUndefined: Self = StObject.set(x, "wistia", js.undefined)
    
    @scala.inline
    def setYoutube(value: YouTubeConfig): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutubeUndefined: Self = StObject.set(x, "youtube", js.undefined)
  }
}
