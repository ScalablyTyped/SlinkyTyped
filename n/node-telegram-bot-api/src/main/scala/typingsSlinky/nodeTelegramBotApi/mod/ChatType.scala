package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.`private`
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.group
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.supergroup
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.channel
*/
trait ChatType extends js.Object

object ChatType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def channel: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.channel = this.cast("channel")
  @scala.inline
  def group: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.group = this.cast("group")
  @scala.inline
  def `private`: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.`private` = this.cast("private")
  @scala.inline
  def supergroup: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.supergroup = this.cast("supergroup")
}

