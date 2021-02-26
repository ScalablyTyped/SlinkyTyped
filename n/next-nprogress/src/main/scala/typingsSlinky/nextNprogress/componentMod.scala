package typingsSlinky.nextNprogress

import slinky.core.ReactComponentClass
import typingsSlinky.nextNprogress.anon.PartialNProgressOptions
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("next-nprogress/component", JSImport.Default)
  @js.native
  class default ()
    extends Component[NProgressProps, js.Object, js.Any]
  
  type NProgress = ReactComponentClass[NProgressProps]
  
  @js.native
  trait NProgressProps extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[PartialNProgressOptions] = js.native
    
    var showAfterMs: js.UndefOr[Double] = js.native
    
    var spinner: js.UndefOr[Boolean] = js.native
  }
  object NProgressProps {
    
    @scala.inline
    def apply(): NProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NProgressProps]
    }
    
    @scala.inline
    implicit class NProgressPropsMutableBuilder[Self <: NProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOptions(value: PartialNProgressOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setShowAfterMs(value: Double): Self = StObject.set(x, "showAfterMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAfterMsUndefined: Self = StObject.set(x, "showAfterMs", js.undefined)
      
      @scala.inline
      def setSpinner(value: Boolean): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
    }
  }
}
