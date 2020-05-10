package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks which parties (if any) have paused a deal. The deal is considered
  * paused if either hasBuyerPaused or hasSellPaused is true.
  */
@js.native
trait SchemaDealPauseStatus extends js.Object {
  /**
    * The buyer&#39;s reason for pausing, if the buyer paused the deal.
    */
  var buyerPauseReason: js.UndefOr[String] = js.native
  /**
    * The role of the person who first paused this deal.
    */
  var firstPausedBy: js.UndefOr[String] = js.native
  /**
    * True, if the buyer has paused the deal unilaterally.
    */
  var hasBuyerPaused: js.UndefOr[Boolean] = js.native
  /**
    * True, if the seller has paused the deal unilaterally.
    */
  var hasSellerPaused: js.UndefOr[Boolean] = js.native
  /**
    * The seller&#39;s reason for pausing, if the seller paused the deal.
    */
  var sellerPauseReason: js.UndefOr[String] = js.native
}

object SchemaDealPauseStatus {
  @scala.inline
  def apply(): SchemaDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealPauseStatus]
  }
  @scala.inline
  implicit class SchemaDealPauseStatusOps[Self <: SchemaDealPauseStatus] (val x: Self) extends AnyVal {
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

