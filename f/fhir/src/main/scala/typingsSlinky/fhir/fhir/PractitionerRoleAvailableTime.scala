package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Times the Service Site is available
  */
@js.native
trait PractitionerRoleAvailableTime extends BackboneElement {
  /**
    * Contains extended information for property 'allDay'.
    */
  var _allDay: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'availableEndTime'.
    */
  var _availableEndTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'availableStartTime'.
    */
  var _availableStartTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'daysOfWeek'.
    */
  var _daysOfWeek: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Always available? e.g. 24 hour service
    */
  var allDay: js.UndefOr[Boolean] = js.native
  /**
    * Closing time of day (ignored if allDay = true)
    */
  var availableEndTime: js.UndefOr[time] = js.native
  /**
    * Opening time of day (ignored if allDay = true)
    */
  var availableStartTime: js.UndefOr[time] = js.native
  /**
    * mon | tue | wed | thu | fri | sat | sun
    */
  var daysOfWeek: js.UndefOr[js.Array[code]] = js.native
}

object PractitionerRoleAvailableTime {
  @scala.inline
  def apply(): PractitionerRoleAvailableTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PractitionerRoleAvailableTime]
  }
  @scala.inline
  implicit class PractitionerRoleAvailableTimeOps[Self <: PractitionerRoleAvailableTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_allDay(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_allDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allDay")(js.undefined)
        ret
    }
    @scala.inline
    def with_availableEndTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_availableEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_availableEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_availableEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_availableStartTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_availableStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_availableStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_availableStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_daysOfWeek(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_daysOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_daysOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_daysOfWeek")(js.undefined)
        ret
    }
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
    def withAvailableEndTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableStartTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysOfWeek(value: js.Array[code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(js.undefined)
        ret
    }
  }
  
}

