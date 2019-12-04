package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdNumbers.`false`
import typingsSlinky.antd.libDrawerMod.DrawerProps
import typingsSlinky.antd.libDrawerMod.EventType
import typingsSlinky.antd.libDrawerMod.getContainerFunc
import typingsSlinky.antd.libDrawerMod.placementType
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("antd/lib/drawer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, height, width */
  def apply(
    afterVisibleChange: /* visible */ Boolean => Unit = null,
    bodyStyle: CSSProperties = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    destroyOnClose: js.UndefOr[Boolean] = js.undefined,
    drawerStyle: CSSProperties = null,
    getContainer: String | HTMLElement | getContainerFunc | `false` = null,
    handler: TagMod[Any] = null,
    headerStyle: CSSProperties = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    onClose: /* e */ EventType => Unit = null,
    placement: placementType = null,
    prefixCls: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: TagMod[Any] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapClassName: String = null,
    zIndex: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1(afterVisibleChange))
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose.asInstanceOf[js.Any])
    if (drawerStyle != null) __obj.updateDynamic("drawerStyle")(drawerStyle.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DrawerProps
}

