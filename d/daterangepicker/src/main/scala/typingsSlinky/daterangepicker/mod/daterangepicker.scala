package typingsSlinky.daterangepicker.mod

import typingsSlinky.daterangepicker.mod._Global_.JQuery
import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait daterangepicker extends js.Object {
  var container: JQuery = js.native
  var endDate: Moment = js.native
  var startDate: Moment = js.native
  def remove(): Unit = js.native
  def setEndDate(date: DateOrString): Unit = js.native
  def setStartDate(date: DateOrString): Unit = js.native
}

object daterangepicker {
  @scala.inline
  def apply(
    container: JQuery,
    endDate: Moment,
    remove: () => Unit,
    setEndDate: DateOrString => Unit,
    setStartDate: DateOrString => Unit,
    startDate: Moment
  ): daterangepicker = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), setEndDate = js.Any.fromFunction1(setEndDate), setStartDate = js.Any.fromFunction1(setStartDate), startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[daterangepicker]
  }
  @scala.inline
  implicit class daterangepickerOps[Self <: daterangepicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEndDate(value: DateOrString => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEndDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStartDate(value: DateOrString => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartDate(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

