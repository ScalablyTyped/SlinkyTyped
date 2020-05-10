package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.AccountSummariesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.AccountUserLinksCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.AccountsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ClientIdCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.CustomDataSourcesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.CustomDimensionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.CustomMetricsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ExperimentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.FiltersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.GoalsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ProfileFilterLinksCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ProfileUserLinksCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ProfilesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.RemarketingAudienceCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.SegmentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.UnsampledReportsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.UploadsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.WebPropertyAdWordsLinksCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.WebpropertiesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.WebpropertyUserLinksCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagementCollection extends js.Object {
  var AccountSummaries: js.UndefOr[AccountSummariesCollection] = js.native
  var AccountUserLinks: js.UndefOr[AccountUserLinksCollection] = js.native
  var Accounts: js.UndefOr[AccountsCollection] = js.native
  var ClientId: js.UndefOr[ClientIdCollection] = js.native
  var CustomDataSources: js.UndefOr[CustomDataSourcesCollection] = js.native
  var CustomDimensions: js.UndefOr[CustomDimensionsCollection] = js.native
  var CustomMetrics: js.UndefOr[CustomMetricsCollection] = js.native
  var Experiments: js.UndefOr[ExperimentsCollection] = js.native
  var Filters: js.UndefOr[FiltersCollection] = js.native
  var Goals: js.UndefOr[GoalsCollection] = js.native
  var ProfileFilterLinks: js.UndefOr[ProfileFilterLinksCollection] = js.native
  var ProfileUserLinks: js.UndefOr[ProfileUserLinksCollection] = js.native
  var Profiles: js.UndefOr[ProfilesCollection] = js.native
  var RemarketingAudience: js.UndefOr[RemarketingAudienceCollection] = js.native
  var Segments: js.UndefOr[SegmentsCollection] = js.native
  var UnsampledReports: js.UndefOr[UnsampledReportsCollection] = js.native
  var Uploads: js.UndefOr[UploadsCollection] = js.native
  var WebPropertyAdWordsLinks: js.UndefOr[WebPropertyAdWordsLinksCollection] = js.native
  var Webproperties: js.UndefOr[WebpropertiesCollection] = js.native
  var WebpropertyUserLinks: js.UndefOr[WebpropertyUserLinksCollection] = js.native
}

object ManagementCollection {
  @scala.inline
  def apply(): ManagementCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagementCollection]
  }
  @scala.inline
  implicit class ManagementCollectionOps[Self <: ManagementCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountSummaries(value: AccountSummariesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountUserLinks(value: AccountUserLinksCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountUserLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountUserLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountUserLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withAccounts(value: AccountsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: ClientIdCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDataSources(value: CustomDataSourcesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDataSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDataSources")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDimensions(value: CustomDimensionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMetrics(value: CustomMetricsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withExperiments(value: ExperimentsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Experiments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperiments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Experiments")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: FiltersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGoals(value: GoalsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Goals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Goals")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileFilterLinks(value: ProfileFilterLinksCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileFilterLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileFilterLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileFilterLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileUserLinks(value: ProfileUserLinksCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileUserLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileUserLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileUserLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withProfiles(value: ProfilesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profiles")(js.undefined)
        ret
    }
    @scala.inline
    def withRemarketingAudience(value: RemarketingAudienceCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemarketingAudience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarketingAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemarketingAudience")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: SegmentsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Segments")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsampledReports(value: UnsampledReportsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsampledReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsampledReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsampledReports")(js.undefined)
        ret
    }
    @scala.inline
    def withUploads(value: UploadsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uploads")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyAdWordsLinks(value: WebPropertyAdWordsLinksCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebPropertyAdWordsLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyAdWordsLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebPropertyAdWordsLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withWebproperties(value: WebpropertiesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Webproperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebproperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Webproperties")(js.undefined)
        ret
    }
    @scala.inline
    def withWebpropertyUserLinks(value: WebpropertyUserLinksCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebpropertyUserLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebpropertyUserLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebpropertyUserLinks")(js.undefined)
        ret
    }
  }
  
}

