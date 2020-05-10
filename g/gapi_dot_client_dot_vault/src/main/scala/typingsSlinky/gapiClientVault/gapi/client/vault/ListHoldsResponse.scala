package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHoldsResponse extends js.Object {
  /** The list of holds. */
  var holds: js.UndefOr[js.Array[Hold]] = js.native
  /**
    * Page token to retrieve the next page of results in the list.
    * If this is empty, then there are no more holds to list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListHoldsResponse {
  @scala.inline
  def apply(): ListHoldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHoldsResponse]
  }
  @scala.inline
  implicit class ListHoldsResponseOps[Self <: ListHoldsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHolds(value: js.Array[Hold]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holds")(js.undefined)
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

