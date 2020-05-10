package typingsSlinky.reactMic.components

import org.scalajs.dom.raw.Blob
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMic.mod.ReactMicProps
import typingsSlinky.reactMic.mod.ReactMicStopEvent
import typingsSlinky.reactMic.reactMicStrings.frequencyBars
import typingsSlinky.reactMic.reactMicStrings.sinewave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMic {
  @JSImport("react-mic", "ReactMic")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMic.mod.ReactMic] {
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def onData(value: /* recordedData */ Blob => Unit): this.type = set("onData", js.Any.fromFunction1(value))
    @scala.inline
    def onStop(value: /* recordedData */ ReactMicStopEvent => Unit): this.type = set("onStop", js.Any.fromFunction1(value))
    @scala.inline
    def pause(value: Boolean): this.type = set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def record(value: Boolean): this.type = set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeColor(value: String): this.type = set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def visualSetting(value: sinewave | frequencyBars): this.type = set("visualSetting", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactMicProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactMic.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

