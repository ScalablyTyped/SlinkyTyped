package typingsSlinky.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait datapoints extends js.Object {
  var format: js.Array[datapointFormat] = js.native
  var points: js.Array[Double] = js.native
  var pointsize: Double = js.native
}

object datapoints {
  @scala.inline
  def apply(format: js.Array[datapointFormat], points: js.Array[Double], pointsize: Double): datapoints = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pointsize = pointsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[datapoints]
  }
  @scala.inline
  implicit class datapointsOps[Self <: datapoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: js.Array[datapointFormat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

