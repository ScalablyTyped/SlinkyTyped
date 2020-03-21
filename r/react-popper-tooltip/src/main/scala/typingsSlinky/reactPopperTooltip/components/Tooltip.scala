package typingsSlinky.reactPopperTooltip.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.popperJs.mod.Popper.Placement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactPopper.mod.PopperArrowProps
import typingsSlinky.reactPopperTooltip.tooltipMod.default
import typingsSlinky.reactPopperTooltip.typesMod.Ref
import typingsSlinky.reactPopperTooltip.typesMod.TooltipArg
import typingsSlinky.reactPopperTooltip.typesMod.TooltipProps
import typingsSlinky.reactPopperTooltip.typesMod.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-popper-tooltip/dist/Tooltip", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    arrowProps: PopperArrowProps,
    clearScheduled: () => Unit,
    closeOnOutOfBoundaries: Boolean,
    hideTooltip: () => Unit,
    placement: Placement,
    scheduleUpdate: () => Unit,
    style: CSSProperties,
    tooltip: TooltipArg => TagMod[Any],
    trigger: Trigger,
    innerRef: Ref = null,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], clearScheduled = js.Any.fromFunction0(clearScheduled), closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), placement = placement.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TooltipProps
}

