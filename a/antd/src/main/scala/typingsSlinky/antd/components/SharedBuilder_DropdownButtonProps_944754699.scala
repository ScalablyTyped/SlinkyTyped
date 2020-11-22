package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.click
import typingsSlinky.antd.antdStrings.contextMenu
import typingsSlinky.antd.antdStrings.hover
import typingsSlinky.antd.buttonButtonMod.ButtonHTMLType
import typingsSlinky.antd.configProviderSizeContextMod.SizeType
import typingsSlinky.antd.dropdownButtonMod.DropdownButtonType
import typingsSlinky.antd.dropdownDropdownMod.Align
import typingsSlinky.antd.dropdownDropdownMod.Placement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DropdownButtonProps_944754699 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
  
  @scala.inline
  def arrow(value: Boolean): this.type = set("arrow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def buttonsRender(value: /* buttons */ js.Array[ReactElement] => js.Array[ReactElement]): this.type = set("buttonsRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  @scala.inline
  def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
  
  @scala.inline
  def htmlType(value: ButtonHTMLType): this.type = set("htmlType", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onVisibleChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def triggerVarargs(value: (click | hover | contextMenu)*): this.type = set("trigger", js.Array(value :_*))
  
  @scala.inline
  def trigger(value: js.Array[click | hover | contextMenu]): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `type`(value: DropdownButtonType): this.type = set("type", value.asInstanceOf[js.Any])
  
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
