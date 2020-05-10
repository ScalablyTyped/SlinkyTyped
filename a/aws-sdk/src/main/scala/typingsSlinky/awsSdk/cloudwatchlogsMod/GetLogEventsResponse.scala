package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogEventsResponse extends js.Object {
  /**
    * The events.
    */
  var events: js.UndefOr[OutputLogEvents] = js.native
  /**
    * The token for the next set of items in the backward direction. The token expires after 24 hours. This token will never be null. If you have reached the end of the stream, it will return the same token you passed in.
    */
  var nextBackwardToken: js.UndefOr[NextToken] = js.native
  /**
    * The token for the next set of items in the forward direction. The token expires after 24 hours. If you have reached the end of the stream, it will return the same token you passed in.
    */
  var nextForwardToken: js.UndefOr[NextToken] = js.native
}

object GetLogEventsResponse {
  @scala.inline
  def apply(): GetLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogEventsResponse]
  }
  @scala.inline
  implicit class GetLogEventsResponseOps[Self <: GetLogEventsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: OutputLogEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withNextBackwardToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextBackwardToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextBackwardToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextBackwardToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNextForwardToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextForwardToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextForwardToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextForwardToken")(js.undefined)
        ret
    }
  }
  
}

