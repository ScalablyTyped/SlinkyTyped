package typingsSlinky.materialUi

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandTransitionChildMod {
  
  @JSImport("material-ui/internal/ExpandTransitionChild", JSImport.Default)
  @js.native
  class default ()
    extends Component[ExpandTransitionChildProps, js.Object, js.Any]
  
  @js.native
  trait ExpandTransitionChild
    extends Component[ExpandTransitionChildProps, js.Object, js.Any]
  
  @js.native
  trait ExpandTransitionChildProps extends Props[ExpandTransitionChild] {
    
    var enterDelay: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionDelay: js.UndefOr[Double] = js.native
    
    var transitionDuration: js.UndefOr[Double] = js.native
  }
  object ExpandTransitionChildProps {
    
    @scala.inline
    def apply(): ExpandTransitionChildProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandTransitionChildProps]
    }
    
    @scala.inline
    implicit class ExpandTransitionChildPropsMutableBuilder[Self <: ExpandTransitionChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionDelay(value: Double): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
}
