package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.span.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_GroupProps_418259250 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
  @scala.inline
  def onBlur(value: SyntheticFocusEvent[HTMLSpanElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  @scala.inline
  def onFocus(value: SyntheticFocusEvent[HTMLSpanElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def size(value: large | small | default): this.type = set("size", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}

