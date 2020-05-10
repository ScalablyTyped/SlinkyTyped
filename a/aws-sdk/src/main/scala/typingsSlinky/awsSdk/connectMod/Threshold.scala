package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Threshold extends js.Object {
  /**
    * The type of comparison. Only "less than" (LT) comparisons are supported.
    */
  var Comparison: js.UndefOr[typingsSlinky.awsSdk.connectMod.Comparison] = js.native
  /**
    * The threshold value to compare.
    */
  var ThresholdValue: js.UndefOr[typingsSlinky.awsSdk.connectMod.ThresholdValue] = js.native
}

object Threshold {
  @scala.inline
  def apply(): Threshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Threshold]
  }
  @scala.inline
  implicit class ThresholdOps[Self <: Threshold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparison(value: Comparison): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comparison")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparison: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comparison")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholdValue(value: ThresholdValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdValue")(js.undefined)
        ret
    }
  }
  
}

