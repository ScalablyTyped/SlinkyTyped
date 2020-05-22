package typingsSlinky.reactSelect.components

import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.selectMod.default
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Select {
  @JSImport("react-select/src/Select", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[OptionType <: OptionTypeBase](p: Props[OptionType]): SharedBuilder_Props1248470529[default[js.Any], OptionType] = new SharedBuilder_Props1248470529[default[js.Any], OptionType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[OptionType <: OptionTypeBase](): SharedBuilder_Props1248470529[default[js.Any], OptionType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_Props1248470529[default[js.Any], OptionType](js.Array(this.component, __props.asInstanceOf[Props[OptionType]]))
  }
  implicit def make[OptionType <: OptionTypeBase](companion: Select.type): SharedBuilder_Props1248470529[default[js.Any], OptionType] = new SharedBuilder_Props1248470529[default[js.Any], OptionType](js.Array(this.component, js.Dictionary.empty))()
}

