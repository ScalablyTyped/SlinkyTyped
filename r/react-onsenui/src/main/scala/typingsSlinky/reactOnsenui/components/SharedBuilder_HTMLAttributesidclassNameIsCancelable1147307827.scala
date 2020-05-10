package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.default
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_HTMLAttributesidclassNameIsCancelable1147307827[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def animation(value: none | default): this.type = set("animation", value.asInstanceOf[js.Any])
  @scala.inline
  def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  @scala.inline
  def isCancelable(value: Boolean): this.type = set("isCancelable", value.asInstanceOf[js.Any])
  @scala.inline
  def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
  @scala.inline
  def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
  @scala.inline
  def maskColor(value: String): this.type = set("maskColor", value.asInstanceOf[js.Any])
  @scala.inline
  def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
  @scala.inline
  def onCancel(value: () => Unit): this.type = set("onCancel", js.Any.fromFunction0(value))
  @scala.inline
  def onPostHide(value: () => Unit): this.type = set("onPostHide", js.Any.fromFunction0(value))
  @scala.inline
  def onPostShow(value: () => Unit): this.type = set("onPostShow", js.Any.fromFunction0(value))
  @scala.inline
  def onPreHide(value: () => Unit): this.type = set("onPreHide", js.Any.fromFunction0(value))
  @scala.inline
  def onPreShow(value: () => Unit): this.type = set("onPreShow", js.Any.fromFunction0(value))
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}

