package typingsSlinky.jsforce.limitsInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitsInfo extends js.Object {
  var ConcurrentAsyncGetReportInstances: Limit = js.native
  var ConcurrentSyncReportRuns: Limit = js.native
  var DailyAnalyticsDataflowJobExecutions: Limit = js.native
  var DailyApiRequests: typingsSlinky.jsforce.limitsInfoMod.DailyApiRequests = js.native
  var DailyAsyncApexExecutions: Limit = js.native
  var DailyBulkApiRequests: DailyApiRequests = js.native
  var DailyDurableGenericStreamingApiEvents: Limit = js.native
  var DailyDurableStreamingApiEvents: Limit = js.native
  var DailyGenericStreamingApiEvents: DailyApiRequests = js.native
  var DailyStreamingApiEvents: DailyApiRequests = js.native
  var DailyWorkflowEmails: Limit = js.native
  var DataStorageMB: Limit = js.native
  var DurableStreamingApiConcurrentClients: Limit = js.native
  var FileStorageMB: Limit = js.native
  var HourlyAsyncReportRuns: Limit = js.native
  var HourlyDashboardRefreshes: Limit = js.native
  var HourlyDashboardResults: Limit = js.native
  var HourlyDashboardStatuses: Limit = js.native
  var HourlyODataCallout: Limit = js.native
  var HourlySyncReportRuns: Limit = js.native
  var HourlyTimeBasedWorkflow: Limit = js.native
  var MassEmail: Limit = js.native
  var MonthlyPlatformEvents: Limit = js.native
  var Package2VersionCreates: Limit = js.native
  var PermissionSets: typingsSlinky.jsforce.limitsInfoMod.PermissionSets = js.native
  var SingleEmail: Limit = js.native
  var StreamingApiConcurrentClients: Limit = js.native
}

object LimitsInfo {
  @scala.inline
  def apply(
    ConcurrentAsyncGetReportInstances: Limit,
    ConcurrentSyncReportRuns: Limit,
    DailyAnalyticsDataflowJobExecutions: Limit,
    DailyApiRequests: DailyApiRequests,
    DailyAsyncApexExecutions: Limit,
    DailyBulkApiRequests: DailyApiRequests,
    DailyDurableGenericStreamingApiEvents: Limit,
    DailyDurableStreamingApiEvents: Limit,
    DailyGenericStreamingApiEvents: DailyApiRequests,
    DailyStreamingApiEvents: DailyApiRequests,
    DailyWorkflowEmails: Limit,
    DataStorageMB: Limit,
    DurableStreamingApiConcurrentClients: Limit,
    FileStorageMB: Limit,
    HourlyAsyncReportRuns: Limit,
    HourlyDashboardRefreshes: Limit,
    HourlyDashboardResults: Limit,
    HourlyDashboardStatuses: Limit,
    HourlyODataCallout: Limit,
    HourlySyncReportRuns: Limit,
    HourlyTimeBasedWorkflow: Limit,
    MassEmail: Limit,
    MonthlyPlatformEvents: Limit,
    Package2VersionCreates: Limit,
    PermissionSets: PermissionSets,
    SingleEmail: Limit,
    StreamingApiConcurrentClients: Limit
  ): LimitsInfo = {
    val __obj = js.Dynamic.literal(ConcurrentAsyncGetReportInstances = ConcurrentAsyncGetReportInstances.asInstanceOf[js.Any], ConcurrentSyncReportRuns = ConcurrentSyncReportRuns.asInstanceOf[js.Any], DailyAnalyticsDataflowJobExecutions = DailyAnalyticsDataflowJobExecutions.asInstanceOf[js.Any], DailyApiRequests = DailyApiRequests.asInstanceOf[js.Any], DailyAsyncApexExecutions = DailyAsyncApexExecutions.asInstanceOf[js.Any], DailyBulkApiRequests = DailyBulkApiRequests.asInstanceOf[js.Any], DailyDurableGenericStreamingApiEvents = DailyDurableGenericStreamingApiEvents.asInstanceOf[js.Any], DailyDurableStreamingApiEvents = DailyDurableStreamingApiEvents.asInstanceOf[js.Any], DailyGenericStreamingApiEvents = DailyGenericStreamingApiEvents.asInstanceOf[js.Any], DailyStreamingApiEvents = DailyStreamingApiEvents.asInstanceOf[js.Any], DailyWorkflowEmails = DailyWorkflowEmails.asInstanceOf[js.Any], DataStorageMB = DataStorageMB.asInstanceOf[js.Any], DurableStreamingApiConcurrentClients = DurableStreamingApiConcurrentClients.asInstanceOf[js.Any], FileStorageMB = FileStorageMB.asInstanceOf[js.Any], HourlyAsyncReportRuns = HourlyAsyncReportRuns.asInstanceOf[js.Any], HourlyDashboardRefreshes = HourlyDashboardRefreshes.asInstanceOf[js.Any], HourlyDashboardResults = HourlyDashboardResults.asInstanceOf[js.Any], HourlyDashboardStatuses = HourlyDashboardStatuses.asInstanceOf[js.Any], HourlyODataCallout = HourlyODataCallout.asInstanceOf[js.Any], HourlySyncReportRuns = HourlySyncReportRuns.asInstanceOf[js.Any], HourlyTimeBasedWorkflow = HourlyTimeBasedWorkflow.asInstanceOf[js.Any], MassEmail = MassEmail.asInstanceOf[js.Any], MonthlyPlatformEvents = MonthlyPlatformEvents.asInstanceOf[js.Any], Package2VersionCreates = Package2VersionCreates.asInstanceOf[js.Any], PermissionSets = PermissionSets.asInstanceOf[js.Any], SingleEmail = SingleEmail.asInstanceOf[js.Any], StreamingApiConcurrentClients = StreamingApiConcurrentClients.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitsInfo]
  }
  @scala.inline
  implicit class LimitsInfoOps[Self <: LimitsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrentAsyncGetReportInstances(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConcurrentAsyncGetReportInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcurrentSyncReportRuns(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConcurrentSyncReportRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDailyAnalyticsDataflowJobExecutions(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyAnalyticsDataflowJobExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDailyApiRequests(value: DailyApiRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyApiRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDailyAsyncApexExecutions(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyAsyncApexExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDailyBulkApiRequests(value: DailyApiRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyBulkApiRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDailyDurableGenericStreamingApiEvents(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyDurableGenericStreamingApiEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDailyDurableStreamingApiEvents(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyDurableStreamingApiEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDailyGenericStreamingApiEvents(value: DailyApiRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyGenericStreamingApiEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDailyStreamingApiEvents(value: DailyApiRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyStreamingApiEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDailyWorkflowEmails(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyWorkflowEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataStorageMB(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataStorageMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurableStreamingApiConcurrentClients(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurableStreamingApiConcurrentClients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileStorageMB(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileStorageMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyAsyncReportRuns(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyAsyncReportRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyDashboardRefreshes(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyDashboardRefreshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyDashboardResults(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyDashboardResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyDashboardStatuses(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyDashboardStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyODataCallout(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyODataCallout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlySyncReportRuns(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlySyncReportRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyTimeBasedWorkflow(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyTimeBasedWorkflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMassEmail(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MassEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthlyPlatformEvents(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthlyPlatformEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackage2VersionCreates(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Package2VersionCreates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissionSets(value: PermissionSets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleEmail(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamingApiConcurrentClients(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamingApiConcurrentClients")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

