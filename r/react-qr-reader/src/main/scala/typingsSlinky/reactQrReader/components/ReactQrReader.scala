package typingsSlinky.reactQrReader.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.SyntheticEvent
import slinky.web.html.img.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactQrReader.mod.^
import typingsSlinky.reactQrReader.mod.props
import typingsSlinky.reactQrReader.reactQrReaderBooleans.`false`
import typingsSlinky.reactQrReader.reactQrReaderStrings.environment
import typingsSlinky.reactQrReader.reactQrReaderStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactQrReader {
  @JSImport("react-qr-reader", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def delay(value: Double | `false`): this.type = set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def facingMode(value: user | environment): this.type = set("facingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def legacyMode(value: Boolean): this.type = set("legacyMode", value.asInstanceOf[js.Any])
    @scala.inline
    def onImageLoad(value: /* event */ SyntheticEvent[Event, HTMLImageElement] => Unit): this.type = set("onImageLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def resolution(value: Double): this.type = set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def showViewFinder(value: Boolean): this.type = set("showViewFinder", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onError: js.Any => Unit, onScan: js.UndefOr[String] => Unit): Builder = {
    val __props = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onScan = js.Any.fromFunction1(onScan))
    new Builder(js.Array(this.component, __props.asInstanceOf[props]))
  }
}

