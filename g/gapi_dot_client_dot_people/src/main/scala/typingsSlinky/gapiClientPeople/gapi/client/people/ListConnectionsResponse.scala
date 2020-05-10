package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConnectionsResponse extends js.Object {
  /** The list of people that the requestor is connected to. */
  var connections: js.UndefOr[js.Array[Person]] = js.native
  /**
    * A token, which can be sent as `page_token` to retrieve the next page.
    * If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A token, which can be sent as `sync_token` to retrieve changes since the
    * last request. Request must set `request_sync_token` to return the sync
    * token.
    */
  var nextSyncToken: js.UndefOr[String] = js.native
  /** The total number of items in the list without pagination. */
  var totalItems: js.UndefOr[Double] = js.native
  /**
    * &#42;&#42;DEPRECATED&#42;&#42; (Please use totalItems)
    * The total number of people in the list without pagination.
    */
  var totalPeople: js.UndefOr[Double] = js.native
}

object ListConnectionsResponse {
  @scala.inline
  def apply(): ListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsResponse]
  }
  @scala.inline
  implicit class ListConnectionsResponseOps[Self <: ListConnectionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnections(value: js.Array[Person]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSyncToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSyncToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSyncToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSyncToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalPeople(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPeople")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPeople: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPeople")(js.undefined)
        ret
    }
  }
  
}

