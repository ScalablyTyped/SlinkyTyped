package typingsSlinky.reactPopperTooltip.typesMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MutationObserverInit
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactPopper.mod.PopperArrowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProps extends js.Object {
  
  var arrowProps: PopperArrowProps = js.native
  
  def clearScheduled(): Unit = js.native
  
  var closeOnOutOfBoundaries: Boolean = js.native
  
  def hideTooltip(): Unit = js.native
  
  var innerRef: Ref = js.native
  
  var mutationObserverOptions: MutationObserverInit = js.native
  
  var outOfBoundaries: Boolean | Null = js.native
  
  var placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any = js.native
  
  def scheduleUpdate(): Unit = js.native
  
  var style: CSSProperties = js.native
  
  def tooltip(arg: TooltipArg): ReactElement = js.native
  
  var trigger: Trigger = js.native
}
object TooltipProps {
  
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    clearScheduled: () => Unit,
    closeOnOutOfBoundaries: Boolean,
    hideTooltip: () => Unit,
    mutationObserverOptions: MutationObserverInit,
    placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any,
    scheduleUpdate: () => Unit,
    style: CSSProperties,
    tooltip: TooltipArg => ReactElement,
    trigger: Trigger
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], clearScheduled = js.Any.fromFunction0(clearScheduled), closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrowProps(value: PopperArrowProps): Self = this.set("arrowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearScheduled(value: () => Unit): Self = this.set("clearScheduled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseOnOutOfBoundaries(value: Boolean): Self = this.set("closeOnOutOfBoundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTooltip(value: () => Unit): Self = this.set("hideTooltip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMutationObserverOptions(value: MutationObserverInit): Self = this.set("mutationObserverOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUpdate(value: () => Unit): Self = this.set("scheduleUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: TooltipArg => ReactElement): Self = this.set("tooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTriggerVarargs(value: TriggerTypes*): Self = this.set("trigger", js.Array(value :_*))
    
    @scala.inline
    def setTrigger(value: Trigger): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setOutOfBoundaries(value: Boolean): Self = this.set("outOfBoundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutOfBoundariesNull: Self = this.set("outOfBoundaries", null)
  }
}
