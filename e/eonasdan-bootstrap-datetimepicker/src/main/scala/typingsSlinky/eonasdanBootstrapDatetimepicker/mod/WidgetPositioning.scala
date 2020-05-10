package typingsSlinky.eonasdanBootstrapDatetimepicker.mod

import typingsSlinky.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.auto
import typingsSlinky.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.bottom
import typingsSlinky.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.left
import typingsSlinky.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.right
import typingsSlinky.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetPositioning extends js.Object {
  var horizontal: js.UndefOr[auto | left | right] = js.native
  var vertical: js.UndefOr[auto | top | bottom] = js.native
}

object WidgetPositioning {
  @scala.inline
  def apply(): WidgetPositioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetPositioning]
  }
  @scala.inline
  implicit class WidgetPositioningOps[Self <: WidgetPositioning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: auto | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: auto | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

