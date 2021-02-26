package typingsSlinky.reactPopperTooltip.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MutationObserverInit
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.popperjsCore.enumsMod.Placement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactPopper.mod.PopperArrowProps
import typingsSlinky.reactPopperTooltip.tooltipMod.default
import typingsSlinky.reactPopperTooltip.typesMod.Ref
import typingsSlinky.reactPopperTooltip.typesMod.TooltipArg
import typingsSlinky.reactPopperTooltip.typesMod.TooltipProps
import typingsSlinky.reactPopperTooltip.typesMod.Trigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    clearScheduled: () => Unit,
    closeOnReferenceHidden: Boolean,
    hideTooltip: () => Unit,
    mutationObserverOptions: MutationObserverInit,
    placement: Placement,
    style: CSSProperties,
    tooltip: TooltipArg => ReactElement,
    trigger: Trigger,
    update: () => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], clearScheduled = js.Any.fromFunction0(clearScheduled), closeOnReferenceHidden = closeOnReferenceHidden.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    new Builder(js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
  
  @JSImport("react-popper-tooltip/dist/Tooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def innerRef(value: Ref): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* element */ HTMLElement | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    
    @scala.inline
    def isReferenceHidden(value: Boolean): this.type = set("isReferenceHidden", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
