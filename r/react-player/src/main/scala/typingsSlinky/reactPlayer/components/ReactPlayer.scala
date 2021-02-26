package typingsSlinky.reactPlayer.components

import org.scalajs.dom.experimental.mediastream.MediaStream
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPlayer.anon.Loaded
import typingsSlinky.reactPlayer.mod.Config
import typingsSlinky.reactPlayer.mod.ReactPlayerProps
import typingsSlinky.reactPlayer.mod.SourceProps
import typingsSlinky.reactPlayer.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPlayer {
  
  @JSImport("react-player", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def config(value: Config): this.type = set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def light(value: Boolean | String): this.type = set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBuffer(value: () => Unit): this.type = set("onBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def onBufferEnd(value: () => Unit): this.type = set("onBufferEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDisablePIP(value: () => Unit): this.type = set("onDisablePIP", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDuration(value: /* duration */ Double => Unit): this.type = set("onDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnablePIP(value: () => Unit): this.type = set("onEnablePIP", js.Any.fromFunction0(value))
    
    @scala.inline
    def onEnded(value: () => Unit): this.type = set("onEnded", js.Any.fromFunction0(value))
    
    @scala.inline
    def onError(
      value: (/* error */ js.Any, /* data */ js.UndefOr[js.Any], /* hlsInstance */ js.UndefOr[js.Any], /* hlsGlobal */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onError", js.Any.fromFunction4(value))
    
    @scala.inline
    def onPause(value: () => Unit): this.type = set("onPause", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPlay(value: () => Unit): this.type = set("onPlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def onProgress(value: /* state */ Loaded => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReady(value: /* player */ typingsSlinky.reactPlayer.mod.ReactPlayer => Unit): this.type = set("onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeek(value: /* seconds */ Double => Unit): this.type = set("onSeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStart(value: () => Unit): this.type = set("onStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def pip(value: Boolean): this.type = set("pip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def playbackRate(value: Double): this.type = set("playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def playing(value: Boolean): this.type = set("playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def playsinline(value: Boolean): this.type = set("playsinline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressInterval(value: Double): this.type = set("progressInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopOnUnmount(value: Boolean): this.type = set("stopOnUnmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def url(value: String | (js.Array[SourceProps | String]) | MediaStream): this.type = set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def urlMediaStream(value: MediaStream): this.type = set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def urlVarargs(value: (SourceProps | String)*): this.type = set("url", js.Array(value :_*))
    
    @scala.inline
    def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapper(value: js.Any): this.type = set("wrapper", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactPlayer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactPlayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
