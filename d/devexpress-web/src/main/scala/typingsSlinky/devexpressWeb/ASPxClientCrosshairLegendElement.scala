package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the CrosshairLegendElement class.
  */
@js.native
trait ASPxClientCrosshairLegendElement extends ASPxClientCrosshairLegendElementBase {
  
  /**
    * Returns a series whose point the Crosshair Cursor legend element highlights.
    */
  var Series: ASPxClientSeries = js.native
}
object ASPxClientCrosshairLegendElement {
  
  @scala.inline
  def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    LineElement: ASPxClientCrosshairLineElement,
    Point: ASPxClientSeriesPoint,
    Series: ASPxClientSeries,
    visible: Boolean
  ): ASPxClientCrosshairLegendElement = {
    val __obj = js.Dynamic.literal(AxisLabelElement = AxisLabelElement.asInstanceOf[js.Any], LineElement = LineElement.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Series = Series.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairLegendElement]
  }
  
  @scala.inline
  implicit class ASPxClientCrosshairLegendElementMutableBuilder[Self <: ASPxClientCrosshairLegendElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeries(value: ASPxClientSeries): Self = StObject.set(x, "Series", value.asInstanceOf[js.Any])
  }
}
