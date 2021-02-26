package typingsSlinky.amazonConnectStreams

import typingsSlinky.amazonConnectStreams.connect.Agent
import typingsSlinky.amazonConnectStreams.connect.AgentCallback
import typingsSlinky.amazonConnectStreams.connect.Contact
import typingsSlinky.amazonConnectStreams.connect.ContactCallback
import typingsSlinky.amazonConnectStreams.connect.Core
import typingsSlinky.amazonConnectStreams.connect.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object connect {
    
    @JSGlobal("connect.AgentAvailStates")
    @js.native
    object AgentAvailStates extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.AgentAvailStates with String] = js.native
      
      /* "AfterCallWork" */ val AFTER_CALL_WORK: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.AFTER_CALL_WORK with String = js.native
      
      /* "Busy" */ val BUSY: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.BUSY with String = js.native
      
      /* "CallingCustomer" */ val CALLING_CUSTOMER: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.CALLING_CUSTOMER with String = js.native
      
      /* "Dialing" */ val DIALING: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.DIALING with String = js.native
      
      /* "Init" */ val INIT: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.INIT with String = js.native
      
      /* "Joining" */ val JOINING: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.JOINING with String = js.native
      
      /* "PendingAvailable" */ val PENDING_AVAILABLE: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.PENDING_AVAILABLE with String = js.native
      
      /* "PendingBusy" */ val PENDING_BUSY: typingsSlinky.amazonConnectStreams.connect.AgentAvailStates.PENDING_BUSY with String = js.native
    }
    
    @JSGlobal("connect.AgentErrorStates")
    @js.native
    object AgentErrorStates extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.AgentErrorStates with String] = js.native
      
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
    }
    
    /** This enumeration lists the different types of agent states. */
    @JSGlobal("connect.AgentStateType")
    @js.native
    object AgentStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.AgentStateType with String] = js.native
      
      /* "init" */ val INIT: typingsSlinky.amazonConnectStreams.connect.AgentStateType.INIT with String = js.native
      
      /* "not_routable" */ val NOT_ROUTABLE: typingsSlinky.amazonConnectStreams.connect.AgentStateType.NOT_ROUTABLE with String = js.native
      
      /* "offline" */ val OFFLINE: typingsSlinky.amazonConnectStreams.connect.AgentStateType.OFFLINE with String = js.native
      
      /* "routable" */ val ROUTABLE: typingsSlinky.amazonConnectStreams.connect.AgentStateType.ROUTABLE with String = js.native
    }
    
    /**
      * The Agent API provides event subscription methods and action methods which can be called on behalf of the agent.
      * There is only ever one agent per Streams instantiation and all contacts and actions are assumed to be taken on behalf of this one agent.
      */
    @JSGlobal("connect.Agent")
    @js.native
    class Agent_ () extends Agent
    
    /**
      * The Connection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these object or keep them as internal state.
      * If you need to, store the contactId and connectionId of the connection and make sure that the contact and connection still exist by fetching them in order from the Agent API object before calling methods on them.
      */
    @JSGlobal("connect.BaseConnection")
    @js.native
    class BaseConnection ()
      extends typingsSlinky.amazonConnectStreams.connect.BaseConnection
    
    @JSGlobal("connect.CONTACT_ACTIVE_STATES")
    @js.native
    object CONTACT_ACTIVE_STATES extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES with String] = js.native
      
      /* "connected" */ val CONNECTED: typingsSlinky.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.CONNECTED with String = js.native
      
      /* "connecting" */ val CONNECTING: typingsSlinky.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.CONNECTING with String = js.native
      
      /* "incoming" */ val INCOMING: typingsSlinky.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.INCOMING with String = js.native
      
      /* "pending" */ val PENDING: typingsSlinky.amazonConnectStreams.connect.CONTACT_ACTIVE_STATES.PENDING with String = js.native
    }
    
    @JSGlobal("connect.CTIExceptions")
    @js.native
    object CTIExceptions extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.CTIExceptions with String] = js.native
      
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
    }
    
    /** This enumeration lists the different types of contact channels. */
    @JSGlobal("connect.ChannelType")
    @js.native
    object ChannelType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ChannelType with String] = js.native
      
      /* "CHAT" */ val CHAT: typingsSlinky.amazonConnectStreams.connect.ChannelType.CHAT with String = js.native
      
      /* "VOICE" */ val VOICE: typingsSlinky.amazonConnectStreams.connect.ChannelType.VOICE with String = js.native
    }
    
    /**
      * The ChatConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular chat connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these object or keep them as internal state.
      * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
      */
    @JSGlobal("connect.ChatConnection")
    @js.native
    class ChatConnection ()
      extends typingsSlinky.amazonConnectStreams.connect.ChatConnection
    
    /** An enumeration listing the different states that a connection can have. */
    @JSGlobal("connect.ConnectionStateType")
    @js.native
    object ConnectionStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ConnectionStateType with String] = js.native
      
      /* "connected" */ val CONNECTED: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.CONNECTED with String = js.native
      
      /* "connecting" */ val CONNECTING: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.CONNECTING with String = js.native
      
      /* "disconnected" */ val DISCONNECTED: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.DISCONNECTED with String = js.native
      
      /* "hold" */ val HOLD: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.HOLD with String = js.native
      
      /* "init" */ val INIT: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.INIT with String = js.native
    }
    
    /** Lists the different types of connections. */
    @JSGlobal("connect.ConnectionType")
    @js.native
    object ConnectionType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ConnectionType with String] = js.native
      
      /* "agent" */ val AGENT: typingsSlinky.amazonConnectStreams.connect.ConnectionType.AGENT with String = js.native
      
      /* "inbound" */ val INBOUND: typingsSlinky.amazonConnectStreams.connect.ConnectionType.INBOUND with String = js.native
      
      /* "monitoring" */ val MONITORING: typingsSlinky.amazonConnectStreams.connect.ConnectionType.MONITORING with String = js.native
      
      /* "outbound" */ val OUTBOUND: typingsSlinky.amazonConnectStreams.connect.ConnectionType.OUTBOUND with String = js.native
    }
    
    @JSGlobal("connect.ContactEvents")
    @js.native
    object ContactEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ContactEvents with String] = js.native
      
      /* "accepted" */ val ACCEPTED: typingsSlinky.amazonConnectStreams.connect.ContactEvents.ACCEPTED with String = js.native
      
      /* "acw" */ val ACW: typingsSlinky.amazonConnectStreams.connect.ContactEvents.ACW with String = js.native
      
      /* "connected" */ val CONNECTED: typingsSlinky.amazonConnectStreams.connect.ContactEvents.CONNECTED with String = js.native
      
      /* "connecting" */ val CONNECTING: typingsSlinky.amazonConnectStreams.connect.ContactEvents.CONNECTING with String = js.native
      
      /* "destroyed" */ val DESTROYED: typingsSlinky.amazonConnectStreams.connect.ContactEvents.DESTROYED with String = js.native
      
      /* "ended" */ val ENDED: typingsSlinky.amazonConnectStreams.connect.ContactEvents.ENDED with String = js.native
      
      /* "error" */ val ERROR: typingsSlinky.amazonConnectStreams.connect.ContactEvents.ERROR with String = js.native
      
      /* "incoming" */ val INCOMING: typingsSlinky.amazonConnectStreams.connect.ContactEvents.INCOMING with String = js.native
      
      /* "init" */ val INIT: typingsSlinky.amazonConnectStreams.connect.ContactEvents.INIT with String = js.native
      
      /* "missed" */ val MISSED: typingsSlinky.amazonConnectStreams.connect.ContactEvents.MISSED with String = js.native
      
      /* "pending" */ val PENDING: typingsSlinky.amazonConnectStreams.connect.ContactEvents.PENDING with String = js.native
      
      /* "refresh" */ val REFRESH: typingsSlinky.amazonConnectStreams.connect.ContactEvents.REFRESH with String = js.native
      
      /* "view" */ val VIEW: typingsSlinky.amazonConnectStreams.connect.ContactEvents.VIEW with String = js.native
    }
    
    /** An enumeration listing the different high-level states that a contact can have. */
    @JSGlobal("connect.ContactStateType")
    @js.native
    object ContactStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ContactStateType with String] = js.native
      
      /* "connected" */ val CONNECTED: typingsSlinky.amazonConnectStreams.connect.ContactStateType.CONNECTED with String = js.native
      
      /* "connecting" */ val CONNECTING: typingsSlinky.amazonConnectStreams.connect.ContactStateType.CONNECTING with String = js.native
      
      /* "ended" */ val ENDED: typingsSlinky.amazonConnectStreams.connect.ContactStateType.ENDED with String = js.native
      
      /* "error" */ val ERROR: typingsSlinky.amazonConnectStreams.connect.ContactStateType.ERROR with String = js.native
      
      /* "incoming" */ val INCOMING: typingsSlinky.amazonConnectStreams.connect.ContactStateType.INCOMING with String = js.native
      
      /* "init" */ val INIT: typingsSlinky.amazonConnectStreams.connect.ContactStateType.INIT with String = js.native
      
      /* "missed" */ val MISSED: typingsSlinky.amazonConnectStreams.connect.ContactStateType.MISSED with String = js.native
      
      /* "pending" */ val PENDING: typingsSlinky.amazonConnectStreams.connect.ContactStateType.PENDING with String = js.native
    }
    
    /** This enumeration lists all of the contact types supported by Connect Streams. */
    @JSGlobal("connect.ContactType")
    @js.native
    object ContactType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ContactType with String] = js.native
      
      /* "chat" */ val CHAT: typingsSlinky.amazonConnectStreams.connect.ContactType.CHAT with String = js.native
      
      /* "queue_callback" */ val QUEUE_CALLBACK: typingsSlinky.amazonConnectStreams.connect.ContactType.QUEUE_CALLBACK with String = js.native
      
      /* "voice" */ val VOICE: typingsSlinky.amazonConnectStreams.connect.ContactType.VOICE with String = js.native
    }
    
    /**
      * The Contact API provides event subscription methods and action methods which can be called on behalf of a specific contact.
      * Contacts come and go and so should these API objects.
      * It is good practice not to persist these objects or keep them as internal state.
      * If you need to, store the `contactId` of the contact and make sure that the contact still exists by fetching it from the `Agent` API object before calling methods on it.
      */
    @JSGlobal("connect.Contact")
    @js.native
    class Contact_ () extends Contact
    
    @JSGlobal("connect.Endpoint")
    @js.native
    class Endpoint ()
      extends typingsSlinky.amazonConnectStreams.connect.Endpoint
    object Endpoint {
      
      /**
        * Creates an endpoint from a E.164 phone number.
        *
        * @param phoneNumber The E.164 endpoint phone number.
        */
      /* static member */
      @JSGlobal("connect.Endpoint.byPhoneNumber")
      @js.native
      def byPhoneNumber(phoneNumber: String): typingsSlinky.amazonConnectStreams.connect.Endpoint = js.native
    }
    
    /** This enumeration lists the different types of endpoints. */
    @JSGlobal("connect.EndpointType")
    @js.native
    object EndpointType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.EndpointType with String] = js.native
      
      /* "agent" */ val AGENT: typingsSlinky.amazonConnectStreams.connect.EndpointType.AGENT with String = js.native
      
      /* "phone_number" */ val PHONE_NUMBER: typingsSlinky.amazonConnectStreams.connect.EndpointType.PHONE_NUMBER with String = js.native
      
      /* "queue" */ val QUEUE: typingsSlinky.amazonConnectStreams.connect.EndpointType.QUEUE with String = js.native
    }
    
    @JSGlobal("connect.MediaType")
    @js.native
    object MediaType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.MediaType with String] = js.native
      
      /* "chat" */ val CHAT: typingsSlinky.amazonConnectStreams.connect.MediaType.CHAT with String = js.native
      
      /* "softphone" */ val SOFTPHONE: typingsSlinky.amazonConnectStreams.connect.MediaType.SOFTPHONE with String = js.native
    }
    
    @JSGlobal("connect.SoftphoneCallType")
    @js.native
    object SoftphoneCallType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.SoftphoneCallType with String] = js.native
      
      /* "audio_only" */ val AUDIO_ONLY: typingsSlinky.amazonConnectStreams.connect.SoftphoneCallType.AUDIO_ONLY with String = js.native
      
      /* "audio_video" */ val AUDIO_VIDEO: typingsSlinky.amazonConnectStreams.connect.SoftphoneCallType.AUDIO_VIDEO with String = js.native
      
      /* "none" */ val NONE: typingsSlinky.amazonConnectStreams.connect.SoftphoneCallType.NONE with String = js.native
      
      /* "video_only" */ val VIDEO_ONLY: typingsSlinky.amazonConnectStreams.connect.SoftphoneCallType.VIDEO_ONLY with String = js.native
    }
    
    @JSGlobal("connect.SoftphoneError")
    @js.native
    class SoftphoneError protected ()
      extends typingsSlinky.amazonConnectStreams.connect.SoftphoneError {
      def this(errorType: String, errorMessage: String, endPointUrl: String) = this()
    }
    
    @JSGlobal("connect.SoftphoneErrorTypes")
    @js.native
    object SoftphoneErrorTypes extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes with String] = js.native
      
      /* "ice_collection_timeout" */ val ICE_COLLECTION_TIMEOUT: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.ICE_COLLECTION_TIMEOUT with String = js.native
      
      /* "microphone_not_shared" */ val MICROPHONE_NOT_SHARED: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.MICROPHONE_NOT_SHARED with String = js.native
      
      /* "other" */ val OTHER: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.OTHER with String = js.native
      
      /* "realtime_communication_error" */ val REALTIME_COMMUNICATION_ERROR: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.REALTIME_COMMUNICATION_ERROR with String = js.native
      
      /* "signalling_connection_failure" */ val SIGNALLING_CONNECTION_FAILURE: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.SIGNALLING_CONNECTION_FAILURE with String = js.native
      
      /* "signalling_handshake_failure" */ val SIGNALLING_HANDSHAKE_FAILURE: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.SIGNALLING_HANDSHAKE_FAILURE with String = js.native
      
      /* "unsupported_browser" */ val UNSUPPORTED_BROWSER: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.UNSUPPORTED_BROWSER with String = js.native
      
      /* "user_busy_error" */ val USER_BUSY_ERROR: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.USER_BUSY_ERROR with String = js.native
      
      /* "webrtc_error" */ val WEBRTC_ERROR: typingsSlinky.amazonConnectStreams.connect.SoftphoneErrorTypes.WEBRTC_ERROR with String = js.native
    }
    
    /**
      * The VoiceConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular voice connection within a contact.
      * Like contacts, connections come and go.
      * It is good practice not to persist these object or keep them as internal state.
      * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
      */
    @JSGlobal("connect.VoiceConnection")
    @js.native
    class VoiceConnection ()
      extends typingsSlinky.amazonConnectStreams.connect.VoiceConnection
    
    /**
      * Subscribe a method to be called when the agent is initialized.
      * If the agent has already been initalized, the call is synchronous and the callback is invoked immediately.
      * Otherwise, the callback is invoked once the first agent data is received from upstream.
      * This callback is provided with an `Agent` API object, which can also be created at any time after initialization is complete via `new connect.Agent()`.
      *
      * @param callback A callback that will receive an `Agent` API object instance.
      */
    @JSGlobal("connect.agent")
    @js.native
    def agent(callback: AgentCallback): Unit = js.native
    
    /**
      * Subscribe a method to be called for each newly detected agent contact.
      * Note that this function is not only for incoming contacts, but for contacts which already existed when Streams was initialized, such as from a previous agent session.
      * This callback is provided with a `Contact` API object for this contact. `Contact` API objects can also be listed from the `Agent` API by calling `agent.getContacts()`.
      *
      * @param callback A callback that will receive an `Contact` API object instance.
      */
    @JSGlobal("connect.contact")
    @js.native
    def contact(callback: ContactCallback): Unit = js.native
    
    @JSGlobal("connect.core")
    @js.native
    val core: Core = js.native
    
    /** Gets the global logger instance. */
    @JSGlobal("connect.getLog")
    @js.native
    def getLog(): Logger = js.native
    
    /**
      * A useful utility function for creating callback closures that bind a function to an object instance.
      *
      * @param scope The instance object to be set as the scope of the function.
      * @param method The method to be encapsulated.
      */
    @JSGlobal("connect.hitch")
    @js.native
    def hitch[T /* <: js.Function1[/* repeated */ js.Any, _] */](scope: js.Object, method: T): T = js.native
  }
}
