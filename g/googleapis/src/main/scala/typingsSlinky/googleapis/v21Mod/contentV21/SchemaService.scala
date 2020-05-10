package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaService extends js.Object {
  /**
    * A boolean exposing the active status of the shipping service. Required.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * The CLDR code of the currency to which this service applies. Must match
    * that of the prices in rate groups.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The CLDR territory code of the country to which the service applies.
    * Required.
    */
  var deliveryCountry: js.UndefOr[String] = js.native
  /**
    * Time spent in various aspects from order to the delivery of the product.
    * Required.
    */
  var deliveryTime: js.UndefOr[SchemaDeliveryTime] = js.native
  /**
    * Eligibility for this service.
    */
  var eligibility: js.UndefOr[String] = js.native
  /**
    * Minimum order value for this service. If set, indicates that customers
    * will have to spend at least this amount. All prices within a service must
    * have the same currency.
    */
  var minimumOrderValue: js.UndefOr[SchemaPrice] = js.native
  /**
    * Free-form name of the service. Must be unique within target account.
    * Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Shipping rate group definitions. Only the last one is allowed to have an
    * empty applicableShippingLabels, which means &quot;everything else&quot;.
    * The other applicableShippingLabels must not overlap.
    */
  var rateGroups: js.UndefOr[js.Array[SchemaRateGroup]] = js.native
}

object SchemaService {
  @scala.inline
  def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  @scala.inline
  implicit class SchemaServiceOps[Self <: SchemaService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryTime(value: SchemaDeliveryTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEligibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligibility")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumOrderValue(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumOrderValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumOrderValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumOrderValue")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRateGroups(value: js.Array[SchemaRateGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateGroups")(js.undefined)
        ret
    }
  }
  
}

