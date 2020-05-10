package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSchedulerAppointment extends CollectionWidgetItem {
  /** Specifies whether the appointment lasts all day. */
  var allDay: js.UndefOr[Boolean] = js.native
  /** Specifies a detail description of the appointment. */
  var description: js.UndefOr[String] = js.native
  /** Specifies the ending of the appointment. */
  var endDate: js.UndefOr[js.Date] = js.native
  /** Specifies the timezone of the appointment end date. Applies only if timeZone is not specified. */
  var endDateTimeZone: js.UndefOr[String] = js.native
  /** Specifies exceptions for the current recurring appointment. */
  var recurrenceException: js.UndefOr[String] = js.native
  /** Specifies a recurrence rule for generating recurring appointments in the scheduler. */
  var recurrenceRule: js.UndefOr[String] = js.native
  /** Specifies the start of the appointment. */
  var startDate: js.UndefOr[js.Date] = js.native
  /** Specifies the timezone of the appointment start date. Applies only if timeZone is not specified. */
  var startDateTimeZone: js.UndefOr[String] = js.native
  /** Specifies a template that should be used to render this appointment only. */
  @JSName("template")
  var template_dxSchedulerAppointment: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.core.template] = js.native
}

object dxSchedulerAppointment {
  @scala.inline
  def apply(): dxSchedulerAppointment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSchedulerAppointment]
  }
  @scala.inline
  implicit class dxSchedulerAppointmentOps[Self <: dxSchedulerAppointment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllDay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateTimeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrenceException(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrenceException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceException")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrenceRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrenceRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrenceRule")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTimeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: typingsSlinky.devextreme.mod.DevExpress.core.template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

