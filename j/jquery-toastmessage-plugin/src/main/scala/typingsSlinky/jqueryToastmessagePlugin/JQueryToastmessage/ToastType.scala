package typingsSlinky.jqueryToastmessagePlugin.JQueryToastmessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice
  - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning
  - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error
  - typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success
*/
trait ToastType extends js.Object

object ToastType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error = this.cast("error")
  @scala.inline
  def notice: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice = this.cast("notice")
  @scala.inline
  def success: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsSlinky.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning = this.cast("warning")
}

