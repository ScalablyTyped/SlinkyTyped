package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaugeMod {
  
  @JSImport("ant-design-pro/lib/Charts/Gauge", JSImport.Default)
  @js.native
  class default ()
    extends Component[IGaugeProps, js.Any, js.Any]
  
  type Gauge = ReactComponentClass[IGaugeProps]
  
  @js.native
  trait IGaugeProps extends StObject {
    
    var bgColor: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var height: Double = js.native
    
    var percent: Double = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: ReactElement = js.native
  }
  object IGaugeProps {
    
    @scala.inline
    def apply(height: Double, percent: Double): IGaugeProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGaugeProps]
    }
    
    @scala.inline
    implicit class IGaugePropsMutableBuilder[Self <: IGaugeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgColor(value: Double): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
