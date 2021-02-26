package typingsSlinky.reactBootstrap

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.reactBootstrap.mod.TransitionCallbacks
import typingsSlinky.reactBootstrap.reactBootstrapStrings.height
import typingsSlinky.reactBootstrap.reactBootstrapStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseMod {
  
  @JSImport("react-bootstrap/lib/Collapse", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[CollapseProps, js.Object, js.Any]
  
  @js.native
  trait Collapse
    extends Component[CollapseProps, js.Object, js.Any]
  
  @js.native
  trait CollapseProps
    extends ClassAttributes[Collapse]
       with TransitionCallbacks {
    
    var dimension: js.UndefOr[height | width | js.Function0[String]] = js.native
    
    var getDimensionValue: js.UndefOr[js.Function2[/* dimension */ Double, /* element */ ReactElement, Double]] = js.native
    
    var in: js.UndefOr[Boolean] = js.native
    
    var mountOnEnter: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var transitionAppear: js.UndefOr[Boolean] = js.native
    
    var unmountOnExit: js.UndefOr[Boolean] = js.native
  }
  object CollapseProps {
    
    @scala.inline
    def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    @scala.inline
    implicit class CollapsePropsMutableBuilder[Self <: CollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimension(value: height | width | js.Function0[String]): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionFunction0(value: () => String): Self = StObject.set(x, "dimension", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      @scala.inline
      def setGetDimensionValue(value: (/* dimension */ Double, /* element */ ReactElement) => Double): Self = StObject.set(x, "getDimensionValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDimensionValueUndefined: Self = StObject.set(x, "getDimensionValue", js.undefined)
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTransitionAppear(value: Boolean): Self = StObject.set(x, "transitionAppear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionAppearUndefined: Self = StObject.set(x, "transitionAppear", js.undefined)
      
      @scala.inline
      def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
