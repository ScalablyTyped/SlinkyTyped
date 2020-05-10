package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRule extends js.Object {
  /**
    * The interval between snapshots. The supported values are 2, 3, 4, 6, 8, 12, and 24.
    */
  var Interval: typingsSlinky.awsSdk.dlmMod.Interval = js.native
  /**
    * The interval unit.
    */
  var IntervalUnit: IntervalUnitValues = js.native
  /**
    * The time, in UTC, to start the operation. The supported format is hh:mm. The operation occurs within a one-hour window following the specified time.
    */
  var Times: js.UndefOr[TimesList] = js.native
}

object CreateRule {
  @scala.inline
  def apply(Interval: Interval, IntervalUnit: IntervalUnitValues): CreateRule = {
    val __obj = js.Dynamic.literal(Interval = Interval.asInstanceOf[js.Any], IntervalUnit = IntervalUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRule]
  }
  @scala.inline
  implicit class CreateRuleOps[Self <: CreateRule] (val x: Self) extends AnyVal {
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
    def withIntervalUnit(value: IntervalUnitValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntervalUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimes(value: TimesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Times")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Times")(js.undefined)
        ret
    }
  }
  
}

