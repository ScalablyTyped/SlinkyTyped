package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan extends js.Object {
  var accounts_url: String = js.native
  var bullets: js.Array[String] = js.native
  var description: String = js.native
  var has_free_trial: Boolean = js.native
  var id: Double = js.native
  var monthly_price_in_cents: Double = js.native
  var name: String = js.native
  var number: Double = js.native
  var price_model: String = js.native
  var state: String = js.native
  var unit_name: Null = js.native
  var url: String = js.native
  var yearly_price_in_cents: Double = js.native
}

object AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan {
  @scala.inline
  def apply(
    accounts_url: String,
    bullets: js.Array[String],
    description: String,
    has_free_trial: Boolean,
    id: Double,
    monthly_price_in_cents: Double,
    name: String,
    number: Double,
    price_model: String,
    state: String,
    unit_name: Null,
    url: String,
    yearly_price_in_cents: Double
  ): AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan = {
    val __obj = js.Dynamic.literal(accounts_url = accounts_url.asInstanceOf[js.Any], bullets = bullets.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has_free_trial = has_free_trial.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], monthly_price_in_cents = monthly_price_in_cents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], price_model = price_model.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], unit_name = unit_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], yearly_price_in_cents = yearly_price_in_cents.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan]
  }
  @scala.inline
  implicit class AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlanOps[Self <: AppsCheckAccountIsAssociatedWithAnyStubbedResponseMarketplacePendingChangePlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBullets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_free_trial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_free_trial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthly_price_in_cents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthly_price_in_cents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice_model(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit_name(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearly_price_in_cents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearly_price_in_cents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

