package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAttendeeResponse extends js.Object {
  /**
    * The attendee information, including attendee ID and join token.
    */
  var Attendee: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Attendee] = js.native
}

object CreateAttendeeResponse {
  @scala.inline
  def apply(): CreateAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAttendeeResponse]
  }
  @scala.inline
  implicit class CreateAttendeeResponseOps[Self <: CreateAttendeeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttendee(value: Attendee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attendee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttendee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attendee")(js.undefined)
        ret
    }
  }
  
}

