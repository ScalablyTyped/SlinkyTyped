package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventTrackersResponse extends js.Object {
  /**
    * A list of event trackers.
    */
  var eventTrackers: js.UndefOr[EventTrackers] = js.native
  /**
    * A token for getting the next set of event trackers (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListEventTrackersResponse {
  @scala.inline
  def apply(): ListEventTrackersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTrackersResponse]
  }
  @scala.inline
  implicit class ListEventTrackersResponseOps[Self <: ListEventTrackersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTrackers(value: EventTrackers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTrackers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTrackers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTrackers")(js.undefined)
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
  }
  
}

