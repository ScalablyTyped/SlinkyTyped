package typingsSlinky.reactNativePushNotification.mod

import typingsSlinky.reactNativePushNotification.anon.Os
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotificationOptions extends js.Object {
  var onNotification: js.UndefOr[js.Function1[/* notification */ PushNotification, Unit]] = js.native
  var onRegister: js.UndefOr[js.Function1[/* token */ Os, Unit]] = js.native
  var permissions: js.UndefOr[PushNotificationPermissions] = js.native
  var popInitialNotification: js.UndefOr[Boolean] = js.native
  var requestPermissions: js.UndefOr[Boolean] = js.native
  var senderID: js.UndefOr[String] = js.native
}

object PushNotificationOptions {
  @scala.inline
  def apply(): PushNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationOptions]
  }
  @scala.inline
  implicit class PushNotificationOptionsOps[Self <: PushNotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnNotification(value: /* notification */ PushNotification => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotification")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRegister(value: /* token */ Os => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegister")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegister")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: PushNotificationPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withPopInitialNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popInitialNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopInitialNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popInitialNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderID")(js.undefined)
        ret
    }
  }
  
}

