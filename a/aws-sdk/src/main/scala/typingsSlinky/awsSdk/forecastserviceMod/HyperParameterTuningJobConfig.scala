package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTuningJobConfig extends js.Object {
  /**
    * Specifies the ranges of valid values for the hyperparameters.
    */
  var ParameterRanges: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.ParameterRanges] = js.native
}

object HyperParameterTuningJobConfig {
  @scala.inline
  def apply(): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
  @scala.inline
  implicit class HyperParameterTuningJobConfigOps[Self <: HyperParameterTuningJobConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterRanges(value: ParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterRanges")(js.undefined)
        ret
    }
  }
  
}

