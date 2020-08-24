package typingsSlinky.reactNotificationSystemRedux.mod

import typingsSlinky.reactNotificationSystem.mod.Notification
import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-notification-system-redux", "show")
@js.native
object show extends js.Object {
  def apply(): Action[_] = js.native
  def apply(opts: js.UndefOr[scala.Nothing], level: NotificationLevel): Action[_] = js.native
  def apply(opts: Notification): Action[_] = js.native
  def apply(opts: Notification, level: NotificationLevel): Action[_] = js.native
}

