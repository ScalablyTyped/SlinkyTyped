package typingsSlinky.highcharts.draggablePointsMod.highchartsAugmentingMod

import typingsSlinky.highcharts.mod.PointDragCallbackFunction
import typingsSlinky.highcharts.mod.PointDragStartCallbackFunction
import typingsSlinky.highcharts.mod.PointDropCallbackFunction
import typingsSlinky.highcharts.mod.SeriesLineDataDragDropOptions
import typingsSlinky.highcharts.mod.SeriesXrangeDataDragDropOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointEventsOptionsObject extends js.Object {
  /**
    * Callback that fires while dragging a point. The mouse event is passed
    * in as parameter. The original data can be accessed from `e.origin`,
    * and the new point values can be accessed from `e.newPoints`. If there
    * is only a single point being updated, it can be accessed from
    * `e.newPoint` for simplicity, and its ID can be accessed from
    * `e.newPointId`. The this context is the point being dragged. To stop
    * the default drag action, return `false`.
    */
  var drag: js.UndefOr[PointDragCallbackFunction] = js.native
  /**
    * Point specific options for the draggable-points module.
    */
  var dragDrop: js.UndefOr[SeriesLineDataDragDropOptions | SeriesXrangeDataDragDropOptions] = js.native
  /**
    * Callback that fires when starting to drag a point. The mouse event
    * object is passed in as an argument. If a drag handle is used,
    * `e.updateProp` is set to the data property being dragged. The `this`
    * context is the point.
    */
  var dragStart: js.UndefOr[PointDragStartCallbackFunction] = js.native
  /**
    * Callback that fires when the point is dropped. The parameters passed
    * are the same as for drag. To stop the default drop action, return
    * `false`.
    */
  var drop: js.UndefOr[PointDropCallbackFunction] = js.native
}

object PointEventsOptionsObject {
  @scala.inline
  def apply(): PointEventsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointEventsOptionsObject]
  }
  @scala.inline
  implicit class PointEventsOptionsObjectOps[Self <: PointEventsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrag(value: PointDragCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDrop(value: SeriesLineDataDragDropOptions | SeriesXrangeDataDragDropOptions): Self = {
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
    def withDragStart(value: PointDragStartCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: PointDropCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
  }
  
}

