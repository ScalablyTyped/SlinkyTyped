package typingsSlinky.plottable.stackingUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackExtent[D] extends js.Object {
  var axisValue: D = js.native
  var extent: Double = js.native
  var stackedDatum: GenericStackedDatum[D] = js.native
}

object StackExtent {
  @scala.inline
  def apply[D](axisValue: D, extent: Double, stackedDatum: GenericStackedDatum[D]): StackExtent[D] = {
    val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], stackedDatum = stackedDatum.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackExtent[D]]
  }
  @scala.inline
  implicit class StackExtentOps[Self[d] <: StackExtent[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAxisValue(value: D): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtent(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackedDatum(value: GenericStackedDatum[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedDatum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

