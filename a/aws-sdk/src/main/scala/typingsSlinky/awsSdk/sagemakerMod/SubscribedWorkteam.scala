package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribedWorkteam extends js.Object {
  /**
    * 
    */
  var ListingId: js.UndefOr[String] = js.native
  /**
    * The description of the vendor from the Amazon Marketplace.
    */
  var MarketplaceDescription: js.UndefOr[String200] = js.native
  /**
    * The title of the service provided by the vendor in the Amazon Marketplace.
    */
  var MarketplaceTitle: js.UndefOr[String200] = js.native
  /**
    * The name of the vendor in the Amazon Marketplace.
    */
  var SellerName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
    */
  var WorkteamArn: typingsSlinky.awsSdk.sagemakerMod.WorkteamArn = js.native
}

object SubscribedWorkteam {
  @scala.inline
  def apply(WorkteamArn: WorkteamArn): SubscribedWorkteam = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribedWorkteam]
  }
  @scala.inline
  implicit class SubscribedWorkteamOps[Self <: SubscribedWorkteam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkteamArn(value: WorkteamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkteamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListingId")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketplaceDescription(value: String200): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarketplaceDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketplaceDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarketplaceDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketplaceTitle(value: String200): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarketplaceTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketplaceTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarketplaceTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSellerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SellerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SellerName")(js.undefined)
        ret
    }
  }
  
}

