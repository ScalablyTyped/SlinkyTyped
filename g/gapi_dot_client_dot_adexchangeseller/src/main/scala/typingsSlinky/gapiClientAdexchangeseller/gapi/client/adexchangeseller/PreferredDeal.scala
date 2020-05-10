package typingsSlinky.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreferredDeal extends js.Object {
  /** The name of the advertiser this deal is for. */
  var advertiserName: js.UndefOr[String] = js.native
  /** The name of the buyer network this deal is for. */
  var buyerNetworkName: js.UndefOr[String] = js.native
  /** The currency code that applies to the fixed_cpm value. If not set then assumed to be USD. */
  var currencyCode: js.UndefOr[String] = js.native
  /** Time when this deal stops being active in seconds since the epoch (GMT). If not set then this deal is valid until manually disabled by the publisher. */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The fixed price for this preferred deal. In cpm micros of currency according to currencyCode. If set, then this preferred deal is eligible for the
    * fixed price tier of buying (highest priority, pay exactly the configured fixed price).
    */
  var fixedCpm: js.UndefOr[String] = js.native
  /** Unique identifier of this preferred deal. */
  var id: js.UndefOr[String] = js.native
  /** Kind of resource this is, in this case adexchangeseller#preferredDeal. */
  var kind: js.UndefOr[String] = js.native
  /** Time when this deal becomes active in seconds since the epoch (GMT). If not set then this deal is active immediately upon creation. */
  var startTime: js.UndefOr[String] = js.native
}

object PreferredDeal {
  @scala.inline
  def apply(): PreferredDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreferredDeal]
  }
  @scala.inline
  implicit class PreferredDealOps[Self <: PreferredDeal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertiserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserName")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyerNetworkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerNetworkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerNetworkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerNetworkName")(js.undefined)
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
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedCpm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedCpm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedCpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedCpm")(js.undefined)
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
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

