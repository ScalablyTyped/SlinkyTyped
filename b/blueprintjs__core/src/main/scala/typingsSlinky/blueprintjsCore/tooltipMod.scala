package typingsSlinky.blueprintjsCore

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.anon.PartialITooltipProps
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`hover-target`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.hover
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.popoverSharedPropsMod.IPopoverSharedProps
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tooltip/tooltip", "Tooltip")
  @js.native
  class Tooltip protected ()
    extends AbstractPureComponent2[ITooltipProps, js.Object, js.Object] {
    def this(props: ITooltipProps) = this()
    def this(props: ITooltipProps, context: js.Any) = this()
    
    var popover: js.Any = js.native
    
    def reposition(): Unit = js.native
  }
  /* static members */
  object Tooltip {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tooltip/tooltip", "Tooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/tooltip/tooltip", "Tooltip.defaultProps")
    @js.native
    def defaultProps: PartialITooltipProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialITooltipProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tooltip/tooltip", "Tooltip.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
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
    implicit class ITooltipPropsMutableBuilder[Self <: ITooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionKind(value: hover | `hover-target`): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
    }
  }
}
