package typingsSlinky.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An enumeration listing the different states that a connection can have. */
@JSGlobal("connect.ConnectionStateType")
@js.native
object ConnectionStateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ConnectionStateType with String] = js.native
  
  /* "connected" */ val CONNECTED: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.CONNECTED with String = js.native
  
  /* "connecting" */ val CONNECTING: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.CONNECTING with String = js.native
  
  /* "disconnected" */ val DISCONNECTED: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.DISCONNECTED with String = js.native
  
  /* "hold" */ val HOLD: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.HOLD with String = js.native
  
  /* "init" */ val INIT: typingsSlinky.amazonConnectStreams.connect.ConnectionStateType.INIT with String = js.native
}
