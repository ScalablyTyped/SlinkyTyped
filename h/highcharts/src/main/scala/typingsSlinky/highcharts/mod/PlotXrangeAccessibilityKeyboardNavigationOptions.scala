package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotXrangeAccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Enable/disable keyboard navigation support
    * for a specific series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object PlotXrangeAccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(): PlotXrangeAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotXrangeAccessibilityKeyboardNavigationOptions]
  }
  @scala.inline
  implicit class PlotXrangeAccessibilityKeyboardNavigationOptionsOps[Self <: PlotXrangeAccessibilityKeyboardNavigationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

