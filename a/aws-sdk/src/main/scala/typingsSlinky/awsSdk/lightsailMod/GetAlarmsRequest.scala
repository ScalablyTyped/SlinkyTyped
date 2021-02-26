package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAlarmsRequest extends StObject {
  
  /**
    * The name of the alarm. Specify an alarm name to return information about a specific alarm.
    */
  var alarmName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The name of the Lightsail resource being monitored by the alarm. Specify a monitored resource name to return information about all alarms for a specific resource.
    */
  var monitoredResourceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetAlarms request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object GetAlarmsRequest {
  
  @scala.inline
  def apply(): GetAlarmsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAlarmsRequest]
  }
  
  @scala.inline
  implicit class GetAlarmsRequestMutableBuilder[Self <: GetAlarmsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmName(value: ResourceName): Self = StObject.set(x, "alarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmNameUndefined: Self = StObject.set(x, "alarmName", js.undefined)
    
    @scala.inline
    def setMonitoredResourceName(value: ResourceName): Self = StObject.set(x, "monitoredResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredResourceNameUndefined: Self = StObject.set(x, "monitoredResourceName", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
