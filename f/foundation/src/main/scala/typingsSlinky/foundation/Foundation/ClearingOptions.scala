package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/clearing.html#optional-javascript-configuration
@js.native
trait ClearingOptions extends js.Object {
  var close_selectors: js.UndefOr[String] = js.native
  var init: js.UndefOr[Boolean] = js.native
  var locked: js.UndefOr[Boolean] = js.native
  var open_selectors: js.UndefOr[String] = js.native
  var skip_selector: js.UndefOr[String] = js.native
  var templates: js.UndefOr[js.Object] = js.native
  var touch_label: js.UndefOr[String] = js.native
}

object ClearingOptions {
  @scala.inline
  def apply(): ClearingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearingOptions]
  }
  @scala.inline
  implicit class ClearingOptionsOps[Self <: ClearingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose_selectors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close_selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose_selectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close_selectors")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_selectors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen_selectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_selectors")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip_selector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip_selector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_selector")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch_label")(js.undefined)
        ret
    }
  }
  
}

