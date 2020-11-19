package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.antdStrings.cancel
import typingsSlinky.antd.antdStrings.ok
import typingsSlinky.antd.buttonButtonMod.ButtonProps
import typingsSlinky.antd.buttonButtonMod.LegacyButtonType
import typingsSlinky.antd.confirmDialogMod.ConfirmDialogProps
import typingsSlinky.antd.modalModalMod.getContainerFunc
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfirmDialog {
  
  @JSImport("antd/lib/modal/ConfirmDialog", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def afterClose(value: () => Unit): this.type = set("afterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def autoFocusButton(value: ok | cancel): this.type = set("autoFocusButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocusButtonNull: this.type = set("autoFocusButton", null)
    
    @scala.inline
    def cancelButtonProps(value: ButtonProps): this.type = set("cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelTextReactElement(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelText(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainerHTMLElement(value: HTMLElement): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainerFunction0(value: () => HTMLElement): this.type = set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def getContainer(value: String | HTMLElement | getContainerFunc | `false`): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainerNull: this.type = set("getContainer", null)
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskStyle(value: CSSProperties): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okButtonProps(value: ButtonProps): this.type = set("okButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okCancel(value: Boolean): this.type = set("okCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okTextReactElement(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okText(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okType(value: LegacyButtonType): this.type = set("okType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCancel(value: /* repeated */ js.Any => _): this.type = set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOk(value: /* repeated */ js.Any => _): this.type = set("onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootPrefixCls(value: String): this.type = set("rootPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConfirmDialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(close: /* repeated */ js.Any => Unit): Builder = {
    val __props = js.Dynamic.literal(close = js.Any.fromFunction1(close))
    new Builder(js.Array(this.component, __props.asInstanceOf[ConfirmDialogProps]))
  }
}
