package typingsSlinky.reactNativeVideoPlayer.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeVideoPlayer.anon.ControlButton
import typingsSlinky.reactNativeVideoPlayer.anon.MainVer
import typingsSlinky.reactNativeVideoPlayer.mod.VideoPlayerProps
import typingsSlinky.reactNativeVideoPlayer.mod.default
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.contain
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.cover
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.none
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeVideoPlayer {
  
  @JSImport("react-native-video-player", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def controlsTimeout(value: Double): this.type = set("controlsTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customStyles(value: ControlButton): this.type = set("customStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultMuted(value: Boolean): this.type = set("defaultMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableControlsAutoHide(value: Boolean): this.type = set("disableControlsAutoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableFullscreen(value: Boolean): this.type = set("disableFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableSeek(value: Boolean): this.type = set("disableSeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endThumbnailVarargs(value: ImageURISource*): this.type = set("endThumbnail", js.Array(value :_*))
    
    @scala.inline
    def endThumbnail(value: ImageSourcePropType): this.type = set("endThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endWithThumbnail(value: Boolean): this.type = set("endWithThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullScreenOnLongPress(value: Boolean): this.type = set("fullScreenOnLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideControlsOnStart(value: Boolean): this.type = set("hideControlsOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnd(value: /* event */ js.Any => _): this.type = set("onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHideControls(value: () => _): this.type = set("onHideControls", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLoad(value: /* event */ js.Any => _): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMutePress(value: () => _): this.type = set("onMutePress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPlayPress(value: () => _): this.type = set("onPlayPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onProgress(value: /* event */ js.Any => _): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onShowControls(value: () => _): this.type = set("onShowControls", js.Any.fromFunction0(value))
    
    @scala.inline
    def onStart(value: () => _): this.type = set("onStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def pauseOnPress(value: Boolean): this.type = set("pauseOnPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paused(value: Boolean): this.type = set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizeMode(value: stretch | contain | cover | none): this.type = set("resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def thumbnailVarargs(value: ImageURISource*): this.type = set("thumbnail", js.Array(value :_*))
    
    @scala.inline
    def thumbnail(value: ImageSourcePropType): this.type = set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def video(value: MainVer | Double): this.type = set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def videoHeight(value: Double): this.type = set("videoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def videoWidth(value: Double): this.type = set("videoWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VideoPlayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeVideoPlayer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
