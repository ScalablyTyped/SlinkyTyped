package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterBandStatistics extends js.Object {
  var max: Double = js.native
  var mean: Double = js.native
  var min: Double = js.native
  var std_dev: Double = js.native
}

object RasterBandStatistics {
  @scala.inline
  def apply(max: Double, mean: Double, min: Double, std_dev: Double): RasterBandStatistics = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], std_dev = std_dev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterBandStatistics]
  }
  @scala.inline
  implicit class RasterBandStatisticsOps[Self <: RasterBandStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStd_dev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("std_dev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

