package typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typingsSlinky.onesignalCordovaPlugin.AnonKOSSettingsKeyAutoPrompt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OneSignalBuilder extends js.Object {
  def endInit(): Unit = js.native
  def handleNotificationOpened(callback: js.Function1[/* json */ OSNotificationOpenedResult, Unit]): OneSignalBuilder = js.native
  def handleNotificationReceived(callback: js.Function1[/* json */ OSNotification, Unit]): OneSignalBuilder = js.native
  def iOSSettings(settings: AnonKOSSettingsKeyAutoPrompt): OneSignalBuilder = js.native
  def inFocusDisplaying(displayOption: OSDisplayType): OneSignalBuilder = js.native
}

object OneSignalBuilder {
  @scala.inline
  def apply(
    endInit: () => Unit,
    handleNotificationOpened: js.Function1[/* json */ OSNotificationOpenedResult, Unit] => OneSignalBuilder,
    handleNotificationReceived: js.Function1[/* json */ OSNotification, Unit] => OneSignalBuilder,
    iOSSettings: AnonKOSSettingsKeyAutoPrompt => OneSignalBuilder,
    inFocusDisplaying: OSDisplayType => OneSignalBuilder
  ): OneSignalBuilder = {
    val __obj = js.Dynamic.literal(endInit = js.Any.fromFunction0(endInit), handleNotificationOpened = js.Any.fromFunction1(handleNotificationOpened), handleNotificationReceived = js.Any.fromFunction1(handleNotificationReceived), iOSSettings = js.Any.fromFunction1(iOSSettings), inFocusDisplaying = js.Any.fromFunction1(inFocusDisplaying))
    __obj.asInstanceOf[OneSignalBuilder]
  }
  @scala.inline
  implicit class OneSignalBuilderOps[Self <: OneSignalBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandleNotificationOpened(value: js.Function1[/* json */ OSNotificationOpenedResult, Unit] => OneSignalBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleNotificationOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleNotificationReceived(value: js.Function1[/* json */ OSNotification, Unit] => OneSignalBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleNotificationReceived")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIOSSettings(value: AnonKOSSettingsKeyAutoPrompt => OneSignalBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSSettings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInFocusDisplaying(value: OSDisplayType => OneSignalBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFocusDisplaying")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

