package typingsSlinky.gapiClientDoubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdGroupId extends js.Object {
  /** DS ad group ID. */
  var adGroupId: js.UndefOr[String] = js.native
  /** DS ad ID. */
  var adId: js.UndefOr[String] = js.native
  /** DS advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.native
  /** DS agency ID. */
  var agencyId: js.UndefOr[String] = js.native
  /** DS campaign ID. */
  var campaignId: js.UndefOr[String] = js.native
  /** DS engine account ID. */
  var engineAccountId: js.UndefOr[String] = js.native
  /** DS keyword ID. */
  var keywordId: js.UndefOr[String] = js.native
}

object AnonAdGroupId {
  @scala.inline
  def apply(): AnonAdGroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdGroupId]
  }
  @scala.inline
  implicit class AnonAdGroupIdOps[Self <: AnonAdGroupId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(js.undefined)
        ret
    }
    @scala.inline
    def withAgencyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agencyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgencyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agencyId")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaignId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignId")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywordId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywordId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywordId")(js.undefined)
        ret
    }
  }
  
}

