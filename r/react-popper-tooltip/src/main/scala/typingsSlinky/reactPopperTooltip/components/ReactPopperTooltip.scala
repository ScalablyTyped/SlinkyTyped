package typingsSlinky.reactPopperTooltip.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MutationObserverInit
import slinky.core.facade.ReactElement
import typingsSlinky.popperjsCore.enumsMod.Placement
import typingsSlinky.reactPopper.mod.Modifier
import typingsSlinky.reactPopperTooltip.mod.default
import typingsSlinky.reactPopperTooltip.typesMod.ChildrenArg
import typingsSlinky.reactPopperTooltip.typesMod.TooltipArg
import typingsSlinky.reactPopperTooltip.typesMod.TooltipTriggerProps
import typingsSlinky.reactPopperTooltip.typesMod.Trigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPopperTooltip {
  
  @scala.inline
  def apply(
    children: ChildrenArg => ReactElement,
    closeOnReferenceHidden: Boolean,
    defaultTooltipShown: Boolean,
    delayHide: Double,
    delayShow: Double,
    followCursor: Boolean,
    modifiers: js.Array[Modifier[_, js.Object]],
    mutationObserverOptions: MutationObserverInit,
    onVisibilityChange: Boolean => Unit,
    placement: Placement,
    portalContainer: HTMLElement,
    tooltip: TooltipArg => ReactElement,
    trigger: Trigger,
    usePortal: Boolean
  ): SharedBuilder_TooltipTriggerProps102580951[default] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), closeOnReferenceHidden = closeOnReferenceHidden.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], onVisibilityChange = js.Any.fromFunction1(onVisibilityChange), placement = placement.asInstanceOf[js.Any], portalContainer = portalContainer.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
    new SharedBuilder_TooltipTriggerProps102580951[default](js.Array(this.component, __props.asInstanceOf[TooltipTriggerProps]))
  }
  
  @JSImport("react-popper-tooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TooltipTriggerProps): SharedBuilder_TooltipTriggerProps102580951[default] = new SharedBuilder_TooltipTriggerProps102580951[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
