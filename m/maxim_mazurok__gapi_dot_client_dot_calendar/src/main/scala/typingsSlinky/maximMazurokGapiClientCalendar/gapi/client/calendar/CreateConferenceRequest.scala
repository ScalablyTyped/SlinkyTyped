package typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConferenceRequest extends StObject {
  
  /** The conference solution, such as Hangouts or Google Meet. */
  var conferenceSolutionKey: js.UndefOr[ConferenceSolutionKey] = js.native
  
  /**
    * The client-generated unique ID for this request.
    * Clients should regenerate this ID for every new request. If an ID provided is the same as for the previous request, the request is ignored.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /** The status of the conference create request. */
  var status: js.UndefOr[ConferenceRequestStatus] = js.native
}
object CreateConferenceRequest {
  
  @scala.inline
  def apply(): CreateConferenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConferenceRequest]
  }
  
  @scala.inline
  implicit class CreateConferenceRequestMutableBuilder[Self <: CreateConferenceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceSolutionKey(value: ConferenceSolutionKey): Self = StObject.set(x, "conferenceSolutionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceSolutionKeyUndefined: Self = StObject.set(x, "conferenceSolutionKey", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setStatus(value: ConferenceRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
