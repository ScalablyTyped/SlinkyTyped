package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossRegionCopyRetainRule extends js.Object {
  /**
    * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[typingsSlinky.awsSdk.dlmMod.Interval] = js.native
  /**
    * The unit of time for time-based retention.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.native
}

object CrossRegionCopyRetainRule {
  @scala.inline
  def apply(): CrossRegionCopyRetainRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossRegionCopyRetainRule]
  }
  @scala.inline
  implicit class CrossRegionCopyRetainRuleOps[Self <: CrossRegionCopyRetainRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: Interval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalUnit(value: RetentionIntervalUnitValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntervalUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntervalUnit")(js.undefined)
        ret
    }
  }
  
}

