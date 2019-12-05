package typingsSlinky.amazonDashConnectDashStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SoftphoneErrorTypes extends js.Object

@JSGlobal("connect.SoftphoneErrorTypes")
@js.native
object SoftphoneErrorTypes extends js.Object {
  @js.native
  sealed trait ICE_COLLECTION_TIMEOUT extends SoftphoneErrorTypes
  
  @js.native
  sealed trait MICROPHONE_NOT_SHARED extends SoftphoneErrorTypes
  
  @js.native
  sealed trait OTHER extends SoftphoneErrorTypes
  
  @js.native
  sealed trait REALTIME_COMMUNICATION_ERROR extends SoftphoneErrorTypes
  
  @js.native
  sealed trait SIGNALLING_CONNECTION_FAILURE extends SoftphoneErrorTypes
  
  @js.native
  sealed trait SIGNALLING_HANDSHAKE_FAILURE extends SoftphoneErrorTypes
  
  @js.native
  sealed trait UNSUPPORTED_BROWSER extends SoftphoneErrorTypes
  
  @js.native
  sealed trait USER_BUSY_ERROR extends SoftphoneErrorTypes
  
  @js.native
  sealed trait WEBRTC_ERROR extends SoftphoneErrorTypes
  
  /* "ice_collection_timeout" */ val ICE_COLLECTION_TIMEOUT: typingsSlinky.amazonDashConnectDashStreams.connect.SoftphoneErrorTypes.ICE_COLLECTION_TIMEOUT with String = js.native
  /* "microphone_not_shared" */ val MICROPHONE_NOT_SHARED: typingsSlinky.amazonDashConnectDashStreams.connect.SoftphoneErrorTypes.MICROPHONE_NOT_SHARED with String = js.native
  /* "other" */ val OTHER: typingsSlinky.amazonDashConnectDashStreams.connect.SoftphoneErrorTypes.OTHER with String = js.native
  /* "realtime_communication_error" */ val REALTIME_COMMUNICATION_ERROR: typingsSlinky.amazonDashConnectDashStreams.connect.SoftphoneErrorTypes.REALTIME_COMMUNICATION_ERROR with String = js.native
  /* "signalling_connection_failure" */ val SIGNALLING_CONNECTION_FAILURE: typingsSlinky.amazonDashConnectDashStreams.connect.SoftphoneErrorTypes.SIGNALLING_CONNECTION_FAILURE with String = js.native
  /* "signalling_handshake_failure" */ val SIGNALLING_HANDSHAKE_FAILURE: typingsSlinky.amazonDashConnectDashStreams.connect.SoftphoneErrorTypes.SIGNALLING_HANDSHAKE_FAILURE with String = js.native
  /* "unsupported_browser" */ val UNSUPPORTED_BROWSER: typingsSlinky.amazonDashConnectDashStreams.connect.SoftphoneErrorTypes.UNSUPPORTED_BROWSER with String = js.native
  /* "user_busy_error" */ val USER_BUSY_ERROR: typingsSlinky.amazonDashConnectDashStreams.connect.SoftphoneErrorTypes.USER_BUSY_ERROR with String = js.native
  /* "webrtc_error" */ val WEBRTC_ERROR: typingsSlinky.amazonDashConnectDashStreams.connect.SoftphoneErrorTypes.WEBRTC_ERROR with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SoftphoneErrorTypes with String] = js.native
}

