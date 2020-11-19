package typingsSlinky.antdMobile.navBarPropsTypeMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antdMobile.antdMobileStrings.dark
import typingsSlinky.antdMobile.antdMobileStrings.light
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavBarProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  
  var icon: js.UndefOr[ReactElement] = js.native
  
  var leftContent: js.UndefOr[ReactElement] = js.native
  
  var mode: js.UndefOr[dark | light] = js.native
  
  var onLeftClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var rightContent: js.UndefOr[ReactElement] = js.native
}
object NavBarProps {
  
  @scala.inline
  def apply(): NavBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavBarProps]
  }
  
  @scala.inline
  implicit class NavBarPropsOps[Self <: NavBarProps] (val x: Self) extends AnyVal {
    
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
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLeftContentReactElement(value: ReactElement): Self = this.set("leftContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftContent(value: ReactElement): Self = this.set("leftContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftContent: Self = this.set("leftContent", js.undefined)
    
    @scala.inline
    def setMode(value: dark | light): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnLeftClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onLeftClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLeftClick: Self = this.set("onLeftClick", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRightContentReactElement(value: ReactElement): Self = this.set("rightContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightContent(value: ReactElement): Self = this.set("rightContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightContent: Self = this.set("rightContent", js.undefined)
  }
}
