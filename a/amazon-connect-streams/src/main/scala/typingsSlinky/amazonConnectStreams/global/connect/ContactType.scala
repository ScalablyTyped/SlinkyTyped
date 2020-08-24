package typingsSlinky.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumeration lists all of the contact types supported by Connect Streams. */
@JSGlobal("connect.ContactType")
@js.native
object ContactType extends js.Object {
  /* "chat" */ val CHAT: typingsSlinky.amazonConnectStreams.connect.ContactType.CHAT with String = js.native
  /* "queue_callback" */ val QUEUE_CALLBACK: typingsSlinky.amazonConnectStreams.connect.ContactType.QUEUE_CALLBACK with String = js.native
  /* "voice" */ val VOICE: typingsSlinky.amazonConnectStreams.connect.ContactType.VOICE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.amazonConnectStreams.connect.ContactType with String] = js.native
}

