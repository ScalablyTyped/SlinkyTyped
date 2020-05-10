package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDealAssociationsResponse extends js.Object {
  /** The list of associations. */
  var associations: js.UndefOr[js.Array[CreativeDealAssociation]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListDealAssociationsRequest.page_token
    * field in the subsequent call to 'ListDealAssociation' method to retrieve
    * the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListDealAssociationsResponse {
  @scala.inline
  def apply(): ListDealAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDealAssociationsResponse]
  }
  @scala.inline
  implicit class ListDealAssociationsResponseOps[Self <: ListDealAssociationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociations(value: js.Array[CreativeDealAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(js.undefined)
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

