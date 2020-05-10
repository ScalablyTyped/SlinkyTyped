package typingsSlinky.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTestablePermissionsRequest extends js.Object {
  /**
    * Required. The full resource name to query from the list of testable
    * permissions.
    *
    * The name follows the Google Cloud Platform resource format.
    * For example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.native
  /** Optional limit on the number of permissions to include in the response. */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional pagination token returned in an earlier
    * QueryTestablePermissionsRequest.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object QueryTestablePermissionsRequest {
  @scala.inline
  def apply(): QueryTestablePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTestablePermissionsRequest]
  }
  @scala.inline
  implicit class QueryTestablePermissionsRequestOps[Self <: QueryTestablePermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResourceName")(js.undefined)
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

