package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.creator
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.administrator
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.member
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.restricted
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.left
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.kicked
*/
trait ChatMemberStatus extends js.Object

object ChatMemberStatus {
  @scala.inline
  def administrator: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.administrator = this.cast("administrator")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def creator: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.creator = this.cast("creator")
  @scala.inline
  def kicked: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.kicked = this.cast("kicked")
  @scala.inline
  def left: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.left = this.cast("left")
  @scala.inline
  def member: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.member = this.cast("member")
  @scala.inline
  def restricted: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.restricted = this.cast("restricted")
}

