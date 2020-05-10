package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchReadGroupSetsResponse extends js.Object {
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of matching read group sets. */
  var readGroupSets: js.UndefOr[js.Array[ReadGroupSet]] = js.native
}

object SearchReadGroupSetsResponse {
  @scala.inline
  def apply(): SearchReadGroupSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchReadGroupSetsResponse]
  }
  @scala.inline
  implicit class SearchReadGroupSetsResponseOps[Self <: SearchReadGroupSetsResponse] (val x: Self) extends AnyVal {
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
    def withReadGroupSets(value: js.Array[ReadGroupSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGroupSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadGroupSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGroupSets")(js.undefined)
        ret
    }
  }
  
}

