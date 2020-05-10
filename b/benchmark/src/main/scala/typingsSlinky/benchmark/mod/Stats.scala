package typingsSlinky.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var deviation: Double = js.native
  var mean: Double = js.native
  var moe: Double = js.native
  var rme: Double = js.native
  var sample: js.Array[_] = js.native
  var sem: Double = js.native
  var variance: Double = js.native
}

object Stats {
  @scala.inline
  def apply(
    deviation: Double,
    mean: Double,
    moe: Double,
    rme: Double,
    sample: js.Array[_],
    sem: Double,
    variance: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(deviation = deviation.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], moe = moe.asInstanceOf[js.Any], rme = rme.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any], sem = sem.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRme(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSample(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

