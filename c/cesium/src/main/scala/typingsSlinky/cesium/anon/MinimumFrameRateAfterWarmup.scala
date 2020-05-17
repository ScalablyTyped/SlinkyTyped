package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimumFrameRateAfterWarmup extends js.Object {
  var minimumFrameRateAfterWarmup: js.UndefOr[Double] = js.native
  var minimumFrameRateDuringWarmup: js.UndefOr[Double] = js.native
  var quietPeriod: js.UndefOr[Double] = js.native
  var samplingWindow: js.UndefOr[Double] = js.native
  var scene: typingsSlinky.cesium.mod.Scene = js.native
  var warmupPeriod: js.UndefOr[Double] = js.native
}

object MinimumFrameRateAfterWarmup {
  @scala.inline
  def apply(scene: typingsSlinky.cesium.mod.Scene): MinimumFrameRateAfterWarmup = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumFrameRateAfterWarmup]
  }
  @scala.inline
  implicit class MinimumFrameRateAfterWarmupOps[Self <: MinimumFrameRateAfterWarmup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScene(value: typingsSlinky.cesium.mod.Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumFrameRateAfterWarmup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFrameRateAfterWarmup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumFrameRateAfterWarmup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFrameRateAfterWarmup")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumFrameRateDuringWarmup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFrameRateDuringWarmup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumFrameRateDuringWarmup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFrameRateDuringWarmup")(js.undefined)
        ret
    }
    @scala.inline
    def withQuietPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quietPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuietPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quietPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withWarmupPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warmupPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarmupPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warmupPeriod")(js.undefined)
        ret
    }
  }
  
}

