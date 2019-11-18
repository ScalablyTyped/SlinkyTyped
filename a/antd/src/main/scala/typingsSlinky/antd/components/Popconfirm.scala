package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esButtonButtonMod.ButtonType
import typingsSlinky.antd.esButtonButtonMod.NativeButtonProps
import typingsSlinky.antd.esPopconfirmMod.PopconfirmProps
import typingsSlinky.antd.esPopconfirmMod.default
import typingsSlinky.antd.esTooltipMod.TooltipAlignConfig
import typingsSlinky.antd.esTooltipMod.TooltipPlacement
import typingsSlinky.antd.esTooltipMod.TooltipTrigger
import typingsSlinky.antd.esTooltipPlacementsMod.AdjustOverflow
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, disabled */
object Popconfirm
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esPopconfirmMod.default].asInstanceOf[String | js.Object]
  def apply(
    title: TagMod[Any],
    align: TooltipAlignConfig = null,
    arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined,
    autoAdjustOverflow: Boolean | AdjustOverflow = null,
    builtinPlacements: js.Object = null,
    cancelButtonProps: NativeButtonProps = null,
    cancelText: TagMod[Any] = null,
    defaultVisible: js.UndefOr[Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    getTooltipContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    icon: TagMod[Any] = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    okButtonProps: NativeButtonProps = null,
    okText: TagMod[Any] = null,
    okType: ButtonType = null,
    onCancel: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit = null,
    onConfirm: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit = null,
    onVisibleChange: (/* visible */ Boolean, /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]]) => Unit = null,
    openClassName: String = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: TooltipPlacement = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    transitionName: String = null,
    trigger: TooltipTrigger = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter.asInstanceOf[js.Any])
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(js.Any.fromFunction1(getTooltipContainer))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1(onConfirm))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction2(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopconfirmProps
}

