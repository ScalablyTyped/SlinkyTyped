package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchThreatListUpdatesRequest extends js.Object {
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.native
  /** The requested threat list updates. */
  var listUpdateRequests: js.UndefOr[js.Array[ListUpdateRequest]] = js.native
}

object FetchThreatListUpdatesRequest {
  @scala.inline
  def apply(): FetchThreatListUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchThreatListUpdatesRequest]
  }
  @scala.inline
  implicit class FetchThreatListUpdatesRequestOps[Self <: FetchThreatListUpdatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: ClientInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withListUpdateRequests(value: js.Array[ListUpdateRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUpdateRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListUpdateRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUpdateRequests")(js.undefined)
        ret
    }
  }
  
}

