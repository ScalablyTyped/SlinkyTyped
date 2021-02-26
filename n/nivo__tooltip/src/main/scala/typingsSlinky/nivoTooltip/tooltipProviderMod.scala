package typingsSlinky.nivoTooltip

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipProviderMod {
  
  @JSImport("@nivo/tooltip/dist/types/TooltipProvider", "TooltipProvider")
  @js.native
  def TooltipProvider(hasContainerChildren: PropsWithChildren[TooltipProviderProps]): ReactElement = js.native
  
  @js.native
  trait TooltipProviderProps extends StObject {
    
    var container: MutableRefObject[HTMLDivElement] = js.native
  }
  object TooltipProviderProps {
    
    @scala.inline
    def apply(container: MutableRefObject[HTMLDivElement]): TooltipProviderProps = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProviderProps]
    }
    
    @scala.inline
    implicit class TooltipProviderPropsMutableBuilder[Self <: TooltipProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: MutableRefObject[HTMLDivElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
}
