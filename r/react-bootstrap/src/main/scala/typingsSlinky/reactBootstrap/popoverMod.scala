package typingsSlinky.reactBootstrap

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("react-bootstrap/lib/Popover", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PopoverProps, js.Object, js.Any]
  
  @js.native
  trait Popover
    extends Component[PopoverProps, js.Object, js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover>[P]} */ @js.native
  trait PopoverProps extends StObject {
    
    // Optional
    var arrowOffsetLeft: js.UndefOr[Double | String] = js.native
    
    var arrowOffsetTop: js.UndefOr[Double | String] = js.native
    
    var bsClass: js.UndefOr[String] = js.native
    
    var bsSize: js.UndefOr[Sizes] = js.native
    
    var bsStyle: js.UndefOr[String] = js.native
    
    var placement: js.UndefOr[String] = js.native
    
    var positionLeft: js.UndefOr[Double | String] = js.native
    
    // String support added since v0.30.0
    var positionTop: js.UndefOr[Double | String] = js.native
    
    // String support added since v0.30.0
    var title: js.UndefOr[ReactElement] = js.native
  }
  object PopoverProps {
    
    @scala.inline
    def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowOffsetLeft(value: Double | String): Self = StObject.set(x, "arrowOffsetLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowOffsetLeftUndefined: Self = StObject.set(x, "arrowOffsetLeft", js.undefined)
      
      @scala.inline
      def setArrowOffsetTop(value: Double | String): Self = StObject.set(x, "arrowOffsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowOffsetTopUndefined: Self = StObject.set(x, "arrowOffsetTop", js.undefined)
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPositionLeft(value: Double | String): Self = StObject.set(x, "positionLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionLeftUndefined: Self = StObject.set(x, "positionLeft", js.undefined)
      
      @scala.inline
      def setPositionTop(value: Double | String): Self = StObject.set(x, "positionTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionTopUndefined: Self = StObject.set(x, "positionTop", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
