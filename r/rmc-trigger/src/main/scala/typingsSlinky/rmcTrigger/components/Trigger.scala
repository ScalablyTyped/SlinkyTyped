package typingsSlinky.rmcTrigger.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rmcTrigger.propsTypeMod.ITriggerProps
import typingsSlinky.rmcTrigger.triggerMod.IProptypes
import typingsSlinky.rmcTrigger.triggerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Trigger
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rmc-trigger/lib/Trigger", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onClose: () => Unit,
    onTargetClick: () => Unit,
    popup: TagMod[Any] | js.Function,
    visible: Boolean,
    afterPopupVisibleChange: js.Function = null,
    builtinPlacements: js.Any = null,
    defaultPopupVisible: js.UndefOr[Boolean] = js.undefined,
    destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined,
    getDocument: js.Function = null,
    getPopupClassNameFromAlign: js.Any = null,
    getPopupContainer: js.Function = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskAnimation: String = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskTransitionName: String | js.Object = null,
    onPopupAlign: js.Function = null,
    onPopupVisibleChange: js.Function = null,
    popupAlign: js.Any = null,
    popupAnimation: js.Any = null,
    popupClassName: String = null,
    popupPlacement: String = null,
    popupStyle: js.Any = null,
    popupTransitionName: String | js.Object = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    zIndex: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onTargetClick = js.Any.fromFunction0(onTargetClick), popup = popup.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    if (afterPopupVisibleChange != null) __obj.updateDynamic("afterPopupVisibleChange")(afterPopupVisibleChange.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPopupVisible)) __obj.updateDynamic("defaultPopupVisible")(defaultPopupVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyPopupOnHide)) __obj.updateDynamic("destroyPopupOnHide")(destroyPopupOnHide.asInstanceOf[js.Any])
    if (getDocument != null) __obj.updateDynamic("getDocument")(getDocument.asInstanceOf[js.Any])
    if (getPopupClassNameFromAlign != null) __obj.updateDynamic("getPopupClassNameFromAlign")(getPopupClassNameFromAlign.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (onPopupAlign != null) __obj.updateDynamic("onPopupAlign")(onPopupAlign.asInstanceOf[js.Any])
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(onPopupVisibleChange.asInstanceOf[js.Any])
    if (popupAlign != null) __obj.updateDynamic("popupAlign")(popupAlign.asInstanceOf[js.Any])
    if (popupAnimation != null) __obj.updateDynamic("popupAnimation")(popupAnimation.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (popupTransitionName != null) __obj.updateDynamic("popupTransitionName")(popupTransitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITriggerProps with IProptypes
}

