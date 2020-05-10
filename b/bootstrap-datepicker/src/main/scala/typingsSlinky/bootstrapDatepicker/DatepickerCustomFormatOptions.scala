package typingsSlinky.bootstrapDatepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatepickerCustomFormatOptions extends js.Object {
  var toDisplay: js.UndefOr[
    js.Function3[/* date */ String, /* format */ js.Any, /* language */ js.Any, String]
  ] = js.native
  var toValue: js.UndefOr[
    js.Function3[/* date */ String, /* format */ js.Any, /* language */ js.Any, js.Date]
  ] = js.native
}

object DatepickerCustomFormatOptions {
  @scala.inline
  def apply(): DatepickerCustomFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerCustomFormatOptions]
  }
  @scala.inline
  implicit class DatepickerCustomFormatOptionsOps[Self <: DatepickerCustomFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToDisplay(value: (/* date */ String, /* format */ js.Any, /* language */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDisplay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutToDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withToValue(value: (/* date */ String, /* format */ js.Any, /* language */ js.Any) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toValue")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutToValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toValue")(js.undefined)
        ret
    }
  }
  
}

