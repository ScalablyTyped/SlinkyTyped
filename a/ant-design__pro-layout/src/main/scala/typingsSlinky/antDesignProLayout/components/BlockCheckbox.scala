package typingsSlinky.antDesignProLayout.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.Key
import typingsSlinky.antDesignProLayout.blockCheckboxMod.BlockCheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockCheckbox {
  
  @scala.inline
  def apply(configType: String, onChange: String => Unit, prefixCls: String, value: String): Builder = {
    val __props = js.Dynamic.literal(configType = configType.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BlockCheckboxProps]))
  }
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/BlockCheckbox", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def list(value: js.Array[Key]): this.type = set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listVarargs(value: Key*): this.type = set("list", js.Array(value :_*))
  }
  
  def withProps(p: BlockCheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
