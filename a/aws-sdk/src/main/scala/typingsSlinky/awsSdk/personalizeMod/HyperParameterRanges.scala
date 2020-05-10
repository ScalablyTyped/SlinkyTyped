package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterRanges extends js.Object {
  /**
    * The categorical hyperparameters and their ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[CategoricalHyperParameterRanges] = js.native
  /**
    * The continuous hyperparameters and their ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[ContinuousHyperParameterRanges] = js.native
  /**
    * The integer-valued hyperparameters and their ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[IntegerHyperParameterRanges] = js.native
}

object HyperParameterRanges {
  @scala.inline
  def apply(): HyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterRanges]
  }
  @scala.inline
  implicit class HyperParameterRangesOps[Self <: HyperParameterRanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalHyperParameterRanges(value: CategoricalHyperParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalHyperParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoricalHyperParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalHyperParameterRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuousHyperParameterRanges(value: ContinuousHyperParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousHyperParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousHyperParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousHyperParameterRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerHyperParameterRanges(value: IntegerHyperParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerHyperParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerHyperParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerHyperParameterRanges")(js.undefined)
        ret
    }
  }
  
}

