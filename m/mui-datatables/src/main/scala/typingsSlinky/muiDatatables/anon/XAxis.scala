package typingsSlinky.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAxis extends js.Object {
  var xAxis: Boolean = js.native
  var yAxis: Boolean = js.native
}

object XAxis {
  @scala.inline
  def apply(xAxis: Boolean, yAxis: Boolean): XAxis = {
    val __obj = js.Dynamic.literal(xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxis]
  }
  @scala.inline
  implicit class XAxisOps[Self <: XAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

