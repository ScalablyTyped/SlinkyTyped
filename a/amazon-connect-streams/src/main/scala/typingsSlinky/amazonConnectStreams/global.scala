package typingsSlinky.amazonConnectStreams

import typingsSlinky.amazonConnectStreams.connect.AgentCallback
import typingsSlinky.amazonConnectStreams.connect.ContactCallback
import typingsSlinky.amazonConnectStreams.connect.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object connect extends js.Object {
    @js.native
    class Endpoint ()
      extends typingsSlinky.amazonConnectStreams.connect.Endpoint
    
    var core: Core = js.native
    /**
      * Register a callback to receive agent details
      *
      * @param callback A callback that will receive an {Agent} instance
      *                 when agent information becomes available.
      */
    def agent(callback: AgentCallback): Unit = js.native
    /**
      * Register a callback to receive contact details
      *
      * @param callback A callback that will receive a Contact instance
      *                 when contact information is updated.
      */
    def contact(callback: ContactCallback): Unit = js.native
    /**
      * Binds the given instance object as the context for
      * the method provided.
      *
      * @param scope The instance object to be set as the scope
      *              of the function.
      * @param method The method to be encapsulated.
      *
      * All other arguments, if any, are bound to the method
      * invocation inside the closure.
      *
      * @return A closure encapsulating the invocation of the
      *    method provided in context of the given instance.
      */
    def hitch(scope: js.Object, method: js.Function0[_]): Unit = js.native
    @js.native
    object AgentAvailStates extends js.Object {
      /* "AfterCallWork" */ val AFTER_CALL_WORK: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.AFTER_CALL_WORK with String = js.native
      /* "Busy" */ val BUSY: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.BUSY with String = js.native
      /* "CallingCustomer" */ val CALLING_CUSTOMER: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.CALLING_CUSTOMER with String = js.native
      /* "Dialing" */ val DIALING: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.DIALING with String = js.native
      /* "Init" */ val INIT: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.INIT with String = js.native
      /* "Joining" */ val JOINING: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.JOINING with String = js.native
      /* "PendingAvailable" */ val PENDING_AVAILABLE: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.PENDING_AVAILABLE with String = js.native
      /* "PendingBusy" */ val PENDING_BUSY: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.PENDING_BUSY with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.AgentAvailStates with String] = js.native
    }
    
    @js.native
    object AgentErrorStates extends js.Object {
      /* "AgentHungUp" */ val AGENT_HUNG_UP: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.AGENT_HUNG_UP with String = js.native
      /* "BadAddressAgent" */ val BAD_ADDRESS_AGENT: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.BAD_ADDRESS_AGENT with String = js.native
      /* "BadAddressCustomer" */ val BAD_ADDRESS_CUSTOMER: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.BAD_ADDRESS_CUSTOMER with String = js.native
      /* "Default" */ val DEFAULT: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.DEFAULT with String = js.native
      /* "Error" */ val ERROR: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.ERROR with String = js.native
      /* "FailedConnectAgent" */ val FAILED_CONNECT_AGENT: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.FAILED_CONNECT_AGENT with String = js.native
      /* "FailedConnectCustomer" */ val FAILED_CONNECT_CUSTOMER: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.FAILED_CONNECT_CUSTOMER with String = js.native
      /* "LineEngagedAgent" */ val LINE_ENGAGED_AGENT: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.LINE_ENGAGED_AGENT with String = js.native
      /* "LineEngagedCustomer" */ val LINE_ENGAGED_CUSTOMER: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.LINE_ENGAGED_CUSTOMER with String = js.native
      /* "MissedCallAgent" */ val MISSED_CALL_AGENT: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.MISSED_CALL_AGENT with String = js.native
      /* "MissedCallCustomer" */ val MISSED_CALL_CUSTOMER: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.MISSED_CALL_CUSTOMER with String = js.native
      /* "MultipleCcpWindows" */ val MULTIPLE_CCP_WINDOWS: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.MULTIPLE_CCP_WINDOWS with String = js.native
      /* "RealtimeCommunicationError" */ val REALTIME_COMMUNICATION_ERROR: typingsSlinky.amazonConnectStreams.connect.AgentErrorStates.REALTIME_COMMUNICATION_ERROR with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.AgentErrorStates with String] = js.native
    }
    
    @js.native
    object AgentStateType extends js.Object {
      /* "init" */ val INIT: typingsSlinky.amazonConnectStreams.connect.AgentStateType.INIT with String = js.native
      /* "not_routable" */ val NOT_ROUTABLE: typingsSlinky.amazonConnectStreams.connect.AgentStateType.NOT_ROUTABLE with String = js.native
      /* "offline" */ val OFFLINE: typingsSlinky.amazonConnectStreams.connect.AgentStateType.OFFLINE with String = js.native
      /* "routable" */ val ROUTABLE: typingsSlinky.amazonConnectStreams.connect.AgentStateType.ROUTABLE with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.AgentStateType with String] = js.native
    }
    
    @js.native
    object CONTACT_ACTIVE_STATES extends js.Object {
      /* "connected" */ val CONNECTED: typingsSlinky.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.CONNECTED with String = js.native
      /* "connecting" */ val CONNECTING: typingsSlinky.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.CONNECTING with String = js.native
      /* "incoming" */ val INCOMING: typingsSlinky.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.INCOMING with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES with String] = js.native
    }
    
    @js.native
    object CTIExceptions extends js.Object {
      /* "AccessDeniedException" */ val ACCESS_DENIED_EXCEPTION: typingsSlinky.amazonConnectStreams.connect.CTIExceptions.ACCESS_DENIED_EXCEPTION with String = js.native
      /* "BadEndpointException" */ val BAD_ENDPOINT_EXCEPTION: typingsSlinky.amazonConnectStreams.connect.CTIExceptions.BAD_ENDPOINT_EXCEPTION with String = js.native
      /* "InvalidAgentARNException" */ val INVALID_AGENT_ARNEXCEPTION: typingsSlinky.amazonConnectStreams.connect.CTIExceptions.INVALID_AGENT_ARNEXCEPTION with String = js.native
      /* "InvalidConfigurationException" */ val INVALID_CONFIGURATION_EXCEPTION: typingsSlinky.amazonConnectStreams.connect.CTIExceptions.INVALID_CONFIGURATION_EXCEPTION with String = js.native
      /* "InvalidContactTypeException" */ val INVALID_CONTACT_TYPE_EXCEPTION: typingsSlinky.amazonConnectStreams.connect.CTIExceptions.INVALID_CONTACT_TYPE_EXCEPTION with String = js.native
      /* "InvalidStateException" */ val INVALID_STATE_EXCEPTION: typingsSlinky.amazonConnectStreams.connect.CTIExceptions.INVALID_STATE_EXCEPTION with String = js.native
      /* "PaginationException" */ val PAGINATION_EXCEPTION: typingsSlinky.amazonConnectStreams.connect.CTIExceptions.PAGINATION_EXCEPTION with String = js.native
      /* "RefreshTokenExpiredException" */ val REFRESH_TOKEN_EXPIRED_EXCEPTION: typingsSlinky.amazonConnectStreams.connect.CTIExceptions.REFRESH_TOKEN_EXPIRED_EXCEPTION with String = js.native
      /* "SendDataFailedException" */ val SEND_DATA_FAILED_EXCEPTION: typingsSlinky.amazonConnectStreams.connect.CTIExceptions.SEND_DATA_FAILED_EXCEPTION with String = js.native
      /* "UnauthorizedException" */ val UNAUTHORIZED_EXCEPTION: typingsSlinky.amazonConnectStreams.connect.CTIExceptions.UNAUTHORIZED_EXCEPTION with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.CTIExceptions with String] = js.native
    }
    
    @js.native
    object ConnectionStateType extends js.Object {
      /* "connected" */ val CONNECTED: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.CONNECTED with String = js.native
      /* "connecting" */ val CONNECTING: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.CONNECTING with String = js.native
      /* "disconnected" */ val DISCONNECTED: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.DISCONNECTED with String = js.native
      /* "hold" */ val HOLD: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.HOLD with String = js.native
      /* "init" */ val INIT: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.INIT with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ConnectionStateType with String] = js.native
    }
    
    @js.native
    object ConnectionType extends js.Object {
      /* "agent" */ val AGENT: typingsSlinky.amazonConnectStreams.connect.ConnectionType.AGENT with String = js.native
      /* "inbound" */ val INBOUND: typingsSlinky.amazonConnectStreams.connect.ConnectionType.INBOUND with String = js.native
      /* "monitoring" */ val MONITORING: typingsSlinky.amazonConnectStreams.connect.ConnectionType.MONITORING with String = js.native
      /* "outbound" */ val OUTBOUND: typingsSlinky.amazonConnectStreams.connect.ConnectionType.OUTBOUND with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ConnectionType with String] = js.native
    }
    
    @js.native
    object ContactStateType extends js.Object {
      /* "connected" */ val CONNECTED: typingsSlinky.amazonConnectStreams.connect.ContactStateType.CONNECTED with String = js.native
      /* "connecting" */ val CONNECTING: typingsSlinky.amazonConnectStreams.connect.ContactStateType.CONNECTING with String = js.native
      /* "ended" */ val ENDED: typingsSlinky.amazonConnectStreams.connect.ContactStateType.ENDED with String = js.native
      /* "error" */ val ERROR: typingsSlinky.amazonConnectStreams.connect.ContactStateType.ERROR with String = js.native
      /* "incoming" */ val INCOMING: typingsSlinky.amazonConnectStreams.connect.ContactStateType.INCOMING with String = js.native
      /* "init" */ val INIT: typingsSlinky.amazonConnectStreams.connect.ContactStateType.INIT with String = js.native
      /* "missed" */ val MISSED: typingsSlinky.amazonConnectStreams.connect.ContactStateType.MISSED with String = js.native
      /* "pending" */ val PENDING: typingsSlinky.amazonConnectStreams.connect.ContactStateType.PENDING with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ContactStateType with String] = js.native
    }
    
    @js.native
    object ContactType extends js.Object {
      /* "queue_callback" */ val QUEUE_CALLBACK: typingsSlinky.amazonConnectStreams.connect.ContactType.QUEUE_CALLBACK with String = js.native
      /* "voice" */ val VOICE: typingsSlinky.amazonConnectStreams.connect.ContactType.VOICE with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ContactType with String] = js.native
    }
    
    /* static members */
    @js.native
    object Endpoint extends js.Object {
      def byPhoneNumber(phoneNumber: String): typingsSlinky.amazonConnectStreams.connect.Endpoint = js.native
    }
    
    @js.native
    object EndpointType extends js.Object {
      /* "agent" */ val AGENT: typingsSlinky.amazonConnectStreams.connect.EndpointType.AGENT with String = js.native
      /* "phone_number" */ val PHONE_NUMBER: typingsSlinky.amazonConnectStreams.connect.EndpointType.PHONE_NUMBER with String = js.native
      /* "queue" */ val QUEUE: typingsSlinky.amazonConnectStreams.connect.EndpointType.QUEUE with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.EndpointType with String] = js.native
    }
    
    @js.native
    object SoftphoneCallType extends js.Object {
      /* "audio_only" */ val AUDIO_ONLY: typingsSlinky.amazonConnectStreams.connect.SoftphoneCallType.AUDIO_ONLY with String = js.native
      /* "audio_video" */ val AUDIO_VIDEO: typingsSlinky.amazonConnectStreams.connect.SoftphoneCallType.AUDIO_VIDEO with String = js.native
      /* "none" */ val NONE: typingsSlinky.amazonConnectStreams.connect.SoftphoneCallType.NONE with String = js.native
      /* "video_only" */ val VIDEO_ONLY: typingsSlinky.amazonConnectStreams.connect.SoftphoneCallType.VIDEO_ONLY with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.SoftphoneCallType with String] = js.native
    }
    
    @js.native
    object SoftphoneErrorTypes extends js.Object {
      /* "ice_collection_timeout" */ val ICE_COLLECTION_TIMEOUT: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.ICE_COLLECTION_TIMEOUT with String = js.native
      /* "microphone_not_shared" */ val MICROPHONE_NOT_SHARED: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.MICROPHONE_NOT_SHARED with String = js.native
      /* "other" */ val OTHER: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.OTHER with String = js.native
      /* "realtime_communication_error" */ val REALTIME_COMMUNICATION_ERROR: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.REALTIME_COMMUNICATION_ERROR with String = js.native
      /* "signalling_connection_failure" */ val SIGNALLING_CONNECTION_FAILURE: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.SIGNALLING_CONNECTION_FAILURE with String = js.native
      /* "signalling_handshake_failure" */ val SIGNALLING_HANDSHAKE_FAILURE: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.SIGNALLING_HANDSHAKE_FAILURE with String = js.native
      /* "unsupported_browser" */ val UNSUPPORTED_BROWSER: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.UNSUPPORTED_BROWSER with String = js.native
      /* "user_busy_error" */ val USER_BUSY_ERROR: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.USER_BUSY_ERROR with String = js.native
      /* "webrtc_error" */ val WEBRTC_ERROR: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.WEBRTC_ERROR with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes with String] = js.native
    }
    
  }
  
}

