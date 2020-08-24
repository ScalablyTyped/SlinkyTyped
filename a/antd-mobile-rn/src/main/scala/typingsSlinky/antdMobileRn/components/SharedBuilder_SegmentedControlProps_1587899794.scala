package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_SegmentedControlProps_1587899794[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: /* e */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onValueChange(value: /* value */ String => Unit): this.type = set("onValueChange", js.Any.fromFunction1(value))
  @scala.inline
  def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def styleNull: this.type = set("style", null)
  @scala.inline
  def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
  @scala.inline
  def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
  @scala.inline
  def valuesVarargs(value: String*): this.type = set("values", js.Array(value :_*))
  @scala.inline
  def values(value: js.Array[String]): this.type = set("values", value.asInstanceOf[js.Any])
}

