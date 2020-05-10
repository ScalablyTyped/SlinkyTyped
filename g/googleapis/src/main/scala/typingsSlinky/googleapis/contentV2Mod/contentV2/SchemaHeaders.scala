package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A non-empty list of row or column headers for a table. Exactly one of
  * prices, weights, numItems, postalCodeGroupNames, or location must be set.
  */
@js.native
trait SchemaHeaders extends js.Object {
  /**
    * A list of location ID sets. Must be non-empty. Can only be set if all
    * other fields are not set.
    */
  var locations: js.UndefOr[js.Array[SchemaLocationIdSet]] = js.native
  /**
    * A list of inclusive number of items upper bounds. The last value can be
    * &quot;infinity&quot;. For example [&quot;10&quot;, &quot;50&quot;,
    * &quot;infinity&quot;] represents the headers &quot;&lt;= 10 items&quot;,
    * &quot; 50 items&quot;. Must be non-empty. Can only be set if all other
    * fields are not set.
    */
  var numberOfItems: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of postal group names. The last value can be &quot;all other
    * locations&quot;. Example: [&quot;zone 1&quot;, &quot;zone 2&quot;,
    * &quot;all other locations&quot;]. The referred postal code groups must
    * match the delivery country of the service. Must be non-empty. Can only be
    * set if all other fields are not set.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of inclusive order price upper bounds. The last price&#39;s value
    * can be &quot;infinity&quot;. For example [{&quot;value&quot;:
    * &quot;10&quot;, &quot;currency&quot;: &quot;USD&quot;},
    * {&quot;value&quot;: &quot;500&quot;, &quot;currency&quot;:
    * &quot;USD&quot;}, {&quot;value&quot;: &quot;infinity&quot;,
    * &quot;currency&quot;: &quot;USD&quot;}] represents the headers
    * &quot;&lt;= $10&quot;, &quot; $500&quot;. All prices within a service
    * must have the same currency. Must be non-empty. Can only be set if all
    * other fields are not set.
    */
  var prices: js.UndefOr[js.Array[SchemaPrice]] = js.native
  /**
    * A list of inclusive order weight upper bounds. The last weight&#39;s
    * value can be &quot;infinity&quot;. For example [{&quot;value&quot;:
    * &quot;10&quot;, &quot;unit&quot;: &quot;kg&quot;}, {&quot;value&quot;:
    * &quot;50&quot;, &quot;unit&quot;: &quot;kg&quot;}, {&quot;value&quot;:
    * &quot;infinity&quot;, &quot;unit&quot;: &quot;kg&quot;}] represents the
    * headers &quot;&lt;= 10kg&quot;, &quot; 50kg&quot;. All weights within a
    * service must have the same unit. Must be non-empty. Can only be set if
    * all other fields are not set.
    */
  var weights: js.UndefOr[js.Array[SchemaWeight]] = js.native
}

object SchemaHeaders {
  @scala.inline
  def apply(): SchemaHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeaders]
  }
  @scala.inline
  implicit class SchemaHeadersOps[Self <: SchemaHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocations(value: js.Array[SchemaLocationIdSet]): Self = {
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
    def withPrices(value: js.Array[SchemaPrice]): Self = {
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
    def withWeights(value: js.Array[SchemaWeight]): Self = {
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

