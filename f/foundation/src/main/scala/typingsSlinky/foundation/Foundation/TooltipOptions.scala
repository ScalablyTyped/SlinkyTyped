package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipOptions extends js.Object {
  var additional_inheritable_classes: js.UndefOr[js.Array[String]] = js.native
  var append_to: js.UndefOr[String] = js.native
  var disable_for_touch: js.UndefOr[Boolean] = js.native
  var hover_delay: js.UndefOr[Double] = js.native
  var show_on: js.UndefOr[String] = js.native
  var tip_template: js.UndefOr[js.Function2[/* selector */ String, /* content */ String, String]] = js.native
  var tooltip_class: js.UndefOr[String] = js.native
  var touch_close_text: js.UndefOr[String] = js.native
}

object TooltipOptions {
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditional_inheritable_classes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_inheritable_classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditional_inheritable_classes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_inheritable_classes")(js.undefined)
        ret
    }
    @scala.inline
    def withAppend_to(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append_to")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_for_touch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_for_touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_for_touch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_for_touch")(js.undefined)
        ret
    }
    @scala.inline
    def withHover_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover_delay")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_on(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_on")(js.undefined)
        ret
    }
    @scala.inline
    def withTip_template(value: (/* selector */ String, /* content */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_template")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTip_template: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip_template")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip_class")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch_close_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch_close_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch_close_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch_close_text")(js.undefined)
        ret
    }
  }
  
}

