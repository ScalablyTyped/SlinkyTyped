package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentAlertInfo extends js.Object {
  var alertType: AlertType = js.native
  var categoryName: String = js.native
  var countResetDate: String = js.native
  var databaseName: String = js.native
  var delayBetweenResponses: Double = js.native
  var eventDescriptionKeyword: String = js.native
  var eventSource: String = js.native
  var hasNotification: Double = js.native
  var id: Double = js.native
  var includeEventDescription: NotifyMethods = js.native
  var isEnabled: Boolean = js.native
  var jobId: String = js.native
  var jobName: String = js.native
  var lastOccurrenceDate: String = js.native
  var lastResponseDate: String = js.native
  var messageId: Double = js.native
  var name: String = js.native
  var notificationMessage: String = js.native
  var occurrenceCount: Double = js.native
  var performanceCondition: String = js.native
  var severity: Double = js.native
  var wmiEventNamespace: String = js.native
  var wmiEventQuery: String = js.native
}

object AgentAlertInfo {
  @scala.inline
  def apply(
    alertType: AlertType,
    categoryName: String,
    countResetDate: String,
    databaseName: String,
    delayBetweenResponses: Double,
    eventDescriptionKeyword: String,
    eventSource: String,
    hasNotification: Double,
    id: Double,
    includeEventDescription: NotifyMethods,
    isEnabled: Boolean,
    jobId: String,
    jobName: String,
    lastOccurrenceDate: String,
    lastResponseDate: String,
    messageId: Double,
    name: String,
    notificationMessage: String,
    occurrenceCount: Double,
    performanceCondition: String,
    severity: Double,
    wmiEventNamespace: String,
    wmiEventQuery: String
  ): AgentAlertInfo = {
    val __obj = js.Dynamic.literal(alertType = alertType.asInstanceOf[js.Any], categoryName = categoryName.asInstanceOf[js.Any], countResetDate = countResetDate.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], delayBetweenResponses = delayBetweenResponses.asInstanceOf[js.Any], eventDescriptionKeyword = eventDescriptionKeyword.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], hasNotification = hasNotification.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includeEventDescription = includeEventDescription.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], lastOccurrenceDate = lastOccurrenceDate.asInstanceOf[js.Any], lastResponseDate = lastResponseDate.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notificationMessage = notificationMessage.asInstanceOf[js.Any], occurrenceCount = occurrenceCount.asInstanceOf[js.Any], performanceCondition = performanceCondition.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], wmiEventNamespace = wmiEventNamespace.asInstanceOf[js.Any], wmiEventQuery = wmiEventQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentAlertInfo]
  }
  @scala.inline
  implicit class AgentAlertInfoOps[Self <: AgentAlertInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlertType(value: AlertType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountResetDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countResetDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayBetweenResponses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayBetweenResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventDescriptionKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDescriptionKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNotification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeEventDescription(value: NotifyMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEventDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastOccurrenceDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastOccurrenceDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastResponseDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResponseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccurrenceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformanceCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeverity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWmiEventNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wmiEventNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWmiEventQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wmiEventQuery")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

