package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gets a summary of active ads in an account.
  */
@js.native
trait SchemaAccountActiveAdSummary extends js.Object {
  /**
    * ID of the account.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Ads that have been activated for the account
    */
  var activeAds: js.UndefOr[String] = js.native
  /**
    * Maximum number of active ads allowed for the account.
    */
  var activeAdsLimitTier: js.UndefOr[String] = js.native
  /**
    * Ads that can be activated for the account.
    */
  var availableAds: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountActiveAdSummary&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccountActiveAdSummary {
  @scala.inline
  def apply(): SchemaAccountActiveAdSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountActiveAdSummary]
  }
  @scala.inline
  implicit class SchemaAccountActiveAdSummaryOps[Self <: SchemaAccountActiveAdSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveAds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveAds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAds")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveAdsLimitTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAdsLimitTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveAdsLimitTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAdsLimitTier")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableAds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableAds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableAds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableAds")(js.undefined)
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
  }
  
}

