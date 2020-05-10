package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterRanges extends js.Object {
  /**
    * Specifies the tunable range for each categorical hyperparameter.
    */
  var CategoricalParameterRanges: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.CategoricalParameterRanges] = js.native
  /**
    * Specifies the tunable range for each continuous hyperparameter.
    */
  var ContinuousParameterRanges: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.ContinuousParameterRanges] = js.native
  /**
    * Specifies the tunable range for each integer hyperparameter.
    */
  var IntegerParameterRanges: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.IntegerParameterRanges] = js.native
}

object ParameterRanges {
  @scala.inline
  def apply(): ParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterRanges]
  }
  @scala.inline
  implicit class ParameterRangesOps[Self <: ParameterRanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalParameterRanges(value: CategoricalParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoricalParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoricalParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoricalParameterRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuousParameterRanges(value: ContinuousParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuousParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuousParameterRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerParameterRanges(value: IntegerParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerParameterRanges")(js.undefined)
        ret
    }
  }
  
}

