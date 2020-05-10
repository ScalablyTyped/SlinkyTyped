package typingsSlinky.jqrangeslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQDateRangeSliderOptions extends JQRangeSliderOptions {
  var bounds: js.UndefOr[JQRangeSliderDateRange] = js.native
   // min and max values of the slider
  var defaultValues: js.UndefOr[JQRangeSliderDateRange] = js.native
   // values selected by default on construction
  var formatter: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.native
   // customize displayed label text
  var step: js.UndefOr[JQRangeSliderDateSteps] = js.native
}

object JQDateRangeSliderOptions {
  @scala.inline
  def apply(): JQDateRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQDateRangeSliderOptions]
  }
  @scala.inline
  implicit class JQDateRangeSliderOptionsOps[Self <: JQDateRangeSliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: JQRangeSliderDateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValues(value: JQRangeSliderDateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValues")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: /* date */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: JQRangeSliderDateSteps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

