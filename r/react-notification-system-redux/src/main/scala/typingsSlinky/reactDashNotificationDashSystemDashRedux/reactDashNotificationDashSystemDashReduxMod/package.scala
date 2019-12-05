package typingsSlinky.reactDashNotificationDashSystemDashRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNotificationDashSystemDashReduxMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod.Notification
  import typingsSlinky.redux.reduxMod.Action

  type NotificationShow = js.Function1[/* opts */ js.UndefOr[Notification], Action[js.Any]]
  type Notifications = ReactComponentClass[NotificationsProps]
  type NotificationsReducer[A /* <: Action[_] */] = js.Function2[/* state */ NotificationsState, /* action */ A, NotificationsState]
  type NotificationsState = js.Array[Notification]
}
