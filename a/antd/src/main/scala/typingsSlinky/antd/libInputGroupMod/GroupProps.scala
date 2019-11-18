package typingsSlinky.antd.libInputGroupMod

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.FocusEventHandler
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[large | small | typingsSlinky.antd.antdStrings.default] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GroupProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    onBlur: SyntheticFocusEvent[HTMLSpanElement] => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLSpanElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLSpanElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLSpanElement] => Unit = null,
    prefixCls: String = null,
    size: large | small | typingsSlinky.antd.antdStrings.default = null,
    style: CSSProperties = null
  ): GroupProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupProps]
  }
}

