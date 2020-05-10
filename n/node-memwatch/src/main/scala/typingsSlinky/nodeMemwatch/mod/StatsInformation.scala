package typingsSlinky.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsInformation extends js.Object {
  var current_base: Double = js.native
  var estimated_base: Double = js.native
  var heap_compactions: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
  var num_full_gc: Double = js.native
  var num_inc_gc: Double = js.native
  var usage_trend: Double = js.native
}

object StatsInformation {
  @scala.inline
  def apply(
    current_base: Double,
    estimated_base: Double,
    heap_compactions: Double,
    max: Double,
    min: Double,
    num_full_gc: Double,
    num_inc_gc: Double,
    usage_trend: Double
  ): StatsInformation = {
    val __obj = js.Dynamic.literal(current_base = current_base.asInstanceOf[js.Any], estimated_base = estimated_base.asInstanceOf[js.Any], heap_compactions = heap_compactions.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], num_full_gc = num_full_gc.asInstanceOf[js.Any], num_inc_gc = num_inc_gc.asInstanceOf[js.Any], usage_trend = usage_trend.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsInformation]
  }
  @scala.inline
  implicit class StatsInformationOps[Self <: StatsInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent_base(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimated_base(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimated_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeap_compactions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heap_compactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_full_gc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_full_gc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_inc_gc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_inc_gc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage_trend(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage_trend")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

