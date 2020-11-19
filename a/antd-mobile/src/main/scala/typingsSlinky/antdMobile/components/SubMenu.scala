package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.menuPropsTypeMod.DataItem
import typingsSlinky.antdMobile.subMenuMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SubMenu {
  
  @JSImport("antd-mobile/lib/menu/SubMenu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def multiSelect(value: Boolean): this.type = set("multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radioPrefixCls(value: String): this.type = set("radioPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subMenuPrefixCls(value: String): this.type = set("subMenuPrefixCls", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    onSel: DataItem => Unit,
    selItem: js.Array[DataItem],
    showSelect: Boolean,
    subMenuData: js.Array[DataItem]
  ): Builder = {
    val __props = js.Dynamic.literal(onSel = js.Any.fromFunction1(onSel), selItem = selItem.asInstanceOf[js.Any], showSelect = showSelect.asInstanceOf[js.Any], subMenuData = subMenuData.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
}
