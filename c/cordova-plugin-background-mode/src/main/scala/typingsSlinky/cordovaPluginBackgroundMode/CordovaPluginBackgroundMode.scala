package typingsSlinky.cordovaPluginBackgroundMode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPluginBackgroundMode extends js.Object {
  /**
    * Configure the default background notification
    */
  def configure(item: ICordovaPluginBackgroundModeNotificationItem): Unit = js.native
  /**
    * The background mode can be disabled
    */
  def disable(): Unit = js.native
  /**
    * The background mode can be enabled
    */
  def enable(): Unit = js.native
  /**
    * Checks if the background mode is activated or not
    */
  def isActivated(): Boolean = js.native
  /**
    * Checks if the background mode is enabled or not
    */
  def isEnabled(): Boolean = js.native
  /**
    * Function to get notified when the background mode has been activated
    */
  def onactivate(): Unit = js.native
  /**
    * Function to get notified when the background mode has been deactivated
    */
  def ondeactivate(): Unit = js.native
  /**
    * Function to get notified when the background could not benn activated
    */
  def onfailure(callback: js.Function1[/* errorCode */ Double, Unit]): Unit = js.native
  /**
    * Customize default title, ticker and text for the notification
    */
  def setDefaults(item: ICordovaPluginBackgroundModeNotificationItem): Unit = js.native
}

object CordovaPluginBackgroundMode {
  @scala.inline
  def apply(
    configure: ICordovaPluginBackgroundModeNotificationItem => Unit,
    disable: () => Unit,
    enable: () => Unit,
    isActivated: () => Boolean,
    isEnabled: () => Boolean,
    onactivate: () => Unit,
    ondeactivate: () => Unit,
    onfailure: js.Function1[/* errorCode */ Double, Unit] => Unit,
    setDefaults: ICordovaPluginBackgroundModeNotificationItem => Unit
  ): CordovaPluginBackgroundMode = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isActivated = js.Any.fromFunction0(isActivated), isEnabled = js.Any.fromFunction0(isEnabled), onactivate = js.Any.fromFunction0(onactivate), ondeactivate = js.Any.fromFunction0(ondeactivate), onfailure = js.Any.fromFunction1(onfailure), setDefaults = js.Any.fromFunction1(setDefaults))
    __obj.asInstanceOf[CordovaPluginBackgroundMode]
  }
  @scala.inline
  implicit class CordovaPluginBackgroundModeOps[Self <: CordovaPluginBackgroundMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigure(value: ICordovaPluginBackgroundModeNotificationItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsActivated(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActivated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnactivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onactivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOndeactivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondeactivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnfailure(value: js.Function1[/* errorCode */ Double, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDefaults(value: ICordovaPluginBackgroundModeNotificationItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaults")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

