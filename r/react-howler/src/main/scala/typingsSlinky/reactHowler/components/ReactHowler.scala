package typingsSlinky.reactHowler.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactHowler.mod.Props
import typingsSlinky.reactHowler.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHowler {
  
  @JSImport("react-howler", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def formatVarargs(value: String*): this.type = set("format", js.Array(value :_*))
    
    @scala.inline
    def format(value: js.Array[String]): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def html5(value: Boolean): this.type = set("html5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mute(value: Boolean): this.type = set("mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnd(value: () => Unit): this.type = set("onEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLoadError(value: /* id */ Double => Unit): this.type = set("onLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPause(value: () => Unit): this.type = set("onPause", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPlay(value: /* id */ Double => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStop(value: /* id */ Double => Unit): this.type = set("onStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolume(value: /* id */ Double => Unit): this.type = set("onVolume", js.Any.fromFunction1(value))
    
    @scala.inline
    def playing(value: Boolean): this.type = set("playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preload(value: Boolean): this.type = set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(src: String | js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
