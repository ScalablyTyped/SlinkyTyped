package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesSankeyPointOptionsObject extends StObject {
  
  /**
    * (Highcharts) Accessibility options for a data point.
    */
  var accessibility: js.UndefOr[PointAccessibilityOptionsObject] = js.native
  
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The color for the individual _link_. By default, the link
    * color is the same as the node it extends from. The `series.fillOpacity`
    * option also applies to the points, so when setting a specific link color,
    * consider setting the `fillOpacity` to 1.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Gantt) A specific color index to use for the point, so its
    * graphic representations are given the class name `highcharts-color-{n}`.
    * In styled mode this will change the color of the graphic. In non-styled
    * mode, the color by is set by the `fill` attribute, so the change in class
    * name won't have a visual effect by default.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) A reserved subspace to store options and values for
    * customized functionality. Here you can add additional data for your own
    * event callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.native
  
  /**
    * (Highcharts) Individual data label for each point. The options are the
    * same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[
    DataLabelsOptions | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject])
  ] = js.native
  
  /**
    * (Highcharts) A description of the point to add to the screen reader
    * information about the point.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The individual point events.
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.native
  
  /**
    * (Highcharts) The node that the link runs from.
    */
  var from: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The rank for this point's data label in case of collision.
    * If two data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The name of the point as shown in the legend, tooltip,
    * dataLabels, etc.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Whether the link goes out of the system.
    */
  var outgoing: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) The node that the link runs to.
    */
  var to: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The weight of the link.
    */
  var weight: js.UndefOr[Double | Null] = js.native
}
object SeriesSankeyPointOptionsObject {
  
  @scala.inline
  def apply(): SeriesSankeyPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSankeyPointOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesSankeyPointOptionsObjectMutableBuilder[Self <: SeriesSankeyPointOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: PointAccessibilityOptionsObject): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDataLabels(
      value: DataLabelsOptions | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject])
    ): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: (SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject)*): Self = StObject.set(x, "dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEvents(value: PointEventsOptionsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabelrank(value: Double): Self = StObject.set(x, "labelrank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelrankUndefined: Self = StObject.set(x, "labelrank", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutgoing(value: Boolean): Self = StObject.set(x, "outgoing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingUndefined: Self = StObject.set(x, "outgoing", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightNull: Self = StObject.set(x, "weight", null)
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
