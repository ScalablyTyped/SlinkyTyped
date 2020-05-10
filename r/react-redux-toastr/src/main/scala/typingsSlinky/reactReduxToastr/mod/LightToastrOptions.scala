package typingsSlinky.reactReduxToastr.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightToastrOptions extends js.Object {
  var attention: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var component: js.UndefOr[ReactElement] = js.native
  var icon: js.UndefOr[iconType | ReactElement] = js.native
  var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var progressBar: js.UndefOr[Boolean] = js.native
  var removeOnHover: js.UndefOr[Boolean] = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[iconType] = js.native
  var timeOut: js.UndefOr[Double] = js.native
  var transitionIn: js.UndefOr[transitionInType] = js.native
  var transitionOut: js.UndefOr[transitionOutType] = js.native
}

object LightToastrOptions {
  @scala.inline
  def apply(): LightToastrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightToastrOptions]
  }
  @scala.inline
  implicit class LightToastrOptionsOps[Self <: LightToastrOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttention(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attention")(js.undefined)
        ret
    }
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
    def withComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: iconType | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseButtonClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseButtonClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCloseButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHideComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHideComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShowComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowComplete")(js.undefined)
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
    def withRemoveOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnHover")(js.undefined)
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
    def withStatus(value: iconType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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

