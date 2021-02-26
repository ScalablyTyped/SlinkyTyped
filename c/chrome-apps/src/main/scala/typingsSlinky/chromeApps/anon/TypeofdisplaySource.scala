package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdisplaySource extends StObject {
  
  /**
    * @enum
    * @description
    *
    * **'PBC'**
    * Push Button Config authentication method.
    *
    * **'PIN'**
    * PIN authentication method.
    */
  val AuthenticationMethod: PBC = js.native
  
  /**
    * @enum
    * @description
    * **'connection_error'**
    * The connection with sink cannot be established or has dropped unexpectedly.
    *
    * **'capabilities_negotiation_error'**
    * The capabilities of this Display Source and the connected
    * sink do not fit (e.g. the sink cannot play the media content of
    * the formats given by the source).
    *
    * **'media_pipeline_error'**
    * There was an error in media pipeline: while encoding, packetizing or
    * sending the media content.
    *
    * **'timeout_error'**
    * The sink became unresponsive.
    *
    * **'unknown_error'**
    * Unspecified error.
    */
  val ErrorType: CAPABILITIESNEGOTIATIONERROR = js.native
  
  /**
    * @enum
    * @description
    * **'connected'**
    * Connected using this Display Source (i.e., there is an active session)
    *
    * **'connecting'**
    * In process of connection to this Display Source
    *
    * **'disconnected'**
    * Disconnected from this Display Source
    */
  val SinkState: CONNECTED = js.native
  
  val getAvailableSinks: js.Function = js.native
  
  val onSessionErrorOccured: Event[_] = js.native
  
  val onSessionTerminated: Event[_] = js.native
  
  val onSinksUpdated: Event[_] = js.native
  
  val requestAuthentication: js.Function = js.native
  
  val startSession: js.Function = js.native
  
  val terminateSession: js.Function = js.native
}
object TypeofdisplaySource {
  
  @scala.inline
  def apply(
    AuthenticationMethod: PBC,
    ErrorType: CAPABILITIESNEGOTIATIONERROR,
    SinkState: CONNECTED,
    getAvailableSinks: js.Function,
    onSessionErrorOccured: Event[_],
    onSessionTerminated: Event[_],
    onSinksUpdated: Event[_],
    requestAuthentication: js.Function,
    startSession: js.Function,
    terminateSession: js.Function
  ): TypeofdisplaySource = {
    val __obj = js.Dynamic.literal(AuthenticationMethod = AuthenticationMethod.asInstanceOf[js.Any], ErrorType = ErrorType.asInstanceOf[js.Any], SinkState = SinkState.asInstanceOf[js.Any], getAvailableSinks = getAvailableSinks.asInstanceOf[js.Any], onSessionErrorOccured = onSessionErrorOccured.asInstanceOf[js.Any], onSessionTerminated = onSessionTerminated.asInstanceOf[js.Any], onSinksUpdated = onSinksUpdated.asInstanceOf[js.Any], requestAuthentication = requestAuthentication.asInstanceOf[js.Any], startSession = startSession.asInstanceOf[js.Any], terminateSession = terminateSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdisplaySource]
  }
  
  @scala.inline
  implicit class TypeofdisplaySourceMutableBuilder[Self <: TypeofdisplaySource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationMethod(value: PBC): Self = StObject.set(x, "AuthenticationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorType(value: CAPABILITIESNEGOTIATIONERROR): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAvailableSinks(value: js.Function): Self = StObject.set(x, "getAvailableSinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSessionErrorOccured(value: Event[_]): Self = StObject.set(x, "onSessionErrorOccured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSessionTerminated(value: Event[_]): Self = StObject.set(x, "onSessionTerminated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSinksUpdated(value: Event[_]): Self = StObject.set(x, "onSinksUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAuthentication(value: js.Function): Self = StObject.set(x, "requestAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinkState(value: CONNECTED): Self = StObject.set(x, "SinkState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSession(value: js.Function): Self = StObject.set(x, "startSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateSession(value: js.Function): Self = StObject.set(x, "terminateSession", value.asInstanceOf[js.Any])
  }
}
