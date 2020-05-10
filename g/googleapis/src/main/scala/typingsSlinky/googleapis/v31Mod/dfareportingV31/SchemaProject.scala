package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Planning project.
  */
@js.native
trait SchemaProject extends js.Object {
  /**
    * Account ID of this project.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this project.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Audience age group of this project.
    */
  var audienceAgeGroup: js.UndefOr[String] = js.native
  /**
    * Audience gender of this project.
    */
  var audienceGender: js.UndefOr[String] = js.native
  /**
    * Budget of this project in the currency specified by the current account.
    * The value stored in this field represents only the non-fractional amount.
    * For example, for USD, the smallest value that can be represented by this
    * field is 1 US dollar.
    */
  var budget: js.UndefOr[String] = js.native
  /**
    * Client billing code of this project.
    */
  var clientBillingCode: js.UndefOr[String] = js.native
  /**
    * Name of the project client.
    */
  var clientName: js.UndefOr[String] = js.native
  /**
    * End date of the project.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * ID of this project. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#project&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the most recent modification of this project.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Name of this project.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Overview of this project.
    */
  var overview: js.UndefOr[String] = js.native
  /**
    * Start date of the project.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this project.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Number of clicks that the advertiser is targeting.
    */
  var targetClicks: js.UndefOr[String] = js.native
  /**
    * Number of conversions that the advertiser is targeting.
    */
  var targetConversions: js.UndefOr[String] = js.native
  /**
    * CPA that the advertiser is targeting.
    */
  var targetCpaNanos: js.UndefOr[String] = js.native
  /**
    * CPC that the advertiser is targeting.
    */
  var targetCpcNanos: js.UndefOr[String] = js.native
  /**
    * vCPM from Active View that the advertiser is targeting.
    */
  var targetCpmActiveViewNanos: js.UndefOr[String] = js.native
  /**
    * CPM that the advertiser is targeting.
    */
  var targetCpmNanos: js.UndefOr[String] = js.native
  /**
    * Number of impressions that the advertiser is targeting.
    */
  var targetImpressions: js.UndefOr[String] = js.native
}

object SchemaProject {
  @scala.inline
  def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  @scala.inline
  implicit class SchemaProjectOps[Self <: SchemaProject] (val x: Self) extends AnyVal {
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
    def withAudienceAgeGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceAgeGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudienceAgeGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceAgeGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withAudienceGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceGender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudienceGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceGender")(js.undefined)
        ret
    }
    @scala.inline
    def withBudget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("budget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("budget")(js.undefined)
        ret
    }
    @scala.inline
    def withClientBillingCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientBillingCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientBillingCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientBillingCode")(js.undefined)
        ret
    }
    @scala.inline
    def withClientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
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
    def withLastModifiedInfo(value: SchemaLastModifiedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOverview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSubaccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubaccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetClicks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetClicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClicks")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetConversions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetConversions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetConversions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetConversions")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCpaNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCpaNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCpaNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCpaNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCpcNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCpcNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCpcNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCpcNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCpmActiveViewNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCpmActiveViewNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCpmActiveViewNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCpmActiveViewNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCpmNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCpmNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCpmNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCpmNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetImpressions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetImpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetImpressions")(js.undefined)
        ret
    }
  }
  
}

