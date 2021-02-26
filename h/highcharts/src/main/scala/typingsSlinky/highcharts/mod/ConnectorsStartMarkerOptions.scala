package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorsStartMarkerOptions extends StObject {
  
  /**
    * (Gantt) Horizontal alignment of the markers relative to the points.
    */
  var align: js.UndefOr[String | AlignValue] = js.native
  
  /**
    * (Gantt) Set the color of the connector markers. By default this is the
    * same as the connector color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Gantt) Enable markers for the connectors.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  /**
    * (Gantt) Set the height of the connector markers. If not supplied, this is
    * inferred from the marker radius.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Gantt) Whether or not to draw the markers inside the points.
    */
  var inside: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gantt) Set the line/border color of the connector markers. By default
    * this is the same as the marker color.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  
  /**
    * (Gantt) Set the line/border width of the pathfinder markers.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Gantt) Set the radius of the connector markers. The default is
    * automatically computed based on the algorithmMargin setting.
    *
    * Setting marker.width and marker.height will override this setting.
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * (Gantt) Set the symbol of the connector start markers.
    */
  var symbol: js.UndefOr[String] = js.native
  
  /**
    * (Gantt) Vertical alignment of the markers relative to the points.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  
  /**
    * (Gantt) Set the width of the connector markers. If not supplied, this is
    * inferred from the marker radius.
    */
  var width: js.UndefOr[Double] = js.native
}
object ConnectorsStartMarkerOptions {
  
  @scala.inline
  def apply(): ConnectorsStartMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsStartMarkerOptions]
  }
  
  @scala.inline
  implicit class ConnectorsStartMarkerOptionsMutableBuilder[Self <: ConnectorsStartMarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String | AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInside(value: Boolean): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideUndefined: Self = StObject.set(x, "inside", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
