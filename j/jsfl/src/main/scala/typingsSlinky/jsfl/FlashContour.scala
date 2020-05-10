package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashContour extends js.Object {
  var fill: FlashFill = js.native
  var interior: Boolean = js.native
  var orientation: Double = js.native
  def getHalfEdge(): FlashHalfEdge = js.native
}

object FlashContour {
  @scala.inline
  def apply(fill: FlashFill, getHalfEdge: () => FlashHalfEdge, interior: Boolean, orientation: Double): FlashContour = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], getHalfEdge = js.Any.fromFunction0(getHalfEdge), interior = interior.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashContour]
  }
  @scala.inline
  implicit class FlashContourOps[Self <: FlashContour] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: FlashFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHalfEdge(value: () => FlashHalfEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHalfEdge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInterior(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

