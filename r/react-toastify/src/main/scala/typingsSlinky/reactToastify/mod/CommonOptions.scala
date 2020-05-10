package typingsSlinky.reactToastify.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactToastify.reactToastifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions extends js.Object {
  /**
    * Set the delay in ms to close the toast automatically.
    * Use `false` to prevent the toast from closing.
    * `Default: 5000`
    */
  var autoClose: js.UndefOr[Double | `false`] = js.native
  /**
    * An optional css class to set for the toast content.
    */
  var bodyClassName: js.UndefOr[String | js.Object] = js.native
  /**
    * An optional css class to set.
    */
  var className: js.UndefOr[String | js.Object] = js.native
  /**
    * Pass a custom close button.
    * To remove the close button pass `false`
    */
  var closeButton: js.UndefOr[TagMod[Any] | Boolean] = js.native
  /**
    * Remove the toast when clicked.
    * `Default: true`
    */
  var closeOnClick: js.UndefOr[Boolean] = js.native
  /**
    * Set id to handle multiple container
    */
  var containerId: js.UndefOr[String | Double] = js.native
  /**
    * Allow toast to be draggable
    * `Default: true`
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a toast
    * `Default: 80`
    */
  var draggablePercent: js.UndefOr[Double] = js.native
  /**
    * Hide or show the progress bar.
    * `Default: false`
    */
  var hideProgressBar: js.UndefOr[Boolean] = js.native
  /**
    * Fired when clicking inside toaster
    */
  var onClick: js.UndefOr[js.Function] = js.native
  /**
    * Pause the toast when the window loose focus.
    * `Default: true`
    */
  var pauseOnFocusLoss: js.UndefOr[Boolean] = js.native
  /**
    * Pause the timer when the mouse hover the toast.
    * `Default: true`
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  /**
    * Set the default position to use.
    * `One of: 'top-right', 'top-center', 'top-left', 'bottom-right', 'bottom-center', 'bottom-left'`
    * `Default: 'top-right'`
    */
  var position: js.UndefOr[PositionOptions] = js.native
  /**
    * An optional css class to set for the progress bar.
    */
  var progressClassName: js.UndefOr[String | js.Object] = js.native
  /**
    * An optional style to set for the progress bar.
    */
  var progressStyle: js.UndefOr[js.Object] = js.native
  /**
    * Define the ARIA role for the toast
    * `Default: alert`
    *  https://www.w3.org/WAI/PF/aria/roles
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Pass a custom transition built with react-transition-group.
    */
  var transition: js.UndefOr[ReactComponentClass[js.Object]] = js.native
}

object CommonOptions {
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyClassName(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String | js.Object): Self = {
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
    def withCloseButtonReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseButton(value: TagMod[Any] | Boolean): Self = {
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
    def withCloseOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggablePercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggablePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggablePercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggablePercent")(js.undefined)
        ret
    }
    @scala.inline
    def withHideProgressBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideProgressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideProgressBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideProgressBar")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnFocusLoss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnFocusLoss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnFocusLoss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnFocusLoss")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionOptions): Self = {
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
    def withProgressClassName(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: ReactComponentClass[js.Object]): Self = {
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

