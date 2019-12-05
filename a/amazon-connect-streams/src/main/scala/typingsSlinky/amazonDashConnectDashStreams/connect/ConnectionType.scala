package typingsSlinky.amazonDashConnectDashStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionType extends js.Object

@JSGlobal("connect.ConnectionType")
@js.native
object ConnectionType extends js.Object {
  @js.native
  sealed trait AGENT extends ConnectionType
  
  @js.native
  sealed trait INBOUND extends ConnectionType
  
  @js.native
  sealed trait MONITORING extends ConnectionType
  
  @js.native
  sealed trait OUTBOUND extends ConnectionType
  
  /* "agent" */ val AGENT: typingsSlinky.amazonDashConnectDashStreams.connect.ConnectionType.AGENT with String = js.native
  /* "inbound" */ val INBOUND: typingsSlinky.amazonDashConnectDashStreams.connect.ConnectionType.INBOUND with String = js.native
  /* "monitoring" */ val MONITORING: typingsSlinky.amazonDashConnectDashStreams.connect.ConnectionType.MONITORING with String = js.native
  /* "outbound" */ val OUTBOUND: typingsSlinky.amazonDashConnectDashStreams.connect.ConnectionType.OUTBOUND with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionType with String] = js.native
}

