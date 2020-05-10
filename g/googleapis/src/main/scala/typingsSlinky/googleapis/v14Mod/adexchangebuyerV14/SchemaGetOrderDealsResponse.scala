package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetOrderDealsResponse extends js.Object {
  /**
    * List of deals for the proposal
    */
  var deals: js.UndefOr[js.Array[SchemaMarketplaceDeal]] = js.native
}

object SchemaGetOrderDealsResponse {
  @scala.inline
  def apply(): SchemaGetOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOrderDealsResponse]
  }
  @scala.inline
  implicit class SchemaGetOrderDealsResponseOps[Self <: SchemaGetOrderDealsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeals(value: js.Array[SchemaMarketplaceDeal]): Self = {
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
  }
  
}

