package typingsSlinky.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularUiNotification.angularUiNotificationStrings.primary
  - typingsSlinky.angularUiNotification.angularUiNotificationStrings.info
  - typingsSlinky.angularUiNotification.angularUiNotificationStrings.success
  - typingsSlinky.angularUiNotification.angularUiNotificationStrings.warning
  - typingsSlinky.angularUiNotification.angularUiNotificationStrings.error
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.angularUiNotification.angularUiNotificationStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.angularUiNotification.angularUiNotificationStrings.info = this.cast("info")
  @scala.inline
  def primary: typingsSlinky.angularUiNotification.angularUiNotificationStrings.primary = this.cast("primary")
  @scala.inline
  def success: typingsSlinky.angularUiNotification.angularUiNotificationStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsSlinky.angularUiNotification.angularUiNotificationStrings.warning = this.cast("warning")
}

