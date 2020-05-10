package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var advertiserId: js.UndefOr[String] = js.native
  var audienceAgeGroup: js.UndefOr[String] = js.native
  var audienceGender: js.UndefOr[String] = js.native
  var budget: js.UndefOr[String] = js.native
  var clientBillingCode: js.UndefOr[String] = js.native
  var clientName: js.UndefOr[String] = js.native
  var endDate: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  var name: js.UndefOr[String] = js.native
  var overview: js.UndefOr[String] = js.native
  var startDate: js.UndefOr[String] = js.native
  var subaccountId: js.UndefOr[String] = js.native
  var targetClicks: js.UndefOr[String] = js.native
  var targetConversions: js.UndefOr[String] = js.native
  var targetCpaNanos: js.UndefOr[String] = js.native
  var targetCpcNanos: js.UndefOr[String] = js.native
  var targetCpmActiveViewNanos: js.UndefOr[String] = js.native
  var targetCpmNanos: js.UndefOr[String] = js.native
  var targetImpressions: js.UndefOr[String] = js.native
}

object Project {
  @scala.inline
  def apply(): Project = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Project]
  }
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
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
    def withLastModifiedInfo(value: LastModifiedInfo): Self = {
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

