package typingsSlinky.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectBillingInfoResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListProjectBillingInfo` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of `ProjectBillingInfo` resources representing the projects
    * associated with the billing account.
    */
  var projectBillingInfo: js.UndefOr[js.Array[ProjectBillingInfo]] = js.native
}

object ListProjectBillingInfoResponse {
  @scala.inline
  def apply(): ListProjectBillingInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectBillingInfoResponse]
  }
  @scala.inline
  implicit class ListProjectBillingInfoResponseOps[Self <: ListProjectBillingInfoResponse] (val x: Self) extends AnyVal {
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
    def withProjectBillingInfo(value: js.Array[ProjectBillingInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectBillingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectBillingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectBillingInfo")(js.undefined)
        ret
    }
  }
  
}

