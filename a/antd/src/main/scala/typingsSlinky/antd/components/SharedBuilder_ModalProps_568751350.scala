package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.buttonButtonMod.ButtonProps
import typingsSlinky.antd.buttonButtonMod.LegacyButtonType
import typingsSlinky.antd.modalModalMod.getContainerFunc
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ModalProps_568751350[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def afterClose(value: () => Unit): this.type = set("afterClose", js.Any.fromFunction0(value))
  @scala.inline
  def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def cancelButtonProps(value: ButtonProps): this.type = set("cancelButtonProps", value.asInstanceOf[js.Any])
  @scala.inline
  def cancelTextReactElement(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
  @scala.inline
  def cancelText(value: TagMod[Any]): this.type = set("cancelText", value.asInstanceOf[js.Any])
  @scala.inline
  def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
  @scala.inline
  def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def closeIcon(value: TagMod[Any]): this.type = set("closeIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def confirmLoading(value: Boolean): this.type = set("confirmLoading", value.asInstanceOf[js.Any])
  @scala.inline
  def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
  @scala.inline
  def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
  @scala.inline
  def footer(value: TagMod[Any]): this.type = set("footer", value.asInstanceOf[js.Any])
  @scala.inline
  def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  @scala.inline
  def getContainerHTMLElement(value: HTMLElement): this.type = set("getContainer", value.asInstanceOf[js.Any])
  @scala.inline
  def getContainerFunction0(value: () => HTMLElement): this.type = set("getContainer", js.Any.fromFunction0(value))
  @scala.inline
  def getContainer(value: String | HTMLElement | getContainerFunc | `false`): this.type = set("getContainer", value.asInstanceOf[js.Any])
  @scala.inline
  def getContainerNull: this.type = set("getContainer", null)
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
  def okTextReactElement(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
  @scala.inline
  def okText(value: TagMod[Any]): this.type = set("okText", value.asInstanceOf[js.Any])
  @scala.inline
  def okType(value: LegacyButtonType): this.type = set("okType", value.asInstanceOf[js.Any])
  @scala.inline
  def onCancel(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
  @scala.inline
  def onOk(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: TagMod[Any] | String): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  @scala.inline
  def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  @scala.inline
  def wrapClassName(value: String): this.type = set("wrapClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def wrapProps(value: js.Any): this.type = set("wrapProps", value.asInstanceOf[js.Any])
  @scala.inline
  def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}

