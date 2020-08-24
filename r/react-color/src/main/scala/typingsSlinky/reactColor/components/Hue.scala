package typingsSlinky.reactColor.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.reactColor.anon.PartialClassesany
import typingsSlinky.reactColor.hueMod.HueProps
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorResult
import typingsSlinky.reactColor.reactColorStrings.horizontal
import typingsSlinky.reactColor.reactColorStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Hue {
  @JSImport("react-color/lib/components/common", "Hue")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactColor.commonMod.Hue] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def pointerReactElement(value: ReactElement): this.type = set("pointer", value.asInstanceOf[js.Any])
    @scala.inline
    def pointer(value: ReactElement): this.type = set("pointer", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: PartialClassesany): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HueProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[HueProps]))
  }
}

