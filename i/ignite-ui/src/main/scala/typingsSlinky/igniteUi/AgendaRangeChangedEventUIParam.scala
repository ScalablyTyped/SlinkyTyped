package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgendaRangeChangedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the days to be shown in AgendaView mode.
  	 */
  var dateRangeInterval: js.UndefOr[Double] = js.native
  /**
  	 * Gets a reference to the newly AgendaView start date.
  	 */
  var newAgendaRangeStartDate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object AgendaRangeChangedEventUIParam {
  @scala.inline
  def apply(): AgendaRangeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaRangeChangedEventUIParam]
  }
  @scala.inline
  implicit class AgendaRangeChangedEventUIParamOps[Self <: AgendaRangeChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateRangeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRangeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRangeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRangeInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withNewAgendaRangeStartDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAgendaRangeStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewAgendaRangeStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAgendaRangeStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

