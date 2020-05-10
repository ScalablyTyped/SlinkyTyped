package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotRsiAccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Highstock) Enable/disable keyboard navigation support for a specific
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object PlotRsiAccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(): PlotRsiAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotRsiAccessibilityKeyboardNavigationOptions]
  }
  @scala.inline
  implicit class PlotRsiAccessibilityKeyboardNavigationOptionsOps[Self <: PlotRsiAccessibilityKeyboardNavigationOptions] (val x: Self) extends AnyVal {
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

