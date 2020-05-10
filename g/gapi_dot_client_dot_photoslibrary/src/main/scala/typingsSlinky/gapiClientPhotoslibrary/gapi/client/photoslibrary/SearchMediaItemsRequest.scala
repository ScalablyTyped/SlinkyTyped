package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchMediaItemsRequest extends js.Object {
  /**
    * Identifier of an album. If populated, lists all media items in
    * specified album. Can't set in conjunction with any filters.
    */
  var albumId: js.UndefOr[String] = js.native
  /**
    * Filters to apply to the request. Can't be set in conjunction with an
    * `albumId`.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * Maximum number of media items to return in the response. Fewer media items
    * might be returned than the specified number. The default `pageSize` is 25,
    * the maximum is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A continuation token to get the next page of the results. Adding this to
    * the request returns the rows after the `pageToken`. The `pageToken` should
    * be the value returned in the `nextPageToken` parameter in the response to
    * the `searchMediaItems` request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object SearchMediaItemsRequest {
  @scala.inline
  def apply(): SearchMediaItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchMediaItemsRequest]
  }
  @scala.inline
  implicit class SearchMediaItemsRequestOps[Self <: SearchMediaItemsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbumId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumId")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

