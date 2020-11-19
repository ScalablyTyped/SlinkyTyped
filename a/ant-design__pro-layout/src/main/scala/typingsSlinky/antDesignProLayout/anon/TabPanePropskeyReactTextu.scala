package typingsSlinky.antDesignProLayout.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/tabs.TabPaneProps & {  key :react.react.ReactText | undefined} */
@js.native
trait TabPanePropskeyReactTextu extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var closeIcon: js.UndefOr[ReactElement] = js.native
  
  var destroyInactiveTabPane: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var forceRender: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[ReactText] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tab: js.UndefOr[ReactElement] = js.native
  
  var tabKey: js.UndefOr[String] = js.native
}
object TabPanePropskeyReactTextu {
  
  @scala.inline
  def apply(): TabPanePropskeyReactTextu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabPanePropskeyReactTextu]
  }
  
  @scala.inline
  implicit class TabPanePropskeyReactTextuOps[Self <: TabPanePropskeyReactTextu] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setCloseIconReactElement(value: ReactElement): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseIcon(value: ReactElement): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    
    @scala.inline
    def setDestroyInactiveTabPane(value: Boolean): Self = this.set("destroyInactiveTabPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyInactiveTabPane: Self = this.set("destroyInactiveTabPane", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKey(value: ReactText): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabReactElement(value: ReactElement): Self = this.set("tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: ReactElement): Self = this.set("tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
    
    @scala.inline
    def setTabKey(value: String): Self = this.set("tabKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabKey: Self = this.set("tabKey", js.undefined)
  }
}
