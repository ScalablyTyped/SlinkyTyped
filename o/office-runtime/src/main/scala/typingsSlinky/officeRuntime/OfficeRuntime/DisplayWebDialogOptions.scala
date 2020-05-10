package typingsSlinky.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides display options and actions a dialog box may take. */
@js.native
trait DisplayWebDialogOptions extends js.Object {
  /**
    * Optional parameter that determines whether the dialog box displays as a popup (false) or within an IFrame (true).
    * This setting is only applicable to custom functions running on Excel Online.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var displayInIFrame: js.UndefOr[Boolean] = js.native
  /**
    * Optional parameter that defines the height of the dialog box as a percentage of the current display.
    * For example, accepts strings such as: '50%', '50'.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var height: js.UndefOr[String] = js.native
  /**
    * Optional callback that runs when the dialog box is closed.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional callback that runs when the dialog box sends a message to its parent.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var onMessage: js.UndefOr[js.Function2[/* message */ String, /* dialog */ js.UndefOr[Dialog], Unit]] = js.native
  /**
    * Optional callback that runs when the dialog box sends an error.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var onRuntimeError: js.UndefOr[js.Function2[/* error */ js.Error, /* dialog */ js.UndefOr[Dialog], Unit]] = js.native
  /**
    * Optional parameter that defines the width of dialog as a percentage of window.
    * For example, accepts strings such as: '50%', '50'.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var width: js.UndefOr[String] = js.native
}

object DisplayWebDialogOptions {
  @scala.inline
  def apply(): DisplayWebDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayWebDialogOptions]
  }
  @scala.inline
  implicit class DisplayWebDialogOptionsOps[Self <: DisplayWebDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayInIFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInIFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayInIFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInIFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessage(value: (/* message */ String, /* dialog */ js.UndefOr[Dialog]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRuntimeError(value: (/* error */ js.Error, /* dialog */ js.UndefOr[Dialog]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRuntimeError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRuntimeError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRuntimeError")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

