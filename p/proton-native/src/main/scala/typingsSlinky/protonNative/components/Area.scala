package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.protonNative.AnonButtons
import typingsSlinky.protonNative.AnonH
import typingsSlinky.protonNative.AnonX
import typingsSlinky.protonNative.mod.AreaProps
import typingsSlinky.protonNative.mod.KeyboardEvent
import typingsSlinky.protonNative.mod.MouseEvent
import typingsSlinky.protonNative.protonNativeStrings.bevel
import typingsSlinky.protonNative.protonNativeStrings.flat
import typingsSlinky.protonNative.protonNativeStrings.miter
import typingsSlinky.protonNative.protonNativeStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Area {
  @JSImport("proton-native", "Area")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.protonNative.mod.Area] {
    @scala.inline
    def align(value: AnonH): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def expand(value: AnonH): this.type = set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def fillOpacity(value: Double): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def onKeyDown(value: /* event */ KeyboardEvent => Boolean): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: /* event */ KeyboardEvent => Boolean): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: /* event */ MouseEvent => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: () => Unit): this.type = set("onMouseEnter", js.Any.fromFunction0(value))
    @scala.inline
    def onMouseLeave(value: () => Unit): this.type = set("onMouseLeave", js.Any.fromFunction0(value))
    @scala.inline
    def onMouseMove(value: /* event */ AnonButtons => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUp(value: /* event */ MouseEvent => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def span(value: AnonX): this.type = set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def stretchy(value: Boolean): this.type = set("stretchy", value.asInstanceOf[js.Any])
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeLinecap(value: flat | round | bevel): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeLinejoin(value: miter | round | bevel): this.type = set("strokeLinejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeMiterlimit(value: Double): this.type = set("strokeMiterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeOpacity(value: Double): this.type = set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def transform(value: String): this.type = set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AreaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Area.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

