package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The serving context for this restriction.
  */
@js.native
trait SchemaServingContext extends js.Object {
  /**
    * Matches all contexts.
    */
  var all: js.UndefOr[String] = js.native
  /**
    * Matches impressions for a particular app type.
    */
  var appType: js.UndefOr[SchemaAppContext] = js.native
  /**
    * Matches impressions for a particular auction type.
    */
  var auctionType: js.UndefOr[SchemaAuctionContext] = js.native
  /**
    * Matches impressions coming from users *or* publishers in a specific
    * location.
    */
  var location: js.UndefOr[SchemaLocationContext] = js.native
  /**
    * Matches impressions coming from a particular platform.
    */
  var platform: js.UndefOr[SchemaPlatformContext] = js.native
  /**
    * Matches impressions for a particular security type.
    */
  var securityType: js.UndefOr[SchemaSecurityContext] = js.native
}

object SchemaServingContext {
  @scala.inline
  def apply(): SchemaServingContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingContext]
  }
  @scala.inline
  implicit class SchemaServingContextOps[Self <: SchemaServingContext] (val x: Self) extends AnyVal {
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
    def withAppType(value: SchemaAppContext): Self = {
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
    def withAuctionType(value: SchemaAuctionContext): Self = {
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
    def withLocation(value: SchemaLocationContext): Self = {
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
    def withPlatform(value: SchemaPlatformContext): Self = {
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
    def withSecurityType(value: SchemaSecurityContext): Self = {
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

