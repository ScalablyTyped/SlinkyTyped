package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeScale extends js.Object {
  /** When set to true, displays the time slots on the Scheduler.
    * @Default {true}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Accepts the value in minutes. When provided with specific value, displays the appropriate time interval on the Scheduler
    * @Default {60}
    */
  var majorSlot: js.UndefOr[Double] = js.native
  /** Template design that customizes the timecells (major slots). Accepts id value of the template defined for major time slots.
    * @Default {null}
    */
  var majorSlotTemplateId: js.UndefOr[String] = js.native
  /** When set with some specific value, defines the number of time divisions split per hour(as per value given for the majorTimeSlot). Those time divisions are meant to be the minor
    * slots.
    * @Default {2}
    */
  var minorSlotCount: js.UndefOr[Double] = js.native
  /** Template design that customizes the timecells (minor slots) that are partitioned based on minorSlotCount. Accepts id value of the template defined for minor time slots.
    * @Default {null}
    */
  var minorSlotTemplateId: js.UndefOr[String] = js.native
}

object TimeScale {
  @scala.inline
  def apply(): TimeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeScale]
  }
  @scala.inline
  implicit class TimeScaleOps[Self <: TimeScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorSlot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorSlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorSlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorSlot")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorSlotTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorSlotTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorSlotTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorSlotTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorSlotCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorSlotCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorSlotCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorSlotCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorSlotTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorSlotTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorSlotTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorSlotTemplateId")(js.undefined)
        ret
    }
  }
  
}

