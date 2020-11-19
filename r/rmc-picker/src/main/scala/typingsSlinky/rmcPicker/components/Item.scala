package typingsSlinky.rmcPicker.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcPicker.pickerMixinMod.IItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  @JSImport("rmc-picker", "default.Item")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: js.Any): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IItemProps]))
  }
}
