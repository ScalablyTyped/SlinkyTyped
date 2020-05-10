package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditAllOrderDealsResponse extends js.Object {
  /** List of all deals in the proposal after edit. */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.native
  /** The latest revision number after the update has been applied. */
  var orderRevisionNumber: js.UndefOr[String] = js.native
}

object EditAllOrderDealsResponse {
  @scala.inline
  def apply(): EditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditAllOrderDealsResponse]
  }
  @scala.inline
  implicit class EditAllOrderDealsResponseOps[Self <: EditAllOrderDealsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeals(value: js.Array[MarketplaceDeal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deals")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderRevisionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderRevisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderRevisionNumber")(js.undefined)
        ret
    }
  }
  
}

