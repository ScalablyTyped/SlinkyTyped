package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttPointOptionsObject extends StObject {
  
  /**
    * (Gantt) Accessibility options for a data point.
    */
  var accessibility: js.UndefOr[PointAccessibilityOptionsObject] = js.native
  
  /**
    * (Gantt) Whether the grid node belonging to this point should start as
    * collapsed. Used in axes of type treegrid.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gantt) Progress indicator, how much of the task completed. If it is a
    * number, the `fill` will be applied automatically.
    */
  var completed: js.UndefOr[Double | XrangePointPartialFillOptionsObject] = js.native
  
  /**
    * (Gantt) A reserved subspace to store options and values for customized
    * functionality. Here you can add additional data for your own event
    * callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.native
  
  /**
    * (Gantt) The ID of the point (task) that this point depends on in Gantt
    * charts. Aliases connect. Can also be an object, specifying further
    * connecting options between the points. Multiple connections can be
    * specified by providing an array.
    */
  var dependency: js.UndefOr[
    String | XrangePointConnectorsOptionsObject | (js.Array[String | XrangePointConnectorsOptionsObject])
  ] = js.native
  
  /**
    * (Gantt) A description of the point to add to the screen reader
    * information about the point.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * (Gantt) Point specific options for the draggable-points module. Overrides
    * options on `series.dragDrop`.
    */
  var dragDrop: js.UndefOr[SeriesLineDataDragDropOptions] = js.native
  
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.native
  
  /**
    * (Gantt) The end time of a task.
    */
  var end: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * (Gantt) The rank for this point's data label in case of collision. If two
    * data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) Options for the point markers of line-like
    * series.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.native
  
  /**
    * (Gantt) Whether this point is a milestone. If so, only the `start` option
    * is handled, while `end` is ignored.
    */
  var milestone: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gantt) The name of a task. If a `treegrid` y-axis is used (default in
    * Gantt charts), this will be picked up automatically, and used to
    * calculate the y-value.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * (Gantt) The ID of the parent point (task) of this point in Gantt charts.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * (Gantt) The start time of a task.
    */
  var start: js.UndefOr[Double] = js.native
  
  /**
    * (Gantt) The Y value of a task.
    */
  var y: js.UndefOr[Double] = js.native
}
object GanttPointOptionsObject {
  
  @scala.inline
  def apply(): GanttPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttPointOptionsObject]
  }
  
  @scala.inline
  implicit class GanttPointOptionsObjectMutableBuilder[Self <: GanttPointOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: PointAccessibilityOptionsObject): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setCompleted(value: Double | XrangePointPartialFillOptionsObject): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDependency(
      value: String | XrangePointConnectorsOptionsObject | (js.Array[String | XrangePointConnectorsOptionsObject])
    ): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    @scala.inline
    def setDependencyVarargs(value: (String | XrangePointConnectorsOptionsObject)*): Self = StObject.set(x, "dependency", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDragDrop(value: SeriesLineDataDragDropOptions): Self = StObject.set(x, "dragDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDropUndefined: Self = StObject.set(x, "dragDrop", js.undefined)
    
    @scala.inline
    def setDrilldown(value: String): Self = StObject.set(x, "drilldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrilldownUndefined: Self = StObject.set(x, "drilldown", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabelrank(value: Double): Self = StObject.set(x, "labelrank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelrankUndefined: Self = StObject.set(x, "labelrank", js.undefined)
    
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMilestone(value: Boolean): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestoneUndefined: Self = StObject.set(x, "milestone", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
