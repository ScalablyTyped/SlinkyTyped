package typingsSlinky.onionoo.mod.Onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Histogram extends js.Object {
  var count: Double = js.native
  var factor: Double = js.native
  var first: String = js.native
  var interval: Double = js.native
  var last: String = js.native
  var values: js.Array[Double] = js.native
}

object Histogram {
  @scala.inline
  def apply(
    count: Double,
    factor: Double,
    first: String,
    interval: Double,
    last: String,
    values: js.Array[Double]
  ): Histogram = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Histogram]
  }
  @scala.inline
  implicit class HistogramOps[Self <: Histogram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

