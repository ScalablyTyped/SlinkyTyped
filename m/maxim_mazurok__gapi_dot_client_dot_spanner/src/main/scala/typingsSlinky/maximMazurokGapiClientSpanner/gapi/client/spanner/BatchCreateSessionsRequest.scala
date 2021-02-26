package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateSessionsRequest extends StObject {
  
  /**
    * Required. The number of sessions to be created in this batch call. The API may return fewer than the requested number of sessions. If a specific number of sessions are desired, the
    * client can make additional calls to BatchCreateSessions (adjusting session_count as necessary).
    */
  var sessionCount: js.UndefOr[Double] = js.native
  
  /** Parameters to be applied to each created session. */
  var sessionTemplate: js.UndefOr[Session] = js.native
}
object BatchCreateSessionsRequest {
  
  @scala.inline
  def apply(): BatchCreateSessionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateSessionsRequest]
  }
  
  @scala.inline
  implicit class BatchCreateSessionsRequestMutableBuilder[Self <: BatchCreateSessionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionCount(value: Double): Self = StObject.set(x, "sessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionCountUndefined: Self = StObject.set(x, "sessionCount", js.undefined)
    
    @scala.inline
    def setSessionTemplate(value: Session): Self = StObject.set(x, "sessionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTemplateUndefined: Self = StObject.set(x, "sessionTemplate", js.undefined)
  }
}
