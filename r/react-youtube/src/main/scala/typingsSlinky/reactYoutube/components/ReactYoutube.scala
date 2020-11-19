package typingsSlinky.reactYoutube.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactYoutube.anon.Data
import typingsSlinky.reactYoutube.anon.DataTarget
import typingsSlinky.reactYoutube.anon.Target
import typingsSlinky.reactYoutube.mod.Options
import typingsSlinky.reactYoutube.mod.YouTubeProps
import typingsSlinky.reactYoutube.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactYoutube {
  
  @JSImport("react-youtube", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnd(value: /* event */ Data => Unit): this.type = set("onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(value: /* event */ Data => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPause(value: /* event */ Data => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlay(value: /* event */ Data => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaybackQualityChange(value: /* event */ DataTarget => Unit): this.type = set("onPlaybackQualityChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaybackRateChange(value: /* event */ Data => Unit): this.type = set("onPlaybackRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReady(value: /* event */ Target => Unit): this.type = set("onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStateChange(value: /* event */ Data => Unit): this.type = set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def opts(value: Options): this.type = set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def videoId(value: String): this.type = set("videoId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: YouTubeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactYoutube.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
