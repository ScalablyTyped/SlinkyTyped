package typingsSlinky.reactPopperTooltip.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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

object Tooltip {
  @JSImport("react-popper-tooltip/dist/Tooltip", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def innerRefFunction1(value: /* element */ HTMLElement | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def innerRef(value: Ref): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    @scala.inline
    def outOfBoundaries(value: Boolean): this.type = set("outOfBoundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def outOfBoundariesNull: this.type = set("outOfBoundaries", null)
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    clearScheduled: () => Unit,
    closeOnOutOfBoundaries: Boolean,
    hideTooltip: () => Unit,
    placement: Placement,
    scheduleUpdate: () => Unit,
    style: CSSProperties,
    tooltip: TooltipArg => TagMod[Any],
    trigger: Trigger
  ): Builder = {
    val __props = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], clearScheduled = js.Any.fromFunction0(clearScheduled), closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), placement = placement.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
}

