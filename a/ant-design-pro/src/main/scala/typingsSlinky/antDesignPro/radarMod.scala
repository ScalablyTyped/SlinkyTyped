package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.anon.Label
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radarMod {
  
  @JSImport("ant-design-pro/lib/Charts/Radar", JSImport.Default)
  @js.native
  class default ()
    extends Component[IRadarProps, js.Any, js.Any]
  
  @js.native
  trait IRadarProps extends StObject {
    
    var data: js.Array[Label] = js.native
    
    var hasLegend: js.UndefOr[Boolean] = js.native
    
    var height: Double = js.native
    
    var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object IRadarProps {
    
    @scala.inline
    def apply(data: js.Array[Label], height: Double): IRadarProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRadarProps]
    }
    
    @scala.inline
    implicit class IRadarPropsMutableBuilder[Self <: IRadarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Label]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Label*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHasLegend(value: Boolean): Self = StObject.set(x, "hasLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLegendUndefined: Self = StObject.set(x, "hasLegend", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type Radar = ReactComponentClass[IRadarProps]
}
