package typingsSlinky.antDesignPro.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.antDesignProStrings.bottomCenter
import typingsSlinky.antDesignPro.antDesignProStrings.bottomLeft
import typingsSlinky.antDesignPro.antDesignProStrings.bottomRight
import typingsSlinky.antDesignPro.antDesignProStrings.topCenter
import typingsSlinky.antDesignPro.antDesignProStrings.topLeft
import typingsSlinky.antDesignPro.antDesignProStrings.topRight
import typingsSlinky.antDesignPro.headerDropdownMod.HeaderDropdownProps
import typingsSlinky.antDesignPro.headerDropdownMod.OverlayFunc
import typingsSlinky.antd.antdStrings.click
import typingsSlinky.antd.antdStrings.contextMenu
import typingsSlinky.antd.antdStrings.hover
import typingsSlinky.antd.dropdownDropdownMod.Align
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderDropdown {
  
  @JSImport("ant-design-pro", "HeaderDropdown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.mod.HeaderDropdown] {
    
    @scala.inline
    def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrow(value: Boolean): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlay(value: ReactElement | OverlayFunc): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trigger(value: js.Array[click | hover | contextMenu]): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerVarargs(value: (click | hover | contextMenu)*): this.type = set("trigger", js.Array(value :_*))
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HeaderDropdown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HeaderDropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
