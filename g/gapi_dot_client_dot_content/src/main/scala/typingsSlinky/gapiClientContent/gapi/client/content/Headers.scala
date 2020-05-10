package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  /** A list of location ID sets. Must be non-empty. Can only be set if all other fields are not set. */
  var locations: js.UndefOr[js.Array[LocationIdSet]] = js.native
  /**
    * A list of inclusive number of items upper bounds. The last value can be "infinity". For example ["10", "50", "infinity"] represents the headers "<= 10
    * items", " 50 items". Must be non-empty. Can only be set if all other fields are not set.
    */
  var numberOfItems: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of postal group names. The last value can be "all other locations". Example: ["zone 1", "zone 2", "all other locations"]. The referred postal
    * code groups must match the delivery country of the service. Must be non-empty. Can only be set if all other fields are not set.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * be "infinity". For example [{"value": "10", "currency": "USD"}, {"value": "500", "currency": "USD"}, {"value": "infinity", "currency": "USD"}]
    * represents the headers "<= $10", " $500". All prices within a service must have the same currency. Must be non-empty. Can only be set if all other
    * fields are not set.
    */
  var prices: js.UndefOr[js.Array[Price]] = js.native
  /**
    * be "infinity". For example [{"value": "10", "unit": "kg"}, {"value": "50", "unit": "kg"}, {"value": "infinity", "unit": "kg"}] represents the headers
    * "<= 10kg", " 50kg". All weights within a service must have the same unit. Must be non-empty. Can only be set if all other fields are not set.
    */
  var weights: js.UndefOr[js.Array[Weight]] = js.native
}

object Headers {
  @scala.inline
  def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocations(value: js.Array[LocationIdSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfItems")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCodeGroupNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodeGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeGroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPrices(value: js.Array[Price]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prices")(js.undefined)
        ret
    }
    @scala.inline
    def withWeights(value: js.Array[Weight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weights")(js.undefined)
        ret
    }
  }
  
}

