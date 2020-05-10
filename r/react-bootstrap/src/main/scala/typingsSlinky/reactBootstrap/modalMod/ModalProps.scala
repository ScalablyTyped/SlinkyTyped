package typingsSlinky.reactBootstrap.modalMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.mod.Sizes
import typingsSlinky.reactBootstrap.mod.TransitionCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalProps
  extends AllHTMLAttributes[Modal]
     with TransitionCallbacks
     with ClassAttributes[Modal] {
  // Optional
  var animation: js.UndefOr[Boolean] = js.native
  var backdrop: js.UndefOr[Boolean | String] = js.native
  var backdropClassName: js.UndefOr[String] = js.native
  var backdropStyle: js.UndefOr[js.Any] = js.native
  var backdropTransitionTimeout: js.UndefOr[Double] = js.native
  var bsClass: js.UndefOr[String] = js.native
  var bsSize: js.UndefOr[Sizes] = js.native
  var container: js.UndefOr[js.Any] = js.native
   // TODO: Add more specific type
  var containerClassName: js.UndefOr[String] = js.native
  var dialogClassName: js.UndefOr[String] = js.native
  var dialogComponent: js.UndefOr[js.Any] = js.native
   // TODO: Add more specific type
  var dialogTransitionTimeout: js.UndefOr[Double] = js.native
  var enforceFocus: js.UndefOr[Boolean] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var onBackdropClick: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  var onEscapeKeyDown: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * @deprecated since Sept 25, 2017, use onEscapeKeyDown instead
    **/
  var onEscapeKeyUp: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  // Required
  var onHide: js.Function = js.native
  var onShow: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  var restoreFocus: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var transition: js.UndefOr[ReactElement] = js.native
}

object ModalProps {
  @scala.inline
  def apply(onHide: js.Function): ModalProps = {
    val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnHide(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdrop(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropTransitionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransitionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropTransitionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransitionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBsSize(value: Sizes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogComponent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogTransitionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTransitionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogTransitionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTransitionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBackdropClick(value: /* node */ HTMLElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBackdropClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEscapeKeyDown(value: /* node */ HTMLElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscapeKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEscapeKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscapeKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEscapeKeyUp(value: /* node */ HTMLElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscapeKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEscapeKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscapeKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* node */ HTMLElement => _): Self = {
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
    def withRestoreFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

