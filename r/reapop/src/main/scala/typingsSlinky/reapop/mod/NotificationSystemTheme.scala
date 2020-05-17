package typingsSlinky.reapop.mod

import typingsSlinky.reapop.anon.ClassName
import typingsSlinky.reapop.anon.EnterTimeout
import typingsSlinky.reapop.anon.Main
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSystemTheme extends js.Object {
  var notificationClassName: js.UndefOr[typingsSlinky.reapop.anon.Button] = js.native
  var notificationsContainerClassName: js.UndefOr[Main] = js.native
  var notificationsContainerTransition: js.UndefOr[EnterTimeout] = js.native
  var notificationsSystem: js.UndefOr[ClassName] = js.native
  var smallScreenMin: js.UndefOr[Double] = js.native
}

object NotificationSystemTheme {
  @scala.inline
  def apply(): NotificationSystemTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationSystemTheme]
  }
  @scala.inline
  implicit class NotificationSystemThemeOps[Self <: NotificationSystemTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotificationClassName(value: typingsSlinky.reapop.anon.Button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationsContainerClassName(value: Main): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsContainerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationsContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsContainerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationsContainerTransition(value: EnterTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsContainerTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationsContainerTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsContainerTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationsSystem(value: ClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationsSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallScreenMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallScreenMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallScreenMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallScreenMin")(js.undefined)
        ret
    }
  }
  
}

