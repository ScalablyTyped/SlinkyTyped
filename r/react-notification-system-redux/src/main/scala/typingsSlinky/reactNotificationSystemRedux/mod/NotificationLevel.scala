package typingsSlinky.reactNotificationSystemRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error
  - typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning
  - typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info
  - typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success
*/
trait NotificationLevel extends js.Object

object NotificationLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info = this.cast("info")
  @scala.inline
  def success: typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsSlinky.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning = this.cast("warning")
}

