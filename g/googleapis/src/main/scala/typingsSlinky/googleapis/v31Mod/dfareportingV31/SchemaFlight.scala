package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flight
  */
@js.native
trait SchemaFlight extends js.Object {
  /**
    * Inventory item flight end date.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Rate or cost of this flight.
    */
  var rateOrCost: js.UndefOr[String] = js.native
  /**
    * Inventory item flight start date.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Units of this flight.
    */
  var units: js.UndefOr[String] = js.native
}

object SchemaFlight {
  @scala.inline
  def apply(): SchemaFlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlight]
  }
  @scala.inline
  implicit class SchemaFlightOps[Self <: SchemaFlight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRateOrCost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateOrCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateOrCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateOrCost")(js.undefined)
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
    @scala.inline
    def withUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

