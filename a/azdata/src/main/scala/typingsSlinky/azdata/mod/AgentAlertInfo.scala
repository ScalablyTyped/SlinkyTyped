package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlertType(value: AlertType): Self = this.set("alertType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryName(value: String): Self = this.set("categoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountResetDate(value: String): Self = this.set("countResetDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayBetweenResponses(value: Double): Self = this.set("delayBetweenResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDescriptionKeyword(value: String): Self = this.set("eventDescriptionKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSource(value: String): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNotification(value: Double): Self = this.set("hasNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEventDescription(value: NotifyMethods): Self = this.set("includeEventDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastOccurrenceDate(value: String): Self = this.set("lastOccurrenceDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastResponseDate(value: String): Self = this.set("lastResponseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: Double): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationMessage(value: String): Self = this.set("notificationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceCount(value: Double): Self = this.set("occurrenceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceCondition(value: String): Self = this.set("performanceCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: Double): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWmiEventNamespace(value: String): Self = this.set("wmiEventNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWmiEventQuery(value: String): Self = this.set("wmiEventQuery", value.asInstanceOf[js.Any])
  }
}
