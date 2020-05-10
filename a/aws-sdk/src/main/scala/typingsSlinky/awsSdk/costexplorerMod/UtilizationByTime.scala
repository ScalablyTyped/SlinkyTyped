package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilizationByTime extends js.Object {
  /**
    * The groups that this utilization result uses.
    */
  var Groups: js.UndefOr[ReservationUtilizationGroups] = js.native
  /**
    * The period of time that this utilization was used for.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  /**
    * The total number of reservation hours that were used.
    */
  var Total: js.UndefOr[ReservationAggregates] = js.native
}

object UtilizationByTime {
  @scala.inline
  def apply(): UtilizationByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilizationByTime]
  }
  @scala.inline
  implicit class UtilizationByTimeOps[Self <: UtilizationByTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: ReservationUtilizationGroups): Self = {
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
    def withTotal(value: ReservationAggregates): Self = {
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

