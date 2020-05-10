package typingsSlinky.angularDialogService.angular.dialogservice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogOptions extends js.Object {
  /**
    * Set to false to disable animations on new modal/backdrop. Does not toggle animations for modals/backdrops that are already displayed.
    *
    * @default false
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * controls the presence of a backdrop
    * Allowed values:
    *   - true (default)
    *   - false (no backdrop)
    *   - 'static' backdrop is present but modal window is not closed when clicking outside of the modal window
    *
    * @default true
    */
  var backdrop: js.UndefOr[Boolean | String] = js.native
  /**
    * additional CSS class(es) to be added to a modal backdrop template
    *
    * @default 'dialogs-backdrop-default'
    */
  var backdropClass: js.UndefOr[String] = js.native
  /**
    * indicates whether the dialog should be closable by hitting the ESC key
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * Optional suffix of modal window class. The value used is appended to the `modal-` class, i.e. a value of `sm` gives `modal-sm`.
    *
    * @default 'lg'
    */
  var size: js.UndefOr[String] = js.native
  /**
    * additional CSS class(es) to be added to a modal window template
    *
    * @default 'dialogs-default'
    */
  var windowClass: js.UndefOr[String] = js.native
}

object IDialogOptions {
  @scala.inline
  def apply(): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogOptions]
  }
  @scala.inline
  implicit class IDialogOptionsOps[Self <: IDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBackdropClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropClass")(js.undefined)
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
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowClass")(js.undefined)
        ret
    }
  }
  
}

