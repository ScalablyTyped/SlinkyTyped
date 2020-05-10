package typingsSlinky.reactSound.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSound.mod.ReactSoundProps
import typingsSlinky.reactSound.mod.default
import typingsSlinky.reactSound.reactSoundStrings.PAUSED
import typingsSlinky.reactSound.reactSoundStrings.PLAYING
import typingsSlinky.reactSound.reactSoundStrings.STOPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSound {
  @JSImport("react-sound", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoLoad(value: Boolean): this.type = set("autoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def onBufferChange(value: () => Unit): this.type = set("onBufferChange", js.Any.fromFunction0(value))
    @scala.inline
    def onError(value: () => Unit): this.type = set("onError", js.Any.fromFunction0(value))
    @scala.inline
    def onFinishedPlaying(value: () => Unit): this.type = set("onFinishedPlaying", js.Any.fromFunction0(value))
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def onLoading(value: () => Unit): this.type = set("onLoading", js.Any.fromFunction0(value))
    @scala.inline
    def onPause(value: () => Unit): this.type = set("onPause", js.Any.fromFunction0(value))
    @scala.inline
    def onPlaying(value: () => Unit): this.type = set("onPlaying", js.Any.fromFunction0(value))
    @scala.inline
    def onResume(value: () => Unit): this.type = set("onResume", js.Any.fromFunction0(value))
    @scala.inline
    def onStop(value: () => Unit): this.type = set("onStop", js.Any.fromFunction0(value))
    @scala.inline
    def playFromPosition(value: Double): this.type = set("playFromPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def playbackRate(value: Double): this.type = set("playbackRate", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: Double): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactSoundProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(playStatus: PLAYING | STOPPED | PAUSED, url: String): Builder = {
    val __props = js.Dynamic.literal(playStatus = playStatus.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactSoundProps]))
  }
}

