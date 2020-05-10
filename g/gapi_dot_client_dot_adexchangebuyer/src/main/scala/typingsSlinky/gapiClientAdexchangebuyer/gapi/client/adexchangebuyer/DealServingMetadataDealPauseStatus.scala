package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DealServingMetadataDealPauseStatus extends js.Object {
  var buyerPauseReason: js.UndefOr[String] = js.native
  /** If the deal is paused, records which party paused the deal first. */
  var firstPausedBy: js.UndefOr[String] = js.native
  var hasBuyerPaused: js.UndefOr[Boolean] = js.native
  var hasSellerPaused: js.UndefOr[Boolean] = js.native
  var sellerPauseReason: js.UndefOr[String] = js.native
}

object DealServingMetadataDealPauseStatus {
  @scala.inline
  def apply(): DealServingMetadataDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealServingMetadataDealPauseStatus]
  }
  @scala.inline
  implicit class DealServingMetadataDealPauseStatusOps[Self <: DealServingMetadataDealPauseStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuyerPauseReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerPauseReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerPauseReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerPauseReason")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPausedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPausedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPausedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPausedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBuyerPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBuyerPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBuyerPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBuyerPaused")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSellerPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSellerPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSellerPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSellerPaused")(js.undefined)
        ret
    }
    @scala.inline
    def withSellerPauseReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerPauseReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellerPauseReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerPauseReason")(js.undefined)
        ret
    }
  }
  
}

