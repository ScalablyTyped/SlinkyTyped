package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDoughnutChart
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets whether the slices can be exploded.
  	 */
  var allowSliceExplosion: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether the slices can be selected.
  	 */
  var allowSliceSelection: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired when the control is displayed on a non HTML5 compliant browser
  	 */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.native
  /**
  	 * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Raised when the dimensions (center point or radius) of the doughnut hole change.
  	 */
  var holeDimensionsChanged: js.UndefOr[HoleDimensionsChangedEvent] = js.native
  /**
  	 * Gets or sets the inner extent of the doughnut chart. It is percent from the outer ring's radius.
  	 */
  var innerExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets whether all surface interactions with the plot area should be disabled.
  	 */
  var isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the style used when a slice is selected.
  	 */
  var selectedStyle: js.UndefOr[js.Any] = js.native
  /**
  	 * An array of series objects.
  	 */
  var series: js.UndefOr[js.Array[IgDoughnutChartSeries]] = js.native
  /**
  	 * Raised when the slice is clicked.
  	 */
  var sliceClick: js.UndefOr[SliceClickEvent] = js.native
  /**
  	 * Event fired after a tooltip is hidden
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.native
  /**
  	 * Event fired when the mouse has left a series and the tooltip is about to hide
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.native
  /**
  	 * Event fired when the mouse has hovered on a series and the tooltip is about to show
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.native
  /**
  	 * Event fired after a tooltip is shown
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  /**
  	 * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgDoughnutChart {
  @scala.inline
  def apply(): IgDoughnutChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDoughnutChart]
  }
  @scala.inline
  implicit class IgDoughnutChartOps[Self <: IgDoughnutChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSliceExplosion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSliceExplosion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSliceExplosion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSliceExplosion")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSliceSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSliceSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSliceSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSliceSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserNotSupported")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBrowserNotSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserNotSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHoleDimensionsChanged(value: (/* event */ Event, /* ui */ HoleDimensionsChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holeDimensionsChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHoleDimensionsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holeDimensionsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSurfaceInteractionDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSurfaceInteractionDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSurfaceInteractionDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSurfaceInteractionDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelScalingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelScalingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[IgDoughnutChartSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSliceClick(value: (/* event */ Event, /* ui */ SliceClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSliceClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHiding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShowing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

