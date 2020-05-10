package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesSolidgaugeDataEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Fires when a point is clicked. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    *
    * If the `series.allowPointSelect` option is true, the default action for
    * the point's click event is to toggle the point's select state. Returning
    * `false` cancels this action.
    */
  var click: js.UndefOr[PointClickCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Callback that fires while dragging a
    * point. The mouse event is passed in as parameter. The original data can
    * be accessed from `e.origin`, and the new point values can be accessed
    * from `e.newPoints`. If there is only a single point being updated, it can
    * be accessed from `e.newPoint` for simplicity, and its ID can be accessed
    * from `e.newPointId`. The `this` context is the point being dragged. To
    * stop the default drag action, return false. See drag and drop options.
    */
  var drag: js.UndefOr[PointDragCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Callback that fires when starting to drag
    * a point. The mouse event object is passed in as an argument. If a drag
    * handle is used, `e.updateProp` is set to the data property being dragged.
    * The `this` context is the point. See drag and drop options.
    */
  var dragStart: js.UndefOr[PointDragStartCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Callback that fires when the point is
    * dropped. The parameters passed are the same as for drag. To stop the
    * default drop action, return false. See drag and drop options.
    */
  var drop: js.UndefOr[PointDropCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Fires when the mouse leaves the area close
    * to the point. One parameter, `event`, is passed to the function,
    * containing common event information.
    */
  var mouseOut: js.UndefOr[PointMouseOutCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Fires when the mouse enters the area close
    * to the point. One parameter, `event`, is passed to the function,
    * containing common event information.
    */
  var mouseOver: js.UndefOr[PointMouseOverCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Fires when the point is removed using the
    * `.remove()` method. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  var remove: js.UndefOr[PointRemoveCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Fires when the point is selected either
    * programmatically or following a click on the point. One parameter,
    * `event`, is passed to the function. Returning `false` cancels the
    * operation.
    */
  var select: js.UndefOr[PointSelectCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Fires when the point is unselected either
    * programmatically or following a click on the point. One parameter,
    * `event`, is passed to the function. Returning `false` cancels the
    * operation.
    */
  var unselect: js.UndefOr[PointUnselectCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Fires when the point is updated
    * programmatically through the `.update()` method. One parameter, `event`,
    * is passed to the function. The new point options can be accessed through
    * `event.options`. Returning `false` cancels the operation.
    */
  var update: js.UndefOr[PointUpdateCallbackFunction] = js.native
}

object SeriesSolidgaugeDataEventsOptions {
  @scala.inline
  def apply(): SeriesSolidgaugeDataEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSolidgaugeDataEventsOptions]
  }
  @scala.inline
  implicit class SeriesSolidgaugeDataEventsOptionsOps[Self <: SeriesSolidgaugeDataEventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: PointClickCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
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
    @scala.inline
    def withMouseOut(value: PointMouseOutCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOver(value: PointMouseOverCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: PointRemoveCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: PointSelectCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselect(value: PointUnselectCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: PointUpdateCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

