package typingsSlinky.rmcDialog.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_IDialogPropTypes371968260[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def afterClose(value: () => Unit): this.type = set("afterClose", js.Any.fromFunction0(value))
  @scala.inline
  def animation(value: js.Any): this.type = set("animation", value.asInstanceOf[js.Any])
  @scala.inline
  def bodyStyle(value: js.Object): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
  @scala.inline
  def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
  @scala.inline
  def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
  @scala.inline
  def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
  @scala.inline
  def maskAnimation(value: js.Any): this.type = set("maskAnimation", value.asInstanceOf[js.Any])
  @scala.inline
  def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
  @scala.inline
  def maskProps(value: js.Any): this.type = set("maskProps", value.asInstanceOf[js.Any])
  @scala.inline
  def maskStyle(value: js.Object): this.type = set("maskStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
  @scala.inline
  def onAnimateLeave(value: () => Unit): this.type = set("onAnimateLeave", js.Any.fromFunction0(value))
  @scala.inline
  def onClose(value: /* e */ js.Any => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  @scala.inline
  def wrapClassName(value: String): this.type = set("wrapClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def wrapProps(value: js.Any): this.type = set("wrapProps", value.asInstanceOf[js.Any])
  @scala.inline
  def wrapStyle(value: js.Object): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}

