package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPsarParamsOptions extends js.Object {
  /**
    * (Highstock) Number of maximum decimals that are used in PSAR
    * calculations.
    */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Acceleration factor increases by increment each time the
    * extreme point makes a new high.
    */
  var increment: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Index from which PSAR is starting calculation
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The initial value for acceleration factor. Acceleration
    * factor is starting with this value and increases by specified increment
    * each time the extreme point makes a new high. AF can reach a maximum of
    * maxAccelerationFactor, no matter how long the uptrend extends.
    */
  var initialAccelerationFactor: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The Maximum value for acceleration factor. AF can reach a
    * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
    */
  var maxAccelerationFactor: js.UndefOr[Double] = js.native
}

object PlotPsarParamsOptions {
  @scala.inline
  def apply(): PlotPsarParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPsarParamsOptions]
  }
  @scala.inline
  implicit class PlotPsarParamsOptionsOps[Self <: PlotPsarParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialAccelerationFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialAccelerationFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialAccelerationFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialAccelerationFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAccelerationFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAccelerationFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAccelerationFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAccelerationFactor")(js.undefined)
        ret
    }
  }
  
}

