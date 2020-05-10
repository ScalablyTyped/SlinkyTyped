package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultByTime extends js.Object {
  /**
    * Whether the result is estimated.
    */
  var Estimated: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Estimated] = js.native
  /**
    * The groups that this time period includes.
    */
  var Groups: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Groups] = js.native
  /**
    * The time period that the result covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  /**
    * The total amount of cost or usage accrued during the time period.
    */
  var Total: js.UndefOr[Metrics] = js.native
}

object ResultByTime {
  @scala.inline
  def apply(): ResultByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultByTime]
  }
  @scala.inline
  implicit class ResultByTimeOps[Self <: ResultByTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimated(value: Estimated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Estimated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Estimated")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: Groups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePeriod(value: DateInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Metrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(js.undefined)
        ret
    }
  }
  
}

