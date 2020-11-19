package typingsSlinky.antDesignProLayout.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.Key
import typingsSlinky.antDesignProLayout.blockCheckboxMod.BlockCheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockCheckbox {
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/BlockCheckbox", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def listVarargs(value: Key*): this.type = set("list", js.Array(value :_*))
    
    @scala.inline
    def list(value: js.Array[Key]): this.type = set("list", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BlockCheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onChange: String => Unit, prefixCls: String, value: String): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BlockCheckboxProps]))
  }
}
