package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLogEventsResponse extends js.Object {
  /**
    * The next sequence token.
    */
  var nextSequenceToken: js.UndefOr[SequenceToken] = js.native
  /**
    * The rejected events.
    */
  var rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo] = js.native
}

object PutLogEventsResponse {
  @scala.inline
  def apply(): PutLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLogEventsResponse]
  }
  @scala.inline
  implicit class PutLogEventsResponseOps[Self <: PutLogEventsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextSequenceToken(value: SequenceToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSequenceToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSequenceToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSequenceToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectedLogEventsInfo(value: RejectedLogEventsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedLogEventsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectedLogEventsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedLogEventsInfo")(js.undefined)
        ret
    }
  }
  
}

