package typingsSlinky.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait axes extends js.Object {
  var x2axis: js.UndefOr[axis] = js.native
  var xaxis: axis = js.native
  var y2axis: js.UndefOr[axis] = js.native
  var yaxis: axis = js.native
}

object axes {
  @scala.inline
  def apply(xaxis: axis, yaxis: axis): axes = {
    val __obj = js.Dynamic.literal(xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[axes]
  }
  @scala.inline
  implicit class axesOps[Self <: axes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXaxis(value: axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis(value: axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX2axis(value: axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX2axis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2axis")(js.undefined)
        ret
    }
    @scala.inline
    def withY2axis(value: axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY2axis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2axis")(js.undefined)
        ret
    }
  }
  
}

