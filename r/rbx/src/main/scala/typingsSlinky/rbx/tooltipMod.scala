package typingsSlinky.rbx

import typingsSlinky.propTypes.mod.ValidationMap
import typingsSlinky.rbx.anon.KinVariablesbreakpointsco
import typingsSlinky.rbx.anon.PartialVariablesDefinitio
import typingsSlinky.rbx.anon.`5`
import typingsSlinky.rbx.factoryMod.MakeValidatingTransformFunction
import typingsSlinky.rbx.factoryMod.TransformFunction
import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.bottom
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.info
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.light
import typingsSlinky.rbx.rbxStrings.link
import typingsSlinky.rbx.rbxStrings.primary
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.success
import typingsSlinky.rbx.rbxStrings.top
import typingsSlinky.rbx.rbxStrings.warning
import typingsSlinky.rbx.rbxStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("rbx/base/helpers/tooltip", "makePropTypes")
  @js.native
  def makePropTypes(): ValidationMap[_] = js.native
  @JSImport("rbx/base/helpers/tooltip", "makePropTypes")
  @js.native
  def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[_] = js.native
  
  @JSImport("rbx/base/helpers/tooltip", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[TooltipHelpersProps, `5`] = js.native
  
  @JSImport("rbx/base/helpers/tooltip", "transform")
  @js.native
  val transform: TransformFunction[TooltipHelpersProps, `5`] = js.native
  
  @js.native
  trait TooltipHelpersProps extends StObject {
    
    var tooltip: js.UndefOr[Double | String] = js.native
    
    var tooltipActive: js.UndefOr[Boolean] = js.native
    
    var tooltipColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.native
    
    var tooltipMultiline: js.UndefOr[Boolean] = js.native
    
    var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.native
    
    var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsco] = js.native
  }
  object TooltipHelpersProps {
    
    @scala.inline
    def apply(): TooltipHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipHelpersProps]
    }
    
    @scala.inline
    implicit class TooltipHelpersPropsMutableBuilder[Self <: TooltipHelpersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTooltip(value: Double | String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipActive(value: Boolean): Self = StObject.set(x, "tooltipActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipActiveUndefined: Self = StObject.set(x, "tooltipActive", js.undefined)
      
      @scala.inline
      def setTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "tooltipColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipColorUndefined: Self = StObject.set(x, "tooltipColor", js.undefined)
      
      @scala.inline
      def setTooltipMultiline(value: Boolean): Self = StObject.set(x, "tooltipMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipMultilineUndefined: Self = StObject.set(x, "tooltipMultiline", js.undefined)
      
      @scala.inline
      def setTooltipPosition(value: top | right | bottom | left): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      @scala.inline
      def setTooltipResponsive(value: KinVariablesbreakpointsco): Self = StObject.set(x, "tooltipResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipResponsiveUndefined: Self = StObject.set(x, "tooltipResponsive", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
