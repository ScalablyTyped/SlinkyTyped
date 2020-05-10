package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectsResponse extends js.Object {
  /**
    * Pagination token.
    *
    * If the result set is too large to fit in a single response, this token
    * is returned. It encodes the position of the current result cursor.
    * Feeding this value into a new list request with the `page_token` parameter
    * gives the next page of the results.
    *
    * When `next_page_token` is not filled in, there is no next page and
    * the list returned is the last page in the result set.
    *
    * Pagination tokens have a limited lifetime.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of Projects that matched the list filter. This list can
    * be paginated.
    */
  var projects: js.UndefOr[js.Array[Project]] = js.native
}

object ListProjectsResponse {
  @scala.inline
  def apply(): ListProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsResponse]
  }
  @scala.inline
  implicit class ListProjectsResponseOps[Self <: ListProjectsResponse] (val x: Self) extends AnyVal {
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
    def withProjects(value: js.Array[Project]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(js.undefined)
        ret
    }
  }
  
}

