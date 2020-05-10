package typingsSlinky.reactColor.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorResult
import typingsSlinky.reactColor.mod.CustomPickerProps
import typingsSlinky.reactColor.saturationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Saturation {
  @JSImport("react-color/lib/components/common/Saturation", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def pointerReactElement(value: ReactElement): this.type = set("pointer", value.asInstanceOf[js.Any])
    @scala.inline
    def pointer(value: TagMod[Any]): this.type = set("pointer", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CustomPickerProps[typingsSlinky.reactColor.saturationMod.Saturation]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: /* color */ ColorResult => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[CustomPickerProps[typingsSlinky.reactColor.saturationMod.Saturation]]))
  }
}

