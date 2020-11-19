package typingsSlinky.blueprintjsCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.keyComboMod.IKeyComboProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyCombo {
  
  @JSImport("@blueprintjs/core", "KeyCombo")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.KeyCombo] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minimal(value: Boolean): this.type = set("minimal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IKeyComboProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(combo: String): Builder = {
    val __props = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IKeyComboProps]))
  }
}
