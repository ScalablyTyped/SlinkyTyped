package typingsSlinky.antDashDesignDashPro.libHeaderDropdownMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.bottomCenter
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.bottomLeft
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.bottomRight
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.topCenter
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.topLeft
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.topRight
import typingsSlinky.antd.antdStrings.click
import typingsSlinky.antd.antdStrings.contextMenu
import typingsSlinky.antd.antdStrings.hover
import typingsSlinky.antd.libDropdownDropdownMod.Align
import typingsSlinky.antd.libDropdownDropdownMod.DropDownProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderDropdownProps extends DropDownProps {
  @JSName("overlay")
  var overlay_HeaderDropdownProps: TagMod[Any] | OverlayFunc
  @JSName("placement")
  var placement_HeaderDropdownProps: js.UndefOr[bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter] = js.undefined
}

object HeaderDropdownProps {
  @scala.inline
  def apply(
    overlay: TagMod[Any] | OverlayFunc,
    align: Align = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    openClassName: String = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter = null,
    prefixCls: String = null,
    transitionName: String = null,
    trigger: js.Array[click | hover | contextMenu] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): HeaderDropdownProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderDropdownProps]
  }
}

