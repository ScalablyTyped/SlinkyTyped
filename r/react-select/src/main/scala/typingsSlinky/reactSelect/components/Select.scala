package typingsSlinky.reactSelect.components

import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.selectMod.default
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](): SharedBuilder_Props583106040[default[OptionType], OptionType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_Props583106040[default[OptionType], OptionType](js.Array(this.component, __props.asInstanceOf[Props[OptionType]]))
  }
  
  @JSImport("react-select/src/Select", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make[OptionType /* <: OptionTypeBase */](companion: Select.type): SharedBuilder_Props583106040[default[OptionType], OptionType] = new SharedBuilder_Props583106040[default[OptionType], OptionType](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[OptionType /* <: OptionTypeBase */](p: Props[OptionType]): SharedBuilder_Props583106040[default[OptionType], OptionType] = new SharedBuilder_Props583106040[default[OptionType], OptionType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
