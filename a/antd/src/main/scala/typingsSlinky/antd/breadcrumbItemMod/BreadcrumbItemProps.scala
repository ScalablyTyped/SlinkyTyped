package typingsSlinky.antd.breadcrumbItemMod

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.dropdownDropdownMod.DropDownProps
import typingsSlinky.antd.dropdownDropdownMod.OverlayFunc
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbItemProps extends js.Object {
  var dropdownProps: js.UndefOr[DropDownProps] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement | HTMLSpanElement]] = js.undefined
  var overlay: js.UndefOr[ReactElement | OverlayFunc] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[TagMod[Any]] = js.undefined
}

object BreadcrumbItemProps {
  @scala.inline
  def apply(
    dropdownProps: DropDownProps = null,
    href: String = null,
    onClick: SyntheticMouseEvent[HTMLAnchorElement | HTMLSpanElement] => Unit = null,
    overlay: ReactElement | OverlayFunc = null,
    prefixCls: String = null,
    separator: TagMod[Any] = null
  ): BreadcrumbItemProps = {
    val __obj = js.Dynamic.literal()
    if (dropdownProps != null) __obj.updateDynamic("dropdownProps")(dropdownProps.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbItemProps]
  }
}

