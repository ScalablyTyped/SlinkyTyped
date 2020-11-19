package typingsSlinky.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An enumeration listing the different high-level states that a contact can have. */
@JSGlobal("connect.ContactStateType")
@js.native
object ContactStateType extends js.Object {
  
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
