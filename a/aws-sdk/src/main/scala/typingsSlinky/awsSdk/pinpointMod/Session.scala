package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /**
    * The duration of the session, in milliseconds.
    */
  var Duration: js.UndefOr[integer] = js.native
  /**
    * The unique identifier for the session.
    */
  var Id: string = js.native
  /**
    * The date and time when the session began.
    */
  var StartTimestamp: string = js.native
  /**
    * The date and time when the session ended.
    */
  var StopTimestamp: js.UndefOr[string] = js.native
}

object Session {
  @scala.inline
  def apply(Id: string, StartTimestamp: string): Session = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTimestamp(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(js.undefined)
        ret
    }
    @scala.inline
    def withStopTimestamp(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopTimestamp")(js.undefined)
        ret
    }
  }
  
}

