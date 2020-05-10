package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
    * the legend.
    */
  var enabled: js.UndefOr[js.Any] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation
    * for the legend.
    */
  var keyboardNavigation: js.UndefOr[LegendAccessibilityKeyboardNavigationOptions] = js.native
}

object LegendAccessibilityOptions {
  @scala.inline
  def apply(): LegendAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendAccessibilityOptions]
  }
  @scala.inline
  implicit class LegendAccessibilityOptionsOps[Self <: LegendAccessibilityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: js.Any): Self = {
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
    @scala.inline
    def withKeyboardNavigation(value: LegendAccessibilityKeyboardNavigationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigation")(js.undefined)
        ret
    }
  }
  
}

