package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFilterSetsResponse extends js.Object {
  /** The filter sets belonging to the buyer. */
  var filterSets: js.UndefOr[js.Array[FilterSet]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListFilterSetsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListFilterSetsResponse {
  @scala.inline
  def apply(): ListFilterSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFilterSetsResponse]
  }
  @scala.inline
  implicit class ListFilterSetsResponseOps[Self <: ListFilterSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterSets(value: js.Array[FilterSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSets")(js.undefined)
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

