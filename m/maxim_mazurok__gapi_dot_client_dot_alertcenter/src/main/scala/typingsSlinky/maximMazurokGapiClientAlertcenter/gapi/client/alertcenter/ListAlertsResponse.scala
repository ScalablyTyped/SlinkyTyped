package typingsSlinky.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAlertsResponse extends StObject {
  
  /** The list of alerts. */
  var alerts: js.UndefOr[js.Array[Alert]] = js.native
  
  /**
    * The token for the next page. If not empty, indicates that there may be more alerts that match the listing request; this value can be used in a subsequent ListAlertsRequest to get
    * alerts continuing from last result of the current list call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAlertsResponse {
  
  @scala.inline
  def apply(): ListAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlertsResponse]
  }
  
  @scala.inline
  implicit class ListAlertsResponseMutableBuilder[Self <: ListAlertsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlerts(value: js.Array[Alert]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
    
    @scala.inline
    def setAlertsVarargs(value: Alert*): Self = StObject.set(x, "alerts", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
