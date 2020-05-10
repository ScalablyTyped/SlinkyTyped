package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration data for Ad Exchange RTB - Budget API.
  */
@js.native
trait SchemaBudget extends js.Object {
  /**
    * The id of the account. This is required for get and update requests.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The billing id to determine which adgroup to provide budget information
    * for. This is required for get and update requests.
    */
  var billingId: js.UndefOr[String] = js.native
  /**
    * The daily budget amount in unit amount of the account currency to apply
    * for the billingId provided. This is required for update requests.
    */
  var budgetAmount: js.UndefOr[String] = js.native
  /**
    * The currency code for the buyer. This cannot be altered here.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * The unique id that describes this item.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of the resource, i.e. &quot;adexchangebuyer#budget&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBudget {
  @scala.inline
  def apply(): SchemaBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBudget]
  }
  @scala.inline
  implicit class SchemaBudgetOps[Self <: SchemaBudget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingId")(js.undefined)
        ret
    }
    @scala.inline
    def withBudgetAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("budgetAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgetAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("budgetAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

