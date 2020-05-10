package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOrganizationsResponse extends js.Object {
  /**
    * A pagination token to be used to retrieve the next page of results. If the
    * result is too large to fit within the page size specified in the request,
    * this field will be set with a token that can be used to fetch the next page
    * of results. If this field is empty, it indicates that this response
    * contains the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of Organizations that matched the search query, possibly
    * paginated.
    */
  var organizations: js.UndefOr[js.Array[Organization]] = js.native
}

object SearchOrganizationsResponse {
  @scala.inline
  def apply(): SearchOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOrganizationsResponse]
  }
  @scala.inline
  implicit class SearchOrganizationsResponseOps[Self <: SearchOrganizationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOrganizations(value: js.Array[Organization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(js.undefined)
        ret
    }
  }
  
}

