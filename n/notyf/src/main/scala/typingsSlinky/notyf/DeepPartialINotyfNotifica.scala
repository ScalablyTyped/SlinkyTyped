package typingsSlinky.notyf

import typingsSlinky.notyf.notyfBooleans.`false`
import typingsSlinky.notyf.notyfOptionsMod.DeepPartial
import typingsSlinky.notyf.notyfOptionsMod.INotyfIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined notyf.notyf/notyf.options.DeepPartial<notyf.notyf/notyf.options.INotyfNotificationOptions> */
@js.native
trait DeepPartialINotyfNotifica extends js.Object {
  var backgroundColor: js.UndefOr[DeepPartial[String]] = js.native
  var className: js.UndefOr[DeepPartial[String]] = js.native
  var duration: js.UndefOr[DeepPartial[Double]] = js.native
  var icon: js.UndefOr[DeepPartial[INotyfIcon | `false`]] = js.native
  var message: js.UndefOr[DeepPartial[String]] = js.native
  var ripple: js.UndefOr[DeepPartial[Boolean]] = js.native
  var `type`: js.UndefOr[DeepPartial[String]] = js.native
}

object DeepPartialINotyfNotifica {
  @scala.inline
  def apply(): DeepPartialINotyfNotifica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialINotyfNotifica]
  }
  @scala.inline
  implicit class DeepPartialINotyfNotificaOps[Self <: DeepPartialINotyfNotifica] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: DeepPartial[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: DeepPartial[String]): Self = {
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
    def withDuration(value: DeepPartial[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: DeepPartial[INotyfIcon | `false`]): Self = {
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
    def withMessage(value: DeepPartial[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withRipple(value: DeepPartial[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DeepPartial[String]): Self = {
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

