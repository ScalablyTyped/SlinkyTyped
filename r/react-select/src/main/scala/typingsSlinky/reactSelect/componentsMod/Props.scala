package typingsSlinky.reactSelect.componentsMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  var components: SelectComponentsConfig[OptionType] = js.native
}
object Props {
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](components: SelectComponentsConfig[OptionType]): Props[OptionType] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[OptionType]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[_], OptionType /* <: OptionTypeBase */] (val x: Self with Props[OptionType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponents(value: SelectComponentsConfig[OptionType]): Self = this.set("components", value.asInstanceOf[js.Any])
  }
}
