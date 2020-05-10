package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
    * the chart.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border
    * drawn around elements while navigating through them.
    */
  var focusBorder: js.UndefOr[AccessibilityKeyboardNavigationFocusBorderOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set the keyboard navigation mode
    * for the chart. Can be "normal" or "serialize". In normal mode, left/right
    * arrow keys move between points in a series, while up/down arrow keys move
    * between series. Up/down navigation acts intelligently to figure out which
    * series makes sense to move to from any given point.
    *
    * In "serialize" mode, points are instead navigated as a single list.
    * Left/right behaves as in "normal" mode. Up/down arrow keys will behave
    * like left/right. This can be useful for unifying navigation behavior
    * with/without screen readers enabled.
    */
  var mode: js.UndefOr[OptionsModeValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Order of tab navigation in the
    * chart. Determines which elements are tabbed to first. Available elements
    * are: `series`, `zoom`, `rangeSelector`, `chartMenu`, `legend`. In
    * addition, any custom components can be added here.
    */
  var order: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Skip null points when navigating
    * through points with the keyboard.
    */
  var skipNullPoints: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to wrap around
    * when reaching the end of arrow-key navigation for an element in the
    * chart.
    */
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object AccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(): AccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityKeyboardNavigationOptions]
  }
  @scala.inline
  implicit class AccessibilityKeyboardNavigationOptionsOps[Self <: AccessibilityKeyboardNavigationOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withFocusBorder(value: AccessibilityKeyboardNavigationFocusBorderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: OptionsModeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipNullPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNullPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipNullPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNullPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapAround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapAround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(js.undefined)
        ret
    }
  }
  
}

