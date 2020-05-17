package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.anon.Target
import typingsSlinky.antdMobileRn.radioStyleIndexNativeMod.IRadioStyle
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_RadioNativeProps_282866953[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: /* e */ Target => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def style(value: StyleProp[ImageStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def styleNull: this.type = set("style", null)
  @scala.inline
  def styles(value: IRadioStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  @scala.inline
  def wrapLabel(value: Boolean): this.type = set("wrapLabel", value.asInstanceOf[js.Any])
}

