package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.openfinStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationOptions extends js.Object {
  /**
    * A boolean that will force dismissal even if the mouse is hovering over the notification
    */
  var ignoreMouseOver: js.UndefOr[Boolean] = js.native
  /**
    * A message of any primitive or composite-primitive type to be passed to the notification upon creation.
    */
  var message: js.UndefOr[js.Any] = js.native
  /**
    * A function that is called when a notification is clicked.
    */
  var onClick: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
  /**
    * Invoked when the notification is closed via .close() method on the created notification instance
    * or the by the notification itself via fin.desktop.Notification.getCurrent().close().
    * NOTE: this is not invoked when the notification is dismissed via a swipe. For the swipe dismissal callback see onDismiss
    */
  var onClose: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
  /**
    * Invoked when a the notification is dismissed by swiping it off the screen to the right. NOTE: this is no fired on a programmatic close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
  /**
    * A function that is called when an error occurs.The reason for the error is passed as an argument.
    */
  var onError: js.UndefOr[
    js.Function1[
      /* errorCallback */ js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * The onMessage function will respond to messages sent from notification.sendMessageToApplication.
    * The function is passed the message, which can be of any primitive or composite-primitive type.
    */
  var onMessage: js.UndefOr[js.Function1[/* callback */ js.Function1[/* message */ js.Any, Unit], Unit]] = js.native
  /**
    * A function that is called when a notification is shown.
    */
  var onShow: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* successObj */ SuccessObj, Unit], Unit]
  ] = js.native
  /**
    * The timeout for displaying a notification.Can be in milliseconds or "never".
    */
  var timeout: js.UndefOr[Double | never] = js.native
  /**
    * The url of the notification
    */
  var url: js.UndefOr[String] = js.native
}

object NotificationOptions {
  @scala.inline
  def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreMouseOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* callback */ js.Function0[Unit] => Unit): Self = {
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
    def withOnClose(value: /* callback */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: /* callback */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(
      value: /* errorCallback */ js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit] => Unit
    ): Self = {
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
    def withOnMessage(value: /* callback */ js.Function1[/* message */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* callback */ js.Function1[/* successObj */ SuccessObj, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double | never): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

