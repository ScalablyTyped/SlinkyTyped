package typingsSlinky.phaser.Phaser.Types.Core

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FPSConfig extends js.Object {
  /**
    * Calculate the average frame delta from this many consecutive frame intervals.
    */
  var deltaHistory: js.UndefOr[integer] = js.native
  /**
    * Use setTimeout instead of requestAnimationFrame to run the game loop.
    */
  var forceSetTimeOut: js.UndefOr[Boolean] = js.native
  /**
    * The minimum acceptable rendering rate, in frames per second.
    */
  var min: js.UndefOr[integer] = js.native
  /**
    * The amount of frames the time step counts before we trust the delta values again.
    */
  var panicMax: js.UndefOr[integer] = js.native
  /**
    * Apply delta smoothing during the game update to help avoid spikes?
    */
  var smoothStep: js.UndefOr[Boolean] = js.native
  /**
    * The optimum rendering rate, in frames per second.
    */
  var target: js.UndefOr[integer] = js.native
}

object FPSConfig {
  @scala.inline
  def apply(): FPSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FPSConfig]
  }
  @scala.inline
  implicit class FPSConfigOps[Self <: FPSConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeltaHistory(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSetTimeOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSetTimeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSetTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSetTimeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withPanicMax(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panicMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanicMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panicMax")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothStep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothStep")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

