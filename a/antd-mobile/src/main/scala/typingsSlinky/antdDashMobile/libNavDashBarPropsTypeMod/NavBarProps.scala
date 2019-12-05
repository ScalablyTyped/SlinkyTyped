package typingsSlinky.antdDashMobile.libNavDashBarPropsTypeMod

import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antdDashMobile.antdDashMobileStrings.dark
import typingsSlinky.antdDashMobile.antdDashMobileStrings.light
import typingsSlinky.react.reactMod.AllHTMLAttributes
import typingsSlinky.react.reactMod.ClassAttributes
import typingsSlinky.react.reactMod.MouseEventHandler
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavBarProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var leftContent: js.UndefOr[TagMod[Any]] = js.undefined
  var mode: js.UndefOr[dark | light] = js.undefined
  var onLeftClick: js.UndefOr[MouseEventHandler[org.scalajs.dom.raw.HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rightContent: js.UndefOr[TagMod[Any]] = js.undefined
}

object NavBarProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLDivElement] = null,
    icon: TagMod[Any] = null,
    leftContent: TagMod[Any] = null,
    mode: dark | light = null,
    onLeftClick: SyntheticMouseEvent[org.scalajs.dom.raw.HTMLDivElement] => Unit = null,
    prefixCls: String = null,
    rightContent: TagMod[Any] = null
  ): NavBarProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (leftContent != null) __obj.updateDynamic("leftContent")(leftContent.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onLeftClick != null) __obj.updateDynamic("onLeftClick")(js.Any.fromFunction1(onLeftClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rightContent != null) __obj.updateDynamic("rightContent")(rightContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavBarProps]
  }
}

