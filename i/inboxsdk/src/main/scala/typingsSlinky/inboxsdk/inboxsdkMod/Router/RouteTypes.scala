package typingsSlinky.inboxsdk.inboxsdkMod.Router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.inboxsdkStrings.LIST
  - typings.inboxsdk.inboxsdkStrings.THREAD
  - typings.inboxsdk.inboxsdkStrings.SETTINGS
  - typings.inboxsdk.inboxsdkStrings.CHAT
  - typings.inboxsdk.inboxsdkStrings.CUSTOM
  - typings.inboxsdk.inboxsdkStrings.UNKNOWN
*/
trait RouteTypes extends js.Object

object RouteTypes {
  @scala.inline
  def CHAT: typingsSlinky.inboxsdk.inboxsdkStrings.CHAT = this.cast("CHAT")
  @scala.inline
  def CUSTOM: typingsSlinky.inboxsdk.inboxsdkStrings.CUSTOM = this.cast("CUSTOM")
  @scala.inline
  def LIST: typingsSlinky.inboxsdk.inboxsdkStrings.LIST = this.cast("LIST")
  @scala.inline
  def SETTINGS: typingsSlinky.inboxsdk.inboxsdkStrings.SETTINGS = this.cast("SETTINGS")
  @scala.inline
  def THREAD: typingsSlinky.inboxsdk.inboxsdkStrings.THREAD = this.cast("THREAD")
  @scala.inline
  def UNKNOWN: typingsSlinky.inboxsdk.inboxsdkStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

