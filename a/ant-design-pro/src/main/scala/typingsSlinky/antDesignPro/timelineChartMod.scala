package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import typingsSlinky.antDesignPro.anon.Y1
import typingsSlinky.antDesignPro.anon.Y2
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineChartMod {
  
  @JSImport("ant-design-pro/lib/Charts/TimelineChart", JSImport.Default)
  @js.native
  class default ()
    extends Component[ITimelineChartProps, js.Any, js.Any]
  
  @js.native
  trait ITimelineChartProps extends StObject {
    
    var data: js.Array[Y1] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var titleMap: Y2 = js.native
  }
  object ITimelineChartProps {
    
    @scala.inline
    def apply(data: js.Array[Y1], titleMap: Y2): ITimelineChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], titleMap = titleMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineChartProps]
    }
    
    @scala.inline
    implicit class ITimelineChartPropsMutableBuilder[Self <: ITimelineChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Y1]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Y1*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitleMap(value: Y2): Self = StObject.set(x, "titleMap", value.asInstanceOf[js.Any])
    }
  }
  
  type TimelineChart = ReactComponentClass[ITimelineChartProps]
}
