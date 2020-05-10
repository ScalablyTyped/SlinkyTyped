package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServingContext extends js.Object {
  /** Matches all contexts. */
  var all: js.UndefOr[String] = js.native
  /** Matches impressions for a particular app type. */
  var appType: js.UndefOr[AppContext] = js.native
  /** Matches impressions for a particular auction type. */
  var auctionType: js.UndefOr[AuctionContext] = js.native
  /**
    * Matches impressions coming from users &#42;or&#42; publishers in a specific
    * location.
    */
  var location: js.UndefOr[LocationContext] = js.native
  /** Matches impressions coming from a particular platform. */
  var platform: js.UndefOr[PlatformContext] = js.native
  /** Matches impressions for a particular security type. */
  var securityType: js.UndefOr[SecurityContext] = js.native
}

object ServingContext {
  @scala.inline
  def apply(): ServingContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServingContext]
  }
  @scala.inline
  implicit class ServingContextOps[Self <: ServingContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withAppType(value: AppContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appType")(js.undefined)
        ret
    }
    @scala.inline
    def withAuctionType(value: AuctionContext): Self = {
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
    def withLocation(value: LocationContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: PlatformContext): Self = {
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
    @scala.inline
    def withSecurityType(value: SecurityContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityType")(js.undefined)
        ret
    }
  }
  
}

