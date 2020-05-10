package typingsSlinky.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttLocale extends js.Object {
  var date: GanttLocaleDate = js.native
  var labels: GanttLocaleLabels = js.native
}

object GanttLocale {
  @scala.inline
  def apply(date: GanttLocaleDate, labels: GanttLocaleLabels): GanttLocale = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttLocale]
  }
  @scala.inline
  implicit class GanttLocaleOps[Self <: GanttLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: GanttLocaleDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: GanttLocaleLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

