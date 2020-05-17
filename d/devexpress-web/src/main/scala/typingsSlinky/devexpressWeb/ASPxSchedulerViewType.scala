package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the SchedulerViewType object.
  */
@js.native
trait ASPxSchedulerViewType extends js.Object {
  /**
    * Gets a string representation equivalent to the SchedulerViewType.Agenda enumeration for use in client scripts.
    */
  var Agenda: String = js.native
  /**
    * Gets a string representation equivalent of SchedulerViewType.Day enumeration for use in client scripts.
    */
  var Day: String = js.native
  /**
    * Gets a string representation equivalent of SchedulerViewType.FullWeek enumeration for use in client scripts.
    */
  var FullWeek: String = js.native
  /**
    * Gets a string representation equivalent of SchedulerViewType.Month enumeration for use in client scripts.
    */
  var Month: String = js.native
  /**
    * Gets a string representation equivalent of SchedulerViewType.Timeline enumeration for use in client scripts.
    */
  var Timeline: String = js.native
  /**
    * Gets a string representation equivalent of SchedulerViewType.Week enumeration for use in client scripts.
    */
  var Week: String = js.native
  /**
    * Gets a string representation equivalent of SchedulerViewType.WorkWeek enumeration for use in client scripts.
    */
  var WorkWeek: String = js.native
}

object ASPxSchedulerViewType {
  @scala.inline
  def apply(
    Agenda: String,
    Day: String,
    FullWeek: String,
    Month: String,
    Timeline: String,
    Week: String,
    WorkWeek: String
  ): ASPxSchedulerViewType = {
    val __obj = js.Dynamic.literal(Agenda = Agenda.asInstanceOf[js.Any], Day = Day.asInstanceOf[js.Any], FullWeek = FullWeek.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Timeline = Timeline.asInstanceOf[js.Any], Week = Week.asInstanceOf[js.Any], WorkWeek = WorkWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxSchedulerViewType]
  }
  @scala.inline
  implicit class ASPxSchedulerViewTypeOps[Self <: ASPxSchedulerViewType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgenda(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Agenda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkWeek")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

