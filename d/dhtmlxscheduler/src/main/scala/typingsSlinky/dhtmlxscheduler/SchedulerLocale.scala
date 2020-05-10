package typingsSlinky.dhtmlxscheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerLocale extends js.Object {
  var date: SchedulerLocaleDate = js.native
  var labels: SchedulerLocaleLabels = js.native
}

object SchedulerLocale {
  @scala.inline
  def apply(date: SchedulerLocaleDate, labels: SchedulerLocaleLabels): SchedulerLocale = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerLocale]
  }
  @scala.inline
  implicit class SchedulerLocaleOps[Self <: SchedulerLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: SchedulerLocaleDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: SchedulerLocaleLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

