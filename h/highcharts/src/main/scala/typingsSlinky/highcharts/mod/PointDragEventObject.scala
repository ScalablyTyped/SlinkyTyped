package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.drag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDragEventObject extends js.Object {
  /**
    * New points during drag.
    */
  var newPoints: Dictionary[PointDragDropObject] = js.native
  /**
    * Original data.
    */
  var origin: DragDropPositionObject = js.native
  /**
    * Prevent default drag action.
    */
  var preventDefault: js.Function = js.native
  /**
    * Target point that caused the event.
    */
  var target: Point = js.native
  /**
    * Event type.
    */
  var `type`: drag = js.native
}

object PointDragEventObject {
  @scala.inline
  def apply(
    newPoints: Dictionary[PointDragDropObject],
    origin: DragDropPositionObject,
    preventDefault: js.Function,
    target: Point,
    `type`: drag
  ): PointDragEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDragEventObject]
  }
  @scala.inline
  implicit class PointDragEventObjectOps[Self <: PointDragEventObject] (val x: Self) extends AnyVal {
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
    def withType(value: drag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

