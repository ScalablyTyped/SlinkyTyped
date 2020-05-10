package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripOption extends js.Object {
  /** Identifier uniquely identifying this trip in a response. */
  var id: js.UndefOr[String] = js.native
  /** Identifies this as a trip information object. Value: the fixed string qpxexpress#tripOption. */
  var kind: js.UndefOr[String] = js.native
  /** Per passenger pricing information. */
  var pricing: js.UndefOr[js.Array[PricingInfo]] = js.native
  /** The total price for all passengers on the trip, in the form of a currency followed by an amount, e.g. USD253.35. */
  var saleTotal: js.UndefOr[String] = js.native
  /** The slices that make up this trip's itinerary. */
  var slice: js.UndefOr[js.Array[SliceInfo]] = js.native
}

object TripOption {
  @scala.inline
  def apply(): TripOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOption]
  }
  @scala.inline
  implicit class TripOptionOps[Self <: TripOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPricing(value: js.Array[PricingInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricing")(js.undefined)
        ret
    }
    @scala.inline
    def withSaleTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaleTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withSlice(value: js.Array[SliceInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(js.undefined)
        ret
    }
  }
  
}

