package typingsSlinky.blueprintjsCore.alertMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.overlayMod.IOverlayLifecycleProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAlertProps
  extends IOverlayLifecycleProps
     with IProps {
  /**
    * Whether pressing <kbd>escape</kbd> when focused on the Alert should cancel the alert.
    * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
    * @default false
    */
  var canEscapeKeyCancel: js.UndefOr[Boolean] = js.native
  /**
    * Whether clicking outside the Alert should cancel the alert.
    * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
    * @default false
    */
  var canOutsideClickCancel: js.UndefOr[Boolean] = js.native
  /**
    * The text for the cancel button.
    * If this prop is defined, then either `onCancel` or `onClose` must also be defined.
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  /**
    * The text for the confirm (right-most) button.
    * This button will always appear, and uses the value of the `intent` prop below.
    * @default "OK"
    */
  var confirmButtonText: js.UndefOr[String] = js.native
  /** Name of a Blueprint UI icon (or an icon element) to display on the left side. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  /**
    * The intent to be applied to the confirm (right-most) button and the icon (if provided).
    */
  var intent: js.UndefOr[Intent] = js.native
  /**
    * Toggles the visibility of the alert.
    * This prop is required because the component is controlled.
    */
  var isOpen: Boolean = js.native
  /**
    * Handler invoked when the alert is canceled. Alerts can be **canceled** in the following ways:
    * - clicking the cancel button (if `cancelButtonText` is defined)
    * - pressing the escape key (if `canEscapeKeyCancel` is enabled)
    * - clicking on the overlay backdrop (if `canOutsideClickCancel` is enabled)
    *
    * If any of the `cancel` props are defined, then either `onCancel` or `onClose` must be defined.
    */
  var onCancel: js.UndefOr[js.Function1[/* evt */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]], Unit]] = js.native
  /**
    * Handler invoked when the Alert is confirmed or canceled; see `onConfirm` and `onCancel` for more details.
    * First argument is `true` if confirmed, `false` otherwise.
    * This is an alternative to defining separate `onConfirm` and `onCancel` handlers.
    */
  var onClose: js.UndefOr[
    js.Function2[
      /* confirmed */ Boolean, 
      /* evt */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]], 
      Unit
    ]
  ] = js.native
  /**
    * Handler invoked when the confirm button is clicked. Alerts can be **confirmed** in the following ways:
    * - clicking the confirm button
    * - focusing on the confirm button and pressing `enter` or `space`
    */
  var onConfirm: js.UndefOr[js.Function1[/* evt */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]], Unit]] = js.native
  /**
    * The container element into which the overlay renders its contents, when `usePortal` is `true`.
    * This prop is ignored if `usePortal` is `false`.
    * @default document.body
    */
  var portalContainer: js.UndefOr[HTMLElement] = js.native
  /**
    * CSS styles to apply to the alert.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
    * This is used by React `CSSTransition` to know when a transition completes and must match
    * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
    * transitions with new transitions of a different length.
    * @default 300
    */
  var transitionDuration: js.UndefOr[Double] = js.native
}

object IAlertProps {
  @scala.inline
  def apply(isOpen: Boolean): IAlertProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlertProps]
  }
  @scala.inline
  implicit class IAlertPropsOps[Self <: IAlertProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanEscapeKeyCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEscapeKeyCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanEscapeKeyCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEscapeKeyCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCanOutsideClickCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canOutsideClickCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanOutsideClickCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canOutsideClickCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: IconName | MaybeElement): Self = {
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
    def withIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withIntent(value: Intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(value: /* evt */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(
      value: (/* confirmed */ Boolean, /* evt */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConfirm(value: /* evt */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withPortalContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
  }
  
}

