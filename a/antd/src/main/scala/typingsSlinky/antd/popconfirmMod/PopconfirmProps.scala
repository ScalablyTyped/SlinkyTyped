package typingsSlinky.antd.popconfirmMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.buttonButtonMod.LegacyButtonType
import typingsSlinky.antd.buttonButtonMod.NativeButtonProps
import typingsSlinky.antd.getRenderPropValueMod.RenderFunction
import typingsSlinky.antd.placementsMod.AdjustOverflow
import typingsSlinky.antd.tooltipMod.AbstractTooltipProps
import typingsSlinky.antd.tooltipMod.TooltipPlacement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopconfirmProps extends AbstractTooltipProps {
  var cancelButtonProps: js.UndefOr[NativeButtonProps] = js.undefined
  var cancelText: js.UndefOr[TagMod[Any]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var okButtonProps: js.UndefOr[NativeButtonProps] = js.undefined
  var okText: js.UndefOr[TagMod[Any]] = js.undefined
  var okType: js.UndefOr[LegacyButtonType] = js.undefined
  var onCancel: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]] = js.undefined
  var onConfirm: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]] = js.undefined
  var onVisibleChange: js.UndefOr[
    js.Function2[/* visible */ Boolean, /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]
  ] = js.undefined
  var title: TagMod[Any] | RenderFunction
}

object PopconfirmProps {
  @scala.inline
  def apply(
    arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined,
    autoAdjustOverflow: Boolean | AdjustOverflow = null,
    builtinPlacements: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any = null,
    cancelButtonProps: NativeButtonProps = null,
    cancelText: TagMod[Any] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    icon: TagMod[Any] = null,
    okButtonProps: NativeButtonProps = null,
    okText: TagMod[Any] = null,
    okType: LegacyButtonType = null,
    onCancel: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit = null,
    onConfirm: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit = null,
    onVisibleChange: (/* visible */ Boolean, /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]]) => Unit = null,
    openClassName: String = null,
    placement: TooltipPlacement = null,
    style: CSSProperties = null,
    title: TagMod[Any] | RenderFunction = null
  ): PopconfirmProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter.get.asInstanceOf[js.Any])
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1(onConfirm))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction2(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopconfirmProps]
  }
}

