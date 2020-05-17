package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Declare client constants that specify the Gantt's view type.
  */
@js.native
trait ASPxClientGanttViewType extends js.Object {
  /**
    * Displays days.
    */
  var Days: Double = js.native
  /**
    * Displays hours.
    */
  var Hours: Double = js.native
  /**
    * Display months.
    */
  var Months: Double = js.native
  /**
    * Displays weeks.
    */
  var Weeks: Double = js.native
}

object ASPxClientGanttViewType {
  @scala.inline
  def apply(Days: Double, Hours: Double, Months: Double, Weeks: Double): ASPxClientGanttViewType = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Hours = Hours.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Weeks = Weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttViewType]
  }
  @scala.inline
  implicit class ASPxClientGanttViewTypeOps[Self <: ASPxClientGanttViewType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeeks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weeks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

