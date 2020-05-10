package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DealServingMetadata extends js.Object {
  /**
    * True if alcohol ads are allowed for this deal (read-only). This field is only populated when querying for finalized orders using the method
    * GetFinalizedOrderDeals
    */
  var alcoholAdsAllowed: js.UndefOr[Boolean] = js.native
  /** Tracks which parties (if any) have paused a deal. (readonly, except via PauseResumeOrderDeals action) */
  var dealPauseStatus: js.UndefOr[DealServingMetadataDealPauseStatus] = js.native
}

object DealServingMetadata {
  @scala.inline
  def apply(): DealServingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealServingMetadata]
  }
  @scala.inline
  implicit class DealServingMetadataOps[Self <: DealServingMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlcoholAdsAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alcoholAdsAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlcoholAdsAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alcoholAdsAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withDealPauseStatus(value: DealServingMetadataDealPauseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealPauseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealPauseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealPauseStatus")(js.undefined)
        ret
    }
  }
  
}

