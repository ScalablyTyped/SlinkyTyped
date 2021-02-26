package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentAlertsResult extends ResultStatus {
  
  var alerts: js.Array[AgentAlertInfo] = js.native
}
object AgentAlertsResult {
  
  @scala.inline
  def apply(alerts: js.Array[AgentAlertInfo], errorMessage: String, success: Boolean): AgentAlertsResult = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentAlertsResult]
  }
  
  @scala.inline
  implicit class AgentAlertsResultMutableBuilder[Self <: AgentAlertsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlerts(value: js.Array[AgentAlertInfo]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertsVarargs(value: AgentAlertInfo*): Self = StObject.set(x, "alerts", js.Array(value :_*))
  }
}
