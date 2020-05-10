package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubePaginationInfo[T] extends js.Object {
  /**
    * The ETag of the response.
    */
  var etag: String = js.native
  /**
    * A list of activities, or events, that match the request criteria.
    */
  var items: js.Array[T] = js.native
  /**
    * The type of the API response. For this operation, the value will be youtube#activityListResponse.
    */
  var kind: String = js.native
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
    */
  var nextPageToken: String = js.native
  /**
    * The pageInfo object encapsulates paging information for the result set.
    */
  var pageInfo: AnonResultsPerPage = js.native
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.
    */
  var prevPageToken: String = js.native
}

object GoogleApiYouTubePaginationInfo {
  @scala.inline
  def apply[T](
    etag: String,
    items: js.Array[T],
    kind: String,
    nextPageToken: String,
    pageInfo: AnonResultsPerPage,
    prevPageToken: String
  ): GoogleApiYouTubePaginationInfo[T] = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any], prevPageToken = prevPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubePaginationInfo[T]]
  }
  @scala.inline
  implicit class GoogleApiYouTubePaginationInfoOps[Self[t] <: GoogleApiYouTubePaginationInfo[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEtag(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageInfo(value: AnonResultsPerPage): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevPageToken(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

