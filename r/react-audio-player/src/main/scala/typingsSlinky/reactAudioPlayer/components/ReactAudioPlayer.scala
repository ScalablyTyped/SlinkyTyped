package typingsSlinky.reactAudioPlayer.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLAudioElement
import slinky.core.SyntheticEvent
import slinky.web.html.audio.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactAudioPlayer.mod.Preload
import typingsSlinky.reactAudioPlayer.mod.ReactAudioPlayerProps
import typingsSlinky.reactAudioPlayer.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAudioPlayer {
  
  @JSImport("react-audio-player", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def controlsList(value: String): this.type = set("controlsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listenInterval(value: Double): this.type = set("listenInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbort(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlay(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThrough(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnded(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onListen(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onListen", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadata(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPause(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlay(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeked(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolumeChanged(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): this.type = set("onVolumeChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def preload(value: Preload): this.type = set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactAudioPlayer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactAudioPlayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
