package typingsSlinky.rcTooltip.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcTooltip.mod.RCTooltip.Placement
import typingsSlinky.rcTooltip.mod.RCTooltip.Trigger
import typingsSlinky.rcTooltip.mod.default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.react.mod.ReactFragment
import typingsSlinky.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcTooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-tooltip", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    overlay: js.Function0[ReactChild] | ReactChild | ReactFragment | ReactPortal,
    afterVisibleChange: /* visible */ js.UndefOr[Boolean] => Unit = null,
    align: js.Object = null,
    arrowContent: TagMod[Any] = null,
    defaultVisible: js.UndefOr[Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined,
    getTooltipContainer: () => org.scalajs.dom.raw.Element = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onPopupAlign: (/* popupDomNode */ org.scalajs.dom.raw.Element, /* align */ js.Object) => Unit = null,
    onVisibleChange: /* visible */ js.UndefOr[Boolean] => Unit = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: Placement | js.Object = null,
    prefixCls: String = null,
    transitionName: String = null,
    trigger: js.Array[Trigger] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1(afterVisibleChange))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrowContent != null) __obj.updateDynamic("arrowContent")(arrowContent.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide.asInstanceOf[js.Any])
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(js.Any.fromFunction0(getTooltipContainer))
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onPopupAlign != null) __obj.updateDynamic("onPopupAlign")(js.Any.fromFunction2(onPopupAlign))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.rcTooltip.mod.RCTooltip.Props
}

