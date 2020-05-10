package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagementResource extends js.Object {
  var accountSummaries: AccountSummariesResource = js.native
  var accountUserLinks: AccountUserLinksResource = js.native
  var accounts: AccountsResource = js.native
  var customDataSources: CustomDataSourcesResource = js.native
  var customDimensions: CustomDimensionsResource = js.native
  var customMetrics: CustomMetricsResource = js.native
  var experiments: ExperimentsResource = js.native
  var filters: FiltersResource = js.native
  var goals: GoalsResource = js.native
  var profileFilterLinks: ProfileFilterLinksResource = js.native
  var profileUserLinks: ProfileUserLinksResource = js.native
  var profiles: ProfilesResource = js.native
  var remarketingAudience: RemarketingAudienceResource = js.native
  var segments: SegmentsResource = js.native
  var unsampledReports: UnsampledReportsResource = js.native
  var uploads: UploadsResource = js.native
  var webPropertyAdWordsLinks: WebPropertyAdWordsLinksResource = js.native
  var webproperties: WebpropertiesResource = js.native
  var webpropertyUserLinks: WebpropertyUserLinksResource = js.native
}

object ManagementResource {
  @scala.inline
  def apply(
    accountSummaries: AccountSummariesResource,
    accountUserLinks: AccountUserLinksResource,
    accounts: AccountsResource,
    customDataSources: CustomDataSourcesResource,
    customDimensions: CustomDimensionsResource,
    customMetrics: CustomMetricsResource,
    experiments: ExperimentsResource,
    filters: FiltersResource,
    goals: GoalsResource,
    profileFilterLinks: ProfileFilterLinksResource,
    profileUserLinks: ProfileUserLinksResource,
    profiles: ProfilesResource,
    remarketingAudience: RemarketingAudienceResource,
    segments: SegmentsResource,
    unsampledReports: UnsampledReportsResource,
    uploads: UploadsResource,
    webPropertyAdWordsLinks: WebPropertyAdWordsLinksResource,
    webproperties: WebpropertiesResource,
    webpropertyUserLinks: WebpropertyUserLinksResource
  ): ManagementResource = {
    val __obj = js.Dynamic.literal(accountSummaries = accountSummaries.asInstanceOf[js.Any], accountUserLinks = accountUserLinks.asInstanceOf[js.Any], accounts = accounts.asInstanceOf[js.Any], customDataSources = customDataSources.asInstanceOf[js.Any], customDimensions = customDimensions.asInstanceOf[js.Any], customMetrics = customMetrics.asInstanceOf[js.Any], experiments = experiments.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], goals = goals.asInstanceOf[js.Any], profileFilterLinks = profileFilterLinks.asInstanceOf[js.Any], profileUserLinks = profileUserLinks.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], remarketingAudience = remarketingAudience.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], unsampledReports = unsampledReports.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any], webPropertyAdWordsLinks = webPropertyAdWordsLinks.asInstanceOf[js.Any], webproperties = webproperties.asInstanceOf[js.Any], webpropertyUserLinks = webpropertyUserLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementResource]
  }
  @scala.inline
  implicit class ManagementResourceOps[Self <: ManagementResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountSummaries(value: AccountSummariesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountUserLinks(value: AccountUserLinksResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountUserLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccounts(value: AccountsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomDataSources(value: CustomDataSourcesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomDimensions(value: CustomDimensionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMetrics(value: CustomMetricsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExperiments(value: ExperimentsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experiments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: FiltersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoals(value: GoalsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileFilterLinks(value: ProfileFilterLinksResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileFilterLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileUserLinks(value: ProfileUserLinksResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileUserLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfiles(value: ProfilesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemarketingAudience(value: RemarketingAudienceResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingAudience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegments(value: SegmentsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsampledReports(value: UnsampledReportsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsampledReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploads(value: UploadsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebPropertyAdWordsLinks(value: WebPropertyAdWordsLinksResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyAdWordsLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebproperties(value: WebpropertiesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webproperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebpropertyUserLinks(value: WebpropertyUserLinksResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpropertyUserLinks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

