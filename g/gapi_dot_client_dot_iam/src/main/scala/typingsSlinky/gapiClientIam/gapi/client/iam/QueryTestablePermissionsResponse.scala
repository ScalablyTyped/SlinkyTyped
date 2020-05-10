package typingsSlinky.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTestablePermissionsResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `QueryTestableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The Permissions testable on the requested resource. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.native
}

object QueryTestablePermissionsResponse {
  @scala.inline
  def apply(): QueryTestablePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTestablePermissionsResponse]
  }
  @scala.inline
  implicit class QueryTestablePermissionsResponseOps[Self <: QueryTestablePermissionsResponse] (val x: Self) extends AnyVal {
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
    def withPermissions(value: js.Array[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
  }
  
}

