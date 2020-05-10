package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterLogEventsResponse extends js.Object {
  /**
    * The matched events.
    */
  var events: js.UndefOr[FilteredLogEvents] = js.native
  /**
    * The token to use when requesting the next set of items. The token expires after 24 hours.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Indicates which log streams have been searched and whether each has been searched completely.
    */
  var searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.native
}

object FilterLogEventsResponse {
  @scala.inline
  def apply(): FilterLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterLogEventsResponse]
  }
  @scala.inline
  implicit class FilterLogEventsResponseOps[Self <: FilterLogEventsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: FilteredLogEvents): Self = {
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
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchedLogStreams(value: SearchedLogStreams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchedLogStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchedLogStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchedLogStreams")(js.undefined)
        ret
    }
  }
  
}

