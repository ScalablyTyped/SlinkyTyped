package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultHyperParameterRanges extends js.Object {
  /**
    * The categorical hyperparameters and their default ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[DefaultCategoricalHyperParameterRanges] = js.native
  /**
    * The continuous hyperparameters and their default ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[DefaultContinuousHyperParameterRanges] = js.native
  /**
    * The integer-valued hyperparameters and their default ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[DefaultIntegerHyperParameterRanges] = js.native
}

object DefaultHyperParameterRanges {
  @scala.inline
  def apply(): DefaultHyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultHyperParameterRanges]
  }
  @scala.inline
  implicit class DefaultHyperParameterRangesOps[Self <: DefaultHyperParameterRanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalHyperParameterRanges(value: DefaultCategoricalHyperParameterRanges): Self = {
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
    def withContinuousHyperParameterRanges(value: DefaultContinuousHyperParameterRanges): Self = {
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
    def withIntegerHyperParameterRanges(value: DefaultIntegerHyperParameterRanges): Self = {
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

