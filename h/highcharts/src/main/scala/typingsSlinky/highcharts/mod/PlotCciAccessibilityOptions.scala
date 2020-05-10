package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotCciAccessibilityOptions extends js.Object {
  /**
    * (Highstock) Provide a description of the series, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highstock) Enable/disable accessibility functionality for a specific
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Expose only the series element to screen readers, not its
    * points.
    */
  var exposeAsGroupOnly: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Keyboard navigation for a series
    */
  var keyboardNavigation: js.UndefOr[js.Object | PlotCciAccessibilityKeyboardNavigationOptions] = js.native
  /**
    * (Highstock) Formatter function to use instead of the default for point
    * descriptions. Same as `accessibility.pointDescriptionFormatter`, but for
    * a single series.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.native
}

object PlotCciAccessibilityOptions {
  @scala.inline
  def apply(): PlotCciAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotCciAccessibilityOptions]
  }
  @scala.inline
  implicit class PlotCciAccessibilityOptionsOps[Self <: PlotCciAccessibilityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
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
    def withExposeAsGroupOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeAsGroupOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposeAsGroupOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeAsGroupOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardNavigation(value: js.Object | PlotCciAccessibilityKeyboardNavigationOptions): Self = {
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
    @scala.inline
    def withPointDescriptionFormatter(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDescriptionFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointDescriptionFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDescriptionFormatter")(js.undefined)
        ret
    }
  }
  
}

