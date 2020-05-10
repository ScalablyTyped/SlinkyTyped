package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountIdentifier extends js.Object {
  /**
    * The aggregator ID, set for aggregators and subaccounts (in that case, it
    * represents the aggregator of the subaccount).
    */
  var aggregatorId: js.UndefOr[String] = js.native
  /**
    * The merchant account ID, set for individual accounts and subaccounts.
    */
  var merchantId: js.UndefOr[String] = js.native
}

object SchemaAccountIdentifier {
  @scala.inline
  def apply(): SchemaAccountIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountIdentifier]
  }
  @scala.inline
  implicit class SchemaAccountIdentifierOps[Self <: SchemaAccountIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregatorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatorId")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(js.undefined)
        ret
    }
  }
  
}

