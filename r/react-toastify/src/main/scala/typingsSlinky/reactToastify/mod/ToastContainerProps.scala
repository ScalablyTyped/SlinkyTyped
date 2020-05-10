package typingsSlinky.reactToastify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastContainerProps extends CommonOptions {
  /**
    * Show the toast only if it includes containerId and it's the same as containerId
    * `Default: false`
    */
  var enableMultiContainer: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to display the newest toast on top.
    * `Default: false`
    */
  var newestOnTop: js.UndefOr[Boolean] = js.native
  /**
    * Support right to left display.
    * `Default: false`
    */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
    * An optional inline style to apply.
    */
  var style: js.UndefOr[js.Object] = js.native
  /**
    * An optional css class for the toast.
    */
  var toastClassName: js.UndefOr[String | js.Object] = js.native
}

object ToastContainerProps {
  @scala.inline
  def apply(): ToastContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastContainerProps]
  }
  @scala.inline
  implicit class ToastContainerPropsOps[Self <: ToastContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableMultiContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultiContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMultiContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultiContainer")(js.undefined)
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
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
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
    def withToastClassName(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToastClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastClassName")(js.undefined)
        ret
    }
  }
  
}

