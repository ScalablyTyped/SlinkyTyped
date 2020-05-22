package typingsSlinky.reactPopperTooltip.typesMod

import org.scalajs.dom.raw.MutationObserverInit
import slinky.core.TagMod
import typingsSlinky.popperJs.mod.Popper.Placement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactPopper.mod.PopperArrowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var arrowProps: PopperArrowProps
  var closeOnOutOfBoundaries: Boolean
  var innerRef: Ref
  var mutationObserverOptions: MutationObserverInit
  var outOfBoundaries: Boolean | Null
  var placement: Placement
  var style: CSSProperties
  var trigger: Trigger
  def clearScheduled(): Unit
  def hideTooltip(): Unit
  def scheduleUpdate(): Unit
  def tooltip(arg: TooltipArg): TagMod[Any]
}

object TooltipProps {
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    clearScheduled: () => Unit,
    closeOnOutOfBoundaries: Boolean,
    hideTooltip: () => Unit,
    mutationObserverOptions: MutationObserverInit,
    placement: Placement,
    scheduleUpdate: () => Unit,
    style: CSSProperties,
    tooltip: TooltipArg => TagMod[Any],
    trigger: Trigger,
    innerRef: Ref = null,
    outOfBoundaries: Boolean = null.asInstanceOf[Boolean]
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], clearScheduled = js.Any.fromFunction0(clearScheduled), closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any], outOfBoundaries = outOfBoundaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

