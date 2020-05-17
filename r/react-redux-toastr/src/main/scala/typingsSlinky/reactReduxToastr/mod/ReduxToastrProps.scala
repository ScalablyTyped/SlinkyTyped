package typingsSlinky.reactReduxToastr.mod

import typingsSlinky.reactReduxToastr.anon.CancelText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReduxToastrProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var closeOnToastrClick: js.UndefOr[Boolean] = js.native
  var confirmOptions: js.UndefOr[CancelText] = js.native
  var newestOnTop: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[js.Any] = js.native
   // This is currently not used, waiting for response from the package author to remove
  var position: js.UndefOr[positionType] = js.native
  var preventDuplicates: js.UndefOr[Boolean] = js.native
  var progressBar: js.UndefOr[Boolean] = js.native
  var timeOut: js.UndefOr[Double] = js.native
  var toastr: js.UndefOr[ToastrState] = js.native
  var transitionIn: js.UndefOr[transitionInType] = js.native
  var transitionOut: js.UndefOr[transitionOutType] = js.native
}

object ReduxToastrProps {
  @scala.inline
  def apply(): ReduxToastrProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReduxToastrProps]
  }
  @scala.inline
  implicit class ReduxToastrPropsOps[Self <: ReduxToastrProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnToastrClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnToastrClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnToastrClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnToastrClick")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmOptions(value: CancelText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNewestOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newestOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewestOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newestOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: positionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDuplicates")(js.undefined)
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
    def withToastr(value: ToastrState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToastr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastr")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionIn(value: transitionInType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionIn")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionOut(value: transitionOutType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionOut")(js.undefined)
        ret
    }
  }
  
}

