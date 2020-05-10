package typingsSlinky.reactBigScheduler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerProps extends js.Object {
  var schedulerData: SchedulerData = js.native
  def nextClick(schedulerData: SchedulerData): Unit = js.native
  def onSelectDate(schedulerData: SchedulerData, date: String): Unit = js.native
  def onViewChange(schedulerData: SchedulerData, view: View): Unit = js.native
  def prevClick(schedulerData: SchedulerData): Unit = js.native
}

object SchedulerProps {
  @scala.inline
  def apply(
    nextClick: SchedulerData => Unit,
    onSelectDate: (SchedulerData, String) => Unit,
    onViewChange: (SchedulerData, View) => Unit,
    prevClick: SchedulerData => Unit,
    schedulerData: SchedulerData
  ): SchedulerProps = {
    val __obj = js.Dynamic.literal(nextClick = js.Any.fromFunction1(nextClick), onSelectDate = js.Any.fromFunction2(onSelectDate), onViewChange = js.Any.fromFunction2(onViewChange), prevClick = js.Any.fromFunction1(prevClick), schedulerData = schedulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerProps]
  }
  @scala.inline
  implicit class SchedulerPropsOps[Self <: SchedulerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextClick(value: SchedulerData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSelectDate(value: (SchedulerData, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnViewChange(value: (SchedulerData, View) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrevClick(value: SchedulerData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSchedulerData(value: SchedulerData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulerData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

