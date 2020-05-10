package typingsSlinky.bootstrapV3Datetimepicker.mod

import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.auto
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.bottom
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.left
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.right
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetPositioningOptions extends js.Object {
  var horizontal: js.UndefOr[auto | left | right] = js.native
  var vertical: js.UndefOr[auto | top | bottom] = js.native
}

object WidgetPositioningOptions {
  @scala.inline
  def apply(): WidgetPositioningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetPositioningOptions]
  }
  @scala.inline
  implicit class WidgetPositioningOptionsOps[Self <: WidgetPositioningOptions] (val x: Self) extends AnyVal {
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

