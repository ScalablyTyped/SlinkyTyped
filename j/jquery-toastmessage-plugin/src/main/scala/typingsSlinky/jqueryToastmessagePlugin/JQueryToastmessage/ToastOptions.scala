package typingsSlinky.jqueryToastmessagePlugin.JQueryToastmessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastOptions extends js.Object {
  /** callback function when the toastmessage is closed @default null */
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * text which will be shown as close button,
    * set to '' when you want to introduce an image via css
    * @default ''
    */
  var closeText: js.UndefOr[String] = js.native
  /** in effect duration in miliseconds @default 600 */
  var inEffectDuration: js.UndefOr[Double] = js.native
  /**
    * Position of the toast container holding different toast.
    * Position can be set only once at the very first call,
    * changing the position after the first call does nothing
    * @default 'top-right'
    */
  var position: js.UndefOr[ToastPosition] = js.native
  /**
    * time in miliseconds before the item has to disappear @default 3000
    */
  var stayTime: js.UndefOr[Double] = js.native
  /** should the toast item sticky or not? @default false */
  var sticky: js.UndefOr[Boolean] = js.native
  /** content of the item @default '' */
  var text: js.UndefOr[String] = js.native
  /** the type of toast @default 'notice' */
  var `type`: js.UndefOr[ToastType] = js.native
}

object ToastOptions {
  @scala.inline
  def apply(): ToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastOptions]
  }
  @scala.inline
  implicit class ToastOptionsOps[Self <: ToastOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(js.undefined)
        ret
    }
    @scala.inline
    def withInEffectDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inEffectDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInEffectDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inEffectDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ToastPosition): Self = {
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
    def withStayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStayTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stayTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ToastType): Self = {
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

