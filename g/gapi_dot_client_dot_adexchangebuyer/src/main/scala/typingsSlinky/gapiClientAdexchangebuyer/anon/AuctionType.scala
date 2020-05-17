package typingsSlinky.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuctionType extends js.Object {
  /** Only set when contextType=AUCTION_TYPE. Represents the auction types this restriction applies to. */
  var auctionType: js.UndefOr[js.Array[String]] = js.native
  /** The type of context (e.g., location, platform, auction type, SSL-ness). */
  var contextType: js.UndefOr[String] = js.native
  /**
    * Only set when contextType=LOCATION. Represents the geo criterias this restriction applies to. Impressions are considered to match a context if either
    * the user location or publisher location matches a given geoCriteriaId.
    */
  var geoCriteriaId: js.UndefOr[js.Array[Double]] = js.native
  /** Only set when contextType=PLATFORM. Represents the platforms this restriction applies to. */
  var platform: js.UndefOr[js.Array[String]] = js.native
}

object AuctionType {
  @scala.inline
  def apply(): AuctionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuctionType]
  }
  @scala.inline
  implicit class AuctionTypeOps[Self <: AuctionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuctionType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auctionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuctionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auctionType")(js.undefined)
        ret
    }
    @scala.inline
    def withContextType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextType")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoCriteriaId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoCriteriaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoCriteriaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoCriteriaId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
  }
  
}

