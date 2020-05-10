package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesGanttDataOptions extends js.Object {
  var accessibility: js.UndefOr[SeriesGanttDataAccessibilityOptions] = js.native
  /**
    * (Gantt) Whether the grid node belonging to this point should start as
    * collapsed. Used in axes of type treegrid.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Progress indicator, how much of the task completed. If it is a
    * number, the `fill` will be applied automatically.
    */
  var completed: js.UndefOr[Double | SeriesGanttDataCompletedOptions] = js.native
  /**
    * (Gantt) The ID of the point (task) that this point depends on in Gantt
    * charts. Aliases connect. Can also be an object, specifying further
    * connecting options between the points. Multiple connections can be
    * specified by providing an array.
    */
  var dependency: js.UndefOr[
    String | SeriesGanttDataDependencyOptions | (js.Array[String | SeriesGanttDataDependencyOptions])
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
  var dragDrop: js.UndefOr[SeriesGanttDataDragDropOptions] = js.native
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
    * (Gantt) The rank for this point's data label in case of collision. If two
    * data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Options for the point markers of line-like
    * series. Properties like `fillColor`, `lineColor` and `lineWidth` define
    * the visual appearance of the markers. Other series types, like column
    * series, don't have markers, but have visual options on the series level
    * instead.
    *
    * In styled mode, the markers can be styled with the `.highcharts-point`,
    * `.highcharts-point-hover` and `.highcharts-point-select` class names.
    */
  var marker: js.UndefOr[SeriesGanttDataMarkerOptions] = js.native
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

object SeriesGanttDataOptions {
  @scala.inline
  def apply(): SeriesGanttDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesGanttDataOptions]
  }
  @scala.inline
  implicit class SeriesGanttDataOptionsOps[Self <: SeriesGanttDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: SeriesGanttDataAccessibilityOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleted(value: Double | SeriesGanttDataCompletedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(js.undefined)
        ret
    }
    @scala.inline
    def withDependency(
      value: String | SeriesGanttDataDependencyOptions | (js.Array[String | SeriesGanttDataDependencyOptions])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependency")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDrop(value: SeriesGanttDataDragDropOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withDrilldown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrilldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldown")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelrank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelrank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelrank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelrank")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: SeriesGanttDataMarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMilestone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilestone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

