package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClientsResponse extends js.Object {
  /** The returned list of clients. */
  var clients: js.UndefOr[js.Array[Client]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListClientsRequest.pageToken
    * field in the subsequent call to the
    * accounts.clients.list method
    * to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListClientsResponse {
  @scala.inline
  def apply(): ListClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClientsResponse]
  }
  @scala.inline
  implicit class ListClientsResponseOps[Self <: ListClientsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClients(value: js.Array[Client]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clients")(js.undefined)
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
  }
  
}

