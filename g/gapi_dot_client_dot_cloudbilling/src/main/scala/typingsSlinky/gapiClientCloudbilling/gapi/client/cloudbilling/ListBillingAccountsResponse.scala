package typingsSlinky.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBillingAccountsResponse extends js.Object {
  /** A list of billing accounts. */
  var billingAccounts: js.UndefOr[js.Array[BillingAccount]] = js.native
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListBillingAccounts` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListBillingAccountsResponse {
  @scala.inline
  def apply(): ListBillingAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingAccountsResponse]
  }
  @scala.inline
  implicit class ListBillingAccountsResponseOps[Self <: ListBillingAccountsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingAccounts(value: js.Array[BillingAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAccounts")(js.undefined)
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

