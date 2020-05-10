package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterRunnerConfig extends js.Object {
  /**
    * A number that specifies the time correction factor to apply to the update. This can help improve the accuracy of the simulation in cases where delta is changing between updates.
    */
  var correction: js.UndefOr[Double] = js.native
  /**
    * A number that specifies the time step between updates in milliseconds. If you set the `fps` property, this value is set based on that. If `isFixed` is set to `true`, then `delta` is fixed. If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    */
  var delta: js.UndefOr[Double] = js.native
  /**
    * A number that specifies the maximum time step between updates in milliseconds.
    */
  var deltaMax: js.UndefOr[Double] = js.native
  /**
    * A number that specifies the minimum time step between updates in milliseconds.
    */
  var deltaMin: js.UndefOr[Double] = js.native
  /**
    * The size of the delta smoothing array when `isFixed` is `false`.
    */
  var deltaSampleSize: js.UndefOr[Double] = js.native
  /**
    * A number that specifies the frame rate in seconds. If you don't specify this, but do specify `delta`, those values set the fps rate.
    */
  var fps: js.UndefOr[Double] = js.native
  /**
    * A boolean that specifies if the runner should use a fixed timestep (otherwise it is variable). If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic). If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    */
  var isFixed: js.UndefOr[Boolean] = js.native
}

object MatterRunnerConfig {
  @scala.inline
  def apply(): MatterRunnerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterRunnerConfig]
  }
  @scala.inline
  implicit class MatterRunnerConfigOps[Self <: MatterRunnerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correction")(js.undefined)
        ret
    }
    @scala.inline
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaMax")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaMin")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaSampleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaSampleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaSampleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaSampleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixed")(js.undefined)
        ret
    }
  }
  
}

