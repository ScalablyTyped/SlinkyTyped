package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttView extends js.Object {
  var date: js.UndefOr[js.Date] = js.native
  var dayHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var monthHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var range: js.UndefOr[GanttViewRange] = js.native
  var resizeTooltipFormat: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var slotSize: js.UndefOr[Double | String] = js.native
  var timeHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var `type`: js.UndefOr[String] = js.native
  var weekHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var yearHeaderTemplate: js.UndefOr[String | js.Function] = js.native
}

object GanttView {
  @scala.inline
  def apply(): GanttView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttView]
  }
  @scala.inline
  implicit class GanttViewOps[Self <: GanttView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDayHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: GanttViewRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeTooltipFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTooltipFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeTooltipFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTooltipFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withYearHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearHeaderTemplate")(js.undefined)
        ret
    }
  }
  
}

