package typingsSlinky.reactNotificationSystemRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NotificationShow = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.reactNotificationSystem.mod.Notification], 
    typingsSlinky.redux.mod.Action[js.Any]
  ]
  type Notifications = slinky.core.ReactComponentClass[typingsSlinky.reactNotificationSystemRedux.mod.NotificationsProps]
  type NotificationsReducer[A /* <: typingsSlinky.redux.mod.Action[_] */] = js.Function2[
    /* state */ typingsSlinky.reactNotificationSystemRedux.mod.NotificationsState, 
    /* action */ A, 
    typingsSlinky.reactNotificationSystemRedux.mod.NotificationsState
  ]
  type NotificationsState = js.Array[typingsSlinky.reactNotificationSystem.mod.Notification]
}
