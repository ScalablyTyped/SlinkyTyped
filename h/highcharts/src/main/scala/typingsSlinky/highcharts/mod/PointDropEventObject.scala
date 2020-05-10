package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.drop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDropEventObject extends js.Object {
  /**
    * New point after drag if only a single one.
    */
  var newPoint: js.UndefOr[PointDragDropObject] = js.native
  /**
    * New point id after drag if only a single one.
    */
  var newPointId: js.UndefOr[String] = js.native
  /**
    * New points after drop.
    */
  var newPoints: Dictionary[PointDragDropObject] = js.native
  /**
    * Number of new points.
    */
  var numNewPoints: Double = js.native
  /**
    * Original data.
    */
  var origin: DragDropPositionObject = js.native
  /**
    * Prevent default drop action.
    */
  var preventDefault: js.Function = js.native
  /**
    * Target point that caused the event.
    */
  var target: Point = js.native
  /**
    * Event type.
    */
  var `type`: drop = js.native
}

object PointDropEventObject {
  @scala.inline
  def apply(
    newPoints: Dictionary[PointDragDropObject],
    numNewPoints: Double,
    origin: DragDropPositionObject,
    preventDefault: js.Function,
    target: Point,
    `type`: drop
  ): PointDropEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints.asInstanceOf[js.Any], numNewPoints = numNewPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDropEventObject]
  }
  @scala.inline
  implicit class PointDropEventObjectOps[Self <: PointDropEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewPoints(value: Dictionary[PointDragDropObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumNewPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numNewPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: DragDropPositionObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: drop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewPoint(value: PointDragDropObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPointId")(js.undefined)
        ret
    }
  }
  
}

