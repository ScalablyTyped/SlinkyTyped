package typingsSlinky.recharts.mod

import slinky.core.facade.ReactElement
import typingsSlinky.recharts.anon.PartialMargin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrushProps extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Array[_]] = js.native
  
  var dataKey: js.UndefOr[DataKey] = js.native
  
  var endIndex: js.UndefOr[Double] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var gap: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var leaveTimeOut: js.UndefOr[Double] = js.native
  
  var onChange: js.UndefOr[RechartsFunction] = js.native
  
  var padding: js.UndefOr[PartialMargin] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.native
  
  var travellerWidth: js.UndefOr[Double] = js.native
  
  var updateId: js.UndefOr[String | Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object BrushProps {
  
  @scala.inline
  def apply(): BrushProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrushProps]
  }
  
  @scala.inline
  implicit class BrushPropsMutableBuilder[Self <: BrushProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKey(value: DataKey): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeaveTimeOut(value: Double): Self = StObject.set(x, "leaveTimeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveTimeOutUndefined: Self = StObject.set(x, "leaveTimeOut", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setPadding(value: PartialMargin): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setTickFormatter(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "tickFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTickFormatterUndefined: Self = StObject.set(x, "tickFormatter", js.undefined)
    
    @scala.inline
    def setTravellerWidth(value: Double): Self = StObject.set(x, "travellerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravellerWidthUndefined: Self = StObject.set(x, "travellerWidth", js.undefined)
    
    @scala.inline
    def setUpdateId(value: String | Double): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
