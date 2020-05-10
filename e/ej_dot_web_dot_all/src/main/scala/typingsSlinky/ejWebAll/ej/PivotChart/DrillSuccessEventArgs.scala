package typingsSlinky.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrillSuccessEventArgs extends js.Object {
  /** returns the current instance of PivotChart.
    */
  var chartObj: js.UndefOr[js.Any] = js.native
  /** returns the drill action of PivotChart.
    */
  var drillAction: js.UndefOr[String] = js.native
  /** contains the name of the member drilled.
    */
  var drilledMember: js.UndefOr[String] = js.native
  /** returns the event object.
    */
  var event: js.UndefOr[js.Any] = js.native
}

object DrillSuccessEventArgs {
  @scala.inline
  def apply(): DrillSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrillSuccessEventArgs]
  }
  @scala.inline
  implicit class DrillSuccessEventArgsOps[Self <: DrillSuccessEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartObj(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartObj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartObj: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartObj")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillAction")(js.undefined)
        ret
    }
    @scala.inline
    def withDrilledMember(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilledMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrilledMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilledMember")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
  }
  
}

