package typingsSlinky.angularDesktopNotification.mod.angularAugmentingMod.desktopNotification

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.std.EventListener
import typingsSlinky.std.Event_
import typingsSlinky.std.NotificationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options available during show notification according to https://developer.mozilla.org/en-US/docs/Web/API/notification
  */
@js.native
trait AugmentedNotificationOptions extends NotificationOptions {
  /**
    * The onclick property of the Notification interface specifies an event listener to receive click events.
    * These events occur when the user clicks on a displayed Notification.
    *
    * The default behavior is to move the focus to the viewport of the notification's related browsing context.
    * If you don't want that behaviour, call preventDefault() on the event object.
    */
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * The onerror property of the Notification interface specifies an event listener to receive error events.
    * These events occur when something goes wrong with a Notification (in many cases an error preventing the notification from being displayed.)
    *
    * A function which serves as the event handler for the error event. When an error occurs, the specified function will be called.
    * If null, no error handler is in effect.
    */
  var onError: js.UndefOr[EventListener] = js.native
  /**
    * The title read-only property of the Notification interface indicates the title of the notification, as specified in the title parameter
    * of the Notification() constructor.
    *
    * Note: This feature is available in Web Workers.
    * Ref: https://developer.mozilla.org/en-US/docs/Web/API/Notification/title
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The vibrate read-only property of the Notification interface specifies a a vibration pattern for the device's vibration hardware to emit
    * when the notification fires. This is specified in the vibrate option of the Notification() constructor.
    *
    * Note: This property is not currently supported in any browser.
    * Ref: https://developer.mozilla.org/en-US/docs/Web/API/Notification/vibrate
    */
  @JSName("vibrate")
  var vibrate_AugmentedNotificationOptions: js.UndefOr[js.Any] = js.native
}

object AugmentedNotificationOptions {
  @scala.inline
  def apply(): AugmentedNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AugmentedNotificationOptions]
  }
  @scala.inline
  implicit class AugmentedNotificationOptionsOps[Self <: AugmentedNotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* evt */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVibrate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVibrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrate")(js.undefined)
        ret
    }
  }
  
}

