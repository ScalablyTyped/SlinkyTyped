package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesLabelOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
    * the labels. Each item has a `left`, `right`, `top` and `bottom` property.
    */
  var boxesToAvoid: js.UndefOr[js.Array[LabelIntersectBoxObject]] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
    * graph if necessary, and draw a connector line to the graph. Setting this
    * option to true may decrease the performance significantly, since the
    * algorithm with systematically search for open spaces in the whole plot
    * area. Visually, it may also result in a more cluttered chart, though more
    * of the series will be labeled.
    */
  var connectorAllowed: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) If the label is closer than this to a
    * neighbour graph, draw a connector.
    */
  var connectorNeighbourDistance: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Enable the series label per series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) A format string for the label, with
    * support for a subset of HTML. Variables are enclosed by curly brackets.
    * Available variables are `name`, `options.xxx`, `color` and other members
    * from the `series` object. Use this option also to set a static text for
    * the label.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Callback function to format each of the
    * series' labels. The `this` keyword refers to the series object. By
    * default the `formatter` is undefined and the `series.name` is rendered.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[Series]] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
    * to vary so that small areas get a smaller font size. The default applies
    * this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[Double | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
    * to vary so that small areas get a smaller font size. The default applies
    * this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[Double | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
    * series. By default it is drawn on the area. Set it to `false` to draw it
    * next to the graph instead.
    */
  var onArea: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Styles for the series label. The color
    * defaults to the series color, or a contrast color if `onArea`.
    */
  var style: js.UndefOr[CSSObject] = js.native
}
object SeriesLabelOptionsObject {
  
  @scala.inline
  def apply(): SeriesLabelOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLabelOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesLabelOptionsObjectMutableBuilder[Self <: SeriesLabelOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxesToAvoid(value: js.Array[LabelIntersectBoxObject]): Self = StObject.set(x, "boxesToAvoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxesToAvoidUndefined: Self = StObject.set(x, "boxesToAvoid", js.undefined)
    
    @scala.inline
    def setBoxesToAvoidVarargs(value: LabelIntersectBoxObject*): Self = StObject.set(x, "boxesToAvoid", js.Array(value :_*))
    
    @scala.inline
    def setConnectorAllowed(value: Boolean): Self = StObject.set(x, "connectorAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorAllowedUndefined: Self = StObject.set(x, "connectorAllowed", js.undefined)
    
    @scala.inline
    def setConnectorNeighbourDistance(value: Double): Self = StObject.set(x, "connectorNeighbourDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorNeighbourDistanceUndefined: Self = StObject.set(x, "connectorNeighbourDistance", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatter(value: FormatterCallbackFunction[Series]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setMaxFontSize(value: Double): Self = StObject.set(x, "maxFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFontSizeNull: Self = StObject.set(x, "maxFontSize", null)
    
    @scala.inline
    def setMaxFontSizeUndefined: Self = StObject.set(x, "maxFontSize", js.undefined)
    
    @scala.inline
    def setMinFontSize(value: Double): Self = StObject.set(x, "minFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFontSizeNull: Self = StObject.set(x, "minFontSize", null)
    
    @scala.inline
    def setMinFontSizeUndefined: Self = StObject.set(x, "minFontSize", js.undefined)
    
    @scala.inline
    def setOnArea(value: Boolean): Self = StObject.set(x, "onArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAreaNull: Self = StObject.set(x, "onArea", null)
    
    @scala.inline
    def setOnAreaUndefined: Self = StObject.set(x, "onArea", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
