package typingsSlinky.reactPopperTooltip.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.popperJs.mod.Popper.Modifiers
import typingsSlinky.popperJs.mod.Popper.Placement
import typingsSlinky.reactPopperTooltip.typesMod.Ref
import typingsSlinky.reactPopperTooltip.typesMod.TooltipArg
import typingsSlinky.reactPopperTooltip.typesMod.TooltipTriggerProps
import typingsSlinky.reactPopperTooltip.typesMod.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TooltipTriggerProps1656813916[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    closeOnOutOfBoundaries: Boolean,
    defaultTooltipShown: Boolean,
    delayHide: Double,
    delayShow: Double,
    followCursor: Boolean,
    onVisibilityChange: Boolean => Unit,
    placement: Placement,
    portalContainer: HTMLElement,
    tooltip: TooltipArg => TagMod[Any],
    trigger: Trigger,
    usePortal: Boolean,
    getTooltipRef: Ref = null,
    getTriggerRef: Ref = null,
    modifiers: Modifiers = null,
    tooltipShown: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], onVisibilityChange = js.Any.fromFunction1(onVisibilityChange), placement = placement.asInstanceOf[js.Any], portalContainer = portalContainer.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
    if (getTooltipRef != null) __obj.updateDynamic("getTooltipRef")(getTooltipRef.asInstanceOf[js.Any])
    if (getTriggerRef != null) __obj.updateDynamic("getTriggerRef")(getTriggerRef.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipShown)) __obj.updateDynamic("tooltipShown")(tooltipShown.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TooltipTriggerProps
}

