package typingsSlinky.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A page of the response received from the ListProjects method.  A paginated
  * response where more pages are available has `next_page_token` set. This
  * token can be used in a subsequent request to retrieve the next request
  * page.
  */
@js.native
trait SchemaListProjectsResponse extends js.Object {
  /**
    * Pagination token.  If the result set is too large to fit in a single
    * response, this token is returned. It encodes the position of the current
    * result cursor. Feeding this value into a new list request with the
    * `page_token` parameter gives the next page of the results.  When
    * `next_page_token` is not filled in, there is no next page and the list
    * returned is the last page in the result set.  Pagination tokens have a
    * limited lifetime.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of Projects that matched the list filter. This list can be
    * paginated.
    */
  var projects: js.UndefOr[js.Array[SchemaProject]] = js.native
}

object SchemaListProjectsResponse {
  @scala.inline
  def apply(): SchemaListProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProjectsResponse]
  }
  @scala.inline
  implicit class SchemaListProjectsResponseOps[Self <: SchemaListProjectsResponse] (val x: Self) extends AnyVal {
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
    def withProjects(value: js.Array[SchemaProject]): Self = {
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

