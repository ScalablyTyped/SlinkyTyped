package typingsSlinky.reactMic.components

import org.scalajs.dom.raw.Blob
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMic.mod.ReactMicProps
import typingsSlinky.reactMic.mod.ReactMicStopEvent
import typingsSlinky.reactMic.reactMicNumbers.`1`
import typingsSlinky.reactMic.reactMicNumbers.`2`
import typingsSlinky.reactMic.reactMicStrings.audioSlashwav
import typingsSlinky.reactMic.reactMicStrings.audioSlashwebm
import typingsSlinky.reactMic.reactMicStrings.frequencyBars
import typingsSlinky.reactMic.reactMicStrings.sinewave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMic {
  
  @JSImport("react-mic", "ReactMic")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMic.mod.ReactMic] {
    
    @scala.inline
    def autoGainControl(value: Boolean): this.type = set("autoGainControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def channelCount(value: `1` | `2`): this.type = set("channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def echoCancellation(value: Boolean): this.type = set("echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mimeType(value: audioSlashwebm | audioSlashwav): this.type = set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noiseSuppression(value: Boolean): this.type = set("noiseSuppression", value.asInstanceOf[js.Any])
    
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
  
  implicit def make(companion: ReactMic.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactMicProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
