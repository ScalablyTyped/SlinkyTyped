package typingsSlinky.reapop.mod

import typingsSlinky.reapop.anon.Payload
import typingsSlinky.reapop.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Action creators
@js.native
trait Actions_ extends js.Object {
  def addNotification(notification: Notification): Notification = js.native
  def removeNotification(notification: Notification): Payload = js.native
  def removeNotifications(): Type = js.native
  def updateNotification(notification: Notification): Notification = js.native
}

object Actions_ {
  @scala.inline
  def apply(
    addNotification: Notification => Notification,
    removeNotification: Notification => Payload,
    removeNotifications: () => Type,
    updateNotification: Notification => Notification
  ): Actions_ = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), removeNotification = js.Any.fromFunction1(removeNotification), removeNotifications = js.Any.fromFunction0(removeNotifications), updateNotification = js.Any.fromFunction1(updateNotification))
    __obj.asInstanceOf[Actions_]
  }
  @scala.inline
  implicit class Actions_Ops[Self <: Actions_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNotification(value: Notification => Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNotification")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveNotification(value: Notification => Payload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNotification")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveNotifications(value: () => Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNotifications")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateNotification(value: Notification => Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateNotification")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

