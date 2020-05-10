package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofdisplaySource extends js.Object {
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
  val AuthenticationMethod: AnonPBC = js.native
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
  val ErrorType: AnonCAPABILITIESNEGOTIATIONERROR = js.native
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
  val SinkState: AnonCONNECTED = js.native
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
    AuthenticationMethod: AnonPBC,
    ErrorType: AnonCAPABILITIESNEGOTIATIONERROR,
    SinkState: AnonCONNECTED,
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
  implicit class TypeofdisplaySourceOps[Self <: TypeofdisplaySource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationMethod(value: AnonPBC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorType(value: AnonCAPABILITIESNEGOTIATIONERROR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSinkState(value: AnonCONNECTED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SinkState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAvailableSinks(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableSinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSessionErrorOccured(value: Event[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSessionErrorOccured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSessionTerminated(value: Event[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSessionTerminated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSinksUpdated(value: Event[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSinksUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestAuthentication(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartSession(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminateSession(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateSession")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

