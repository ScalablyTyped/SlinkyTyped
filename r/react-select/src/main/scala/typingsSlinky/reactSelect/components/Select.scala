package typingsSlinky.reactSelect.components

import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.selectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Select {
  @JSImport("react-select/src/Select", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[/* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */ OptionType](p: Props[OptionType]): SharedBuilder_Props416038889[default[OptionType], OptionType] = new SharedBuilder_Props416038889[default[OptionType], OptionType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */ OptionType](): SharedBuilder_Props416038889[default[OptionType], OptionType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_Props416038889[default[OptionType], OptionType](js.Array(this.component, __props.asInstanceOf[Props[OptionType]]))
  }
  implicit def make[/* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */ OptionType](companion: Select.type): SharedBuilder_Props416038889[default[OptionType], OptionType] = new SharedBuilder_Props416038889[default[OptionType], OptionType](js.Array(this.component, js.Dictionary.empty))()
}

