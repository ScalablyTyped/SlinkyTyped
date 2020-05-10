package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.tagStyleIndexNativeMod.ITagStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_TagNativeProps1198250225[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def afterClose(value: () => Unit): this.type = set("afterClose", js.Any.fromFunction0(value))
  @scala.inline
  def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: /* selected */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
  @scala.inline
  def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
  @scala.inline
  def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  @scala.inline
  def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def styleNull: this.type = set("style", null)
  @scala.inline
  def styles(value: ITagStyle): this.type = set("styles", value.asInstanceOf[js.Any])
}

