package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstantBooking extends js.Object {
  /**
    * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a meeting is started with Alexa. 
    */
  var DurationInMinutes: js.UndefOr[Minutes] = js.native
  /**
    * Whether instant booking is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object InstantBooking {
  @scala.inline
  def apply(): InstantBooking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstantBooking]
  }
  @scala.inline
  implicit class InstantBookingOps[Self <: InstantBooking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationInMinutes(value: Minutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
  }
  
}

