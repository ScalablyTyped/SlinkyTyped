package typingsSlinky.nodeCron.mod

import typingsSlinky.tzOffset.mod.Timezone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleOptions extends js.Object {
  /**
    * A boolean to set if the created task is scheduled.
    *
    * Defaults to `true`
    */
  var scheduled: js.UndefOr[Boolean] = js.native
  /**
    * The timezone that is used for job scheduling
    */
  var timezone: js.UndefOr[Timezone] = js.native
}

object ScheduleOptions {
  @scala.inline
  def apply(): ScheduleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleOptions]
  }
  @scala.inline
  implicit class ScheduleOptionsOps[Self <: ScheduleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheduled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduled")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: Timezone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
  }
  
}

