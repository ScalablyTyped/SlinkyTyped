package typingsSlinky.angularToastr.mod.angularAugmentingMod.toastr

import typingsSlinky.angularToastr.AnonProgressbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastBaseConfig extends js.Object {
  var allowHtml: js.UndefOr[Boolean] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var closeHtml: js.UndefOr[String] = js.native
  var extendedTimeOut: js.UndefOr[Double] = js.native
  var extraData: js.UndefOr[js.Any] = js.native
  var messageClass: js.UndefOr[String] = js.native
  var onHidden: js.UndefOr[js.Function2[/* wasClicked */ Boolean, /* toast */ IToast, Unit]] = js.native
  var onShown: js.UndefOr[js.Function1[/* toast */ IToast, Unit]] = js.native
  var onTap: js.UndefOr[js.Function1[/* toast */ IToast, Unit]] = js.native
  var progressBar: js.UndefOr[Boolean] = js.native
  var tapToDismiss: js.UndefOr[Boolean] = js.native
  var templates: js.UndefOr[AnonProgressbar] = js.native
  var timeOut: js.UndefOr[Double] = js.native
  var titleClass: js.UndefOr[String] = js.native
  var toastClass: js.UndefOr[String] = js.native
}

object IToastBaseConfig {
  @scala.inline
  def apply(): IToastBaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToastBaseConfig]
  }
  @scala.inline
  implicit class IToastBaseConfigOps[Self <: IToastBaseConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(js.undefined)
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
    def withExtendedTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedTimeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedTimeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHidden(value: (/* wasClicked */ Boolean, /* toast */ IToast) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShown(value: /* toast */ IToast => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTap(value: /* toast */ IToast => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(js.undefined)
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
    def withTemplates(value: AnonProgressbar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withToastClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToastClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastClass")(js.undefined)
        ret
    }
  }
  
}

