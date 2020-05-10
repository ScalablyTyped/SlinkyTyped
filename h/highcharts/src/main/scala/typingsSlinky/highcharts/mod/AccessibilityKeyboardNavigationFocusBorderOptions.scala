package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityKeyboardNavigationFocusBorderOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable/disable focus border for
    * chart.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Hide the browser's default focus
    * indicator.
    */
  var hideBrowserFocusOutline: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Focus border margin around the
    * elements.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Style options for the focus
    * border drawn around elements while navigating through them. Note that
    * some browsers in addition draw their own borders for focused elements.
    * These automatic borders can not be styled by Highcharts.
    *
    * In styled mode, the border is given the `.highcharts-focus-border` class.
    */
  var style: js.UndefOr[CSSObject] = js.native
}

object AccessibilityKeyboardNavigationFocusBorderOptions {
  @scala.inline
  def apply(): AccessibilityKeyboardNavigationFocusBorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityKeyboardNavigationFocusBorderOptions]
  }
  @scala.inline
  implicit class AccessibilityKeyboardNavigationFocusBorderOptionsOps[Self <: AccessibilityKeyboardNavigationFocusBorderOptions] (val x: Self) extends AnyVal {
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
    def withHideBrowserFocusOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBrowserFocusOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideBrowserFocusOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBrowserFocusOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

