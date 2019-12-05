package typingsSlinky.antdDashMobile.libWhiteDashSpaceMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antdDashMobile.antdDashMobileStrings.lg
import typingsSlinky.antdDashMobile.antdDashMobileStrings.md
import typingsSlinky.antdDashMobile.antdDashMobileStrings.sm
import typingsSlinky.antdDashMobile.antdDashMobileStrings.xl
import typingsSlinky.antdDashMobile.antdDashMobileStrings.xs
import typingsSlinky.antdDashMobile.libWhiteDashSpacePropsTypeMod.WhiteSpacePropsType
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends WhiteSpacePropsType {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(
    className: String = null,
    onClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    prefixCls: String = null,
    size: xs | sm | md | lg | xl = null,
    style: CSSProperties = null
  ): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

