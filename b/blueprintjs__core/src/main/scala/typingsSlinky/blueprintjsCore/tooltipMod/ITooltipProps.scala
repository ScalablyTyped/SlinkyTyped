package typingsSlinky.blueprintjsCore.tooltipMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`hover-target`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.hover
import typingsSlinky.blueprintjsCore.popoverSharedPropsMod.IPopoverSharedProps
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipProps
  extends IPopoverSharedProps
     with IIntentProps {
  
  /**
    * The content that will be displayed inside of the tooltip.
    */
  var content: ReactElement | String = js.native
  
  /**
    * The kind of hover interaction that triggers the display of the tooltip.
    * Tooltips do not support click interactions.
    * @default PopoverInteractionKind.HOVER_TARGET_ONLY
    */
  var interactionKind: js.UndefOr[hover | `hover-target`] = js.native
}
object ITooltipProps {
  
  @scala.inline
  def apply(content: ReactElement | String): ITooltipProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipProps]
  }
  
  @scala.inline
  implicit class ITooltipPropsOps[Self <: ITooltipProps] (val x: Self) extends AnyVal {
    
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
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: ReactElement | String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionKind(value: hover | `hover-target`): Self = this.set("interactionKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractionKind: Self = this.set("interactionKind", js.undefined)
  }
}
