package typingsSlinky.ngtoaster.mod

import typingsSlinky.std.EventListener
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToast extends js.Object {
  var body: js.UndefOr[String] = js.native
  var bodyOutputType: js.UndefOr[String] = js.native
  var clickHandler: js.UndefOr[EventListener] = js.native
  var closeHtml: js.UndefOr[String] = js.native
  var directiveData: js.UndefOr[js.Any] = js.native
  /**
    * Called when the toast has been removed.
    * @param toast the displayed toast
    */
  var onHideCallback: js.UndefOr[IToastCallback] = js.native
  /**
    * Called when the toast has been displayed.
    * @param toast the displayed toast
    */
  var onShowCallback: js.UndefOr[IToastCallback] = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var tapToDismiss: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var toastId: js.UndefOr[String | Double] = js.native
  /**
    * Acceptable types are:
    * 'error', 'info', 'wait', 'success', and 'warning'
    */
  var `type`: js.UndefOr[String] = js.native
}

object IToast {
  @scala.inline
  def apply(): IToast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToast]
  }
  @scala.inline
  implicit class IToastOps[Self <: IToast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyOutputType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyOutputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyOutputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyOutputType")(js.undefined)
        ret
    }
    @scala.inline
    def withClickHandler(value: /* evt */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClickHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectiveData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directiveData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectiveData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directiveData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHideCallback(value: /* toast */ IToast => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHideCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowCallback(value: /* toast */ IToast => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShowCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTapToDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapToDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapToDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapToDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
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
    def withToastId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToastId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

