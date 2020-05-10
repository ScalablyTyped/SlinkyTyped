package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreativesResponse extends js.Object {
  /** The list of creatives. */
  var creatives: js.UndefOr[js.Array[Creative]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListCreativesRequest.page_token
    * field in the subsequent call to `ListCreatives` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListCreativesResponse {
  @scala.inline
  def apply(): ListCreativesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreativesResponse]
  }
  @scala.inline
  implicit class ListCreativesResponseOps[Self <: ListCreativesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatives(value: js.Array[Creative]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatives")(js.undefined)
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

