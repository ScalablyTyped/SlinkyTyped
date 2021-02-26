package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPlayerMessages extends StObject {
  
  var fullscreen: js.UndefOr[String] = js.native
  
  var mute: js.UndefOr[String] = js.native
  
  var pause: js.UndefOr[String] = js.native
  
  var play: js.UndefOr[String] = js.native
  
  var quality: js.UndefOr[String] = js.native
  
  var unmute: js.UndefOr[String] = js.native
}
object MediaPlayerMessages {
  
  @scala.inline
  def apply(): MediaPlayerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlayerMessages]
  }
  
  @scala.inline
  implicit class MediaPlayerMessagesMutableBuilder[Self <: MediaPlayerMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullscreen(value: String): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setMute(value: String): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    @scala.inline
    def setPause(value: String): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    @scala.inline
    def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setUnmute(value: String): Self = StObject.set(x, "unmute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmuteUndefined: Self = StObject.set(x, "unmute", js.undefined)
  }
}
