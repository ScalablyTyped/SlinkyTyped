package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesColumnrangeDataDragDropOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Options for the drag handles.
    */
  var dragHandle: js.UndefOr[SeriesColumnrangeDataDragDropDragHandleOptions] = js.native
  /**
    * (Highcharts, Highstock) Set the maximum X value the points can be moved
    * to.
    */
  var dragMaxX: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Set the maximum Y value the points can be moved
    * to.
    */
  var dragMaxY: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Set the minimum X value the points can be moved
    * to.
    */
  var dragMinX: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Set the minimum Y value the points can be moved
    * to.
    */
  var dragMinY: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The X precision value to drag to for this series.
    * Set to 0 to disable. By default this is disabled, except for category
    * axes, where the default is 1.
    */
  var dragPrecisionX: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The Y precision value to drag to for this series.
    * Set to 0 to disable. By default this is disabled, except for category
    * axes, where the default is 1.
    */
  var dragPrecisionY: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The amount of pixels to drag the pointer before
    * it counts as a drag operation. This prevents drag/drop to fire when just
    * clicking or selecting points.
    */
  var dragSensitivity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Enable dragging in the X dimension.
    */
  var draggableX: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) Enable dragging in the Y dimension. Note that
    * this is not supported for TreeGrid axes (the default axis type in Gantt
    * charts).
    */
  var draggableY: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) Group the points by a property. Points with the
    * same property value will be grouped together when moving.
    */
  var groupBy: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock) Style options for the guide box. The guide box
    * has one state by default, the `default` state.
    */
  var guideBox: js.UndefOr[
    SeriesColumnrangeDataDragDropGuideBoxOptions | Dictionary[PlotSeriesDragDropGuideBoxDefaultOptions]
  ] = js.native
  /**
    * (Highcharts, Highstock) Update points as they are dragged. If false, a
    * guide box is drawn to illustrate the new point size.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.native
}

object SeriesColumnrangeDataDragDropOptions {
  @scala.inline
  def apply(): SeriesColumnrangeDataDragDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesColumnrangeDataDragDropOptions]
  }
  @scala.inline
  implicit class SeriesColumnrangeDataDragDropOptionsOps[Self <: SeriesColumnrangeDataDragDropOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragHandle(value: SeriesColumnrangeDataDragDropDragHandleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withDragMaxX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMaxX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragMaxX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMaxX")(js.undefined)
        ret
    }
    @scala.inline
    def withDragMaxY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMaxY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragMaxY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMaxY")(js.undefined)
        ret
    }
    @scala.inline
    def withDragMinX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMinX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragMinX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMinX")(js.undefined)
        ret
    }
    @scala.inline
    def withDragMinY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMinY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragMinY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMinY")(js.undefined)
        ret
    }
    @scala.inline
    def withDragPrecisionX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPrecisionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragPrecisionX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPrecisionX")(js.undefined)
        ret
    }
    @scala.inline
    def withDragPrecisionY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPrecisionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragPrecisionY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPrecisionY")(js.undefined)
        ret
    }
    @scala.inline
    def withDragSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggableX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggableX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableX")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggableY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggableY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableY")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withGuideBox(
      value: SeriesColumnrangeDataDragDropGuideBoxOptions | Dictionary[PlotSeriesDragDropGuideBoxDefaultOptions]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guideBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuideBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guideBox")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveRedraw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveRedraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveRedraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveRedraw")(js.undefined)
        ret
    }
  }
  
}

