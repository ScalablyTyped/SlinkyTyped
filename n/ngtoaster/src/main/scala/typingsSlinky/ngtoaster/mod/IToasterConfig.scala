package typingsSlinky.ngtoaster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToasterConfig extends js.Object {
  /**
    * Options include:
    * '', 'trustedHtml', 'template', 'templateWithData'
    */
  var `body-output-type`: js.UndefOr[String] = js.native
  var `body-template`: js.UndefOr[String] = js.native
  var `close-button`: js.UndefOr[Boolean] = js.native
  var `close-html`: js.UndefOr[String] = js.native
  var `icon-class`: js.UndefOr[String] = js.native
  var `icon-classes`: js.UndefOr[IIconClasses] = js.native
  /**
    * limits max number of toasts
    */
  var limit: js.UndefOr[Double] = js.native
  var `message-class`: js.UndefOr[String] = js.native
  /**
    * stop timeout on mouseover and restart timer on mouseout
    */
  var `mouseover-timer-stop`: js.UndefOr[Boolean] = js.native
  var `newest-on-top`: js.UndefOr[Boolean] = js.native
  /**
    * Options include:
    * 'toast-top-full-width', 'toast-bottom-full-width', 'toast-center',
    * 'toast-top-left', 'toast-top-center', 'toast-top-rigt',
    * 'toast-bottom-left', 'toast-bottom-center', 'toast-bottom-rigt',
    */
  var `position-class`: js.UndefOr[String] = js.native
  var `prevent-duplicates`: js.UndefOr[Boolean] = js.native
  var `tap-to-dismiss`: js.UndefOr[Boolean] = js.native
  var `time-out`: js.UndefOr[Double] = js.native
  var `title-class`: js.UndefOr[String] = js.native
}

object IToasterConfig {
  @scala.inline
  def apply(): IToasterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToasterConfig]
  }
  @scala.inline
  implicit class IToasterConfigOps[Self <: IToasterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBody-output-type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-output-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBody-output-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-output-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withBody-template`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBody-template`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body-template")(js.undefined)
        ret
    }
    @scala.inline
    def `withClose-button`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close-button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutClose-button`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close-button")(js.undefined)
        ret
    }
    @scala.inline
    def `withClose-html`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close-html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutClose-html`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close-html")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-class`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-class`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-class")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-classes`(value: IIconClasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-classes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-classes")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def `withMessage-class`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message-class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMessage-class`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message-class")(js.undefined)
        ret
    }
    @scala.inline
    def `withMouseover-timer-stop`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover-timer-stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMouseover-timer-stop`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover-timer-stop")(js.undefined)
        ret
    }
    @scala.inline
    def `withNewest-on-top`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newest-on-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNewest-on-top`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newest-on-top")(js.undefined)
        ret
    }
    @scala.inline
    def `withPosition-class`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position-class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPosition-class`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position-class")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrevent-duplicates`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent-duplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrevent-duplicates`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent-duplicates")(js.undefined)
        ret
    }
    @scala.inline
    def `withTap-to-dismiss`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap-to-dismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTap-to-dismiss`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap-to-dismiss")(js.undefined)
        ret
    }
    @scala.inline
    def `withTime-out`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time-out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTime-out`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time-out")(js.undefined)
        ret
    }
    @scala.inline
    def `withTitle-class`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTitle-class`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-class")(js.undefined)
        ret
    }
  }
  
}

