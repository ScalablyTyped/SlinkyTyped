package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pricing Information
  */
@js.native
trait SchemaPricing extends js.Object {
  /**
    * Cap cost type of this inventory item.
    */
  var capCostType: js.UndefOr[String] = js.native
  /**
    * End date of this inventory item.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Flights of this inventory item. A flight (a.k.a. pricing period)
    * represents the inventory item pricing information for a specific period
    * of time.
    */
  var flights: js.UndefOr[js.Array[SchemaFlight]] = js.native
  /**
    * Group type of this inventory item if it represents a placement group. Is
    * null otherwise. There are two type of placement groups:
    * PLANNING_PLACEMENT_GROUP_TYPE_PACKAGE is a simple group of inventory
    * items that acts as a single pricing point for a group of tags.
    * PLANNING_PLACEMENT_GROUP_TYPE_ROADBLOCK is a group of inventory items
    * that not only acts as a single pricing point, but also assumes that all
    * the tags in it will be served at the same time. A roadblock requires one
    * of its assigned inventory items to be marked as primary.
    */
  var groupType: js.UndefOr[String] = js.native
  /**
    * Pricing type of this inventory item.
    */
  var pricingType: js.UndefOr[String] = js.native
  /**
    * Start date of this inventory item.
    */
  var startDate: js.UndefOr[String] = js.native
}

object SchemaPricing {
  @scala.inline
  def apply(): SchemaPricing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricing]
  }
  @scala.inline
  implicit class SchemaPricingOps[Self <: SchemaPricing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapCostType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capCostType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapCostType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capCostType")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFlights(value: js.Array[SchemaFlight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flights")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupType")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
  }
  
}

