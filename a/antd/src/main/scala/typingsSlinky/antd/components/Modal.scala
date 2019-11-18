package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdNumbers.`false`
import typingsSlinky.antd.esButtonButtonMod.ButtonType
import typingsSlinky.antd.esButtonButtonMod.NativeButtonProps
import typingsSlinky.antd.esModalMod.default
import typingsSlinky.antd.esModalModalMod.ModalProps
import typingsSlinky.antd.esModalModalMod.getContainerFunc
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, width */
object Modal
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esModalMod.default].asInstanceOf[String | js.Object]
  def apply(
    afterClose: () => Unit = null,
    bodyStyle: CSSProperties = null,
    cancelButtonProps: NativeButtonProps = null,
    cancelText: TagMod[Any] = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: TagMod[Any] = null,
    confirmLoading: js.UndefOr[Boolean] = js.undefined,
    destroyOnClose: js.UndefOr[Boolean] = js.undefined,
    footer: TagMod[Any] = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getContainer: String | HTMLElement | getContainerFunc | `false` = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    maskTransitionName: String = null,
    okButtonProps: NativeButtonProps = null,
    okText: TagMod[Any] = null,
    okType: ButtonType = null,
    onCancel: /* e */ SyntheticMouseEvent[HTMLElement] => Unit = null,
    onOk: /* e */ SyntheticMouseEvent[HTMLElement] => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: TagMod[Any] | String = null,
    transitionName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapClassName: String = null,
    wrapProps: js.Any = null,
    zIndex: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(confirmLoading)) __obj.updateDynamic("confirmLoading")(confirmLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName.asInstanceOf[js.Any])
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalProps
}

