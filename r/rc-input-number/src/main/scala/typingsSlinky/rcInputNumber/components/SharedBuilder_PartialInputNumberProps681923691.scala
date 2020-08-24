package typingsSlinky.rcInputNumber.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcInputNumber.interfaceMod.ISize
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_PartialInputNumberProps681923691[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def decimalSeparator(value: String): this.type = set("decimalSeparator", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def downHandler(value: ReactElement): this.type = set("downHandler", value.asInstanceOf[js.Any])
  @scala.inline
  def focusOnUpDown(value: Boolean): this.type = set("focusOnUpDown", value.asInstanceOf[js.Any])
  @scala.inline
  def formatter(value: /* value */ js.UndefOr[Double | String] => String): this.type = set("formatter", js.Any.fromFunction1(value))
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  @scala.inline
  def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
  @scala.inline
  def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  @scala.inline
  def onBlur(value: /* repeated */ js.Any => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  @scala.inline
  def onChange(value: /* value */ js.UndefOr[Double | String] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onFocus(value: /* repeated */ js.Any => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  @scala.inline
  def onKeyDown(value: (/* e */ js.Any, /* repeated */ js.Any) => Unit): this.type = set("onKeyDown", js.Any.fromFunction2(value))
  @scala.inline
  def onKeyUp(value: (/* e */ js.Any, /* repeated */ js.Any) => Unit): this.type = set("onKeyUp", js.Any.fromFunction2(value))
  @scala.inline
  def onMouseUp(value: /* repeated */ js.Any => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
  @scala.inline
  def onPressEnter(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onPressEnter", js.Any.fromFunction1(value))
  @scala.inline
  def parser(value: /* displayValue */ js.UndefOr[String] => Double | String): this.type = set("parser", js.Any.fromFunction1(value))
  @scala.inline
  def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  @scala.inline
  def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  @scala.inline
  def size(value: ISize): this.type = set("size", value.asInstanceOf[js.Any])
  @scala.inline
  def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def upHandler(value: ReactElement): this.type = set("upHandler", value.asInstanceOf[js.Any])
  @scala.inline
  def useTouch(value: Boolean): this.type = set("useTouch", value.asInstanceOf[js.Any])
  @scala.inline
  def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
}

