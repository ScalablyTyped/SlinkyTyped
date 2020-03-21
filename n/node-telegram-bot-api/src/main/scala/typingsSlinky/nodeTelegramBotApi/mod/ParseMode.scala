package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.Markdown
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.MarkdownV2
  - typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.HTML
*/
trait ParseMode extends js.Object

object ParseMode {
  @scala.inline
  def HTML: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.HTML = this.cast("HTML")
  @scala.inline
  def Markdown: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.Markdown = this.cast("Markdown")
  @scala.inline
  def MarkdownV2: typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.MarkdownV2 = this.cast("MarkdownV2")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

