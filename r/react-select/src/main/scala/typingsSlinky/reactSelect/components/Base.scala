package typingsSlinky.reactSelect.components

import typingsSlinky.reactSelect.baseMod.default
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Base {
  
  @JSImport("react-select/base", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[OptionType /* <: OptionTypeBase */](p: Props[OptionType]): SharedBuilder_Props583106040[default[OptionType], OptionType] = new SharedBuilder_Props583106040[default[OptionType], OptionType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](): SharedBuilder_Props583106040[default[OptionType], OptionType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_Props583106040[default[OptionType], OptionType](js.Array(this.component, __props.asInstanceOf[Props[OptionType]]))
  }
  
  implicit def make[OptionType /* <: OptionTypeBase */](companion: Base.type): SharedBuilder_Props583106040[default[OptionType], OptionType] = new SharedBuilder_Props583106040[default[OptionType], OptionType](js.Array(this.component, js.Dictionary.empty))()
}
