package typingsSlinky.amazonDashConnectDashStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CONTACT_ACTIVE_STATES extends js.Object

@JSGlobal("connect.CONTACT_ACTIVE_STATES")
@js.native
object CONTACT_ACTIVE_STATES extends js.Object {
  @js.native
  sealed trait CONNECTED extends CONTACT_ACTIVE_STATES
  
  @js.native
  sealed trait CONNECTING extends CONTACT_ACTIVE_STATES
  
  @js.native
  sealed trait INCOMING extends CONTACT_ACTIVE_STATES
  
  /* "connected" */ val CONNECTED: typingsSlinky.amazonDashConnectDashStreams.connect.CONTACT_ACTIVE_STATES.CONNECTED with String = js.native
  /* "connecting" */ val CONNECTING: typingsSlinky.amazonDashConnectDashStreams.connect.CONTACT_ACTIVE_STATES.CONNECTING with String = js.native
  /* "incoming" */ val INCOMING: typingsSlinky.amazonDashConnectDashStreams.connect.CONTACT_ACTIVE_STATES.INCOMING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CONTACT_ACTIVE_STATES with String] = js.native
}

