package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.area
import typingsSlinky.devextreme.devextremeStrings.bar
import typingsSlinky.devextreme.devextremeStrings.bubble
import typingsSlinky.devextreme.devextremeStrings.candlestick
import typingsSlinky.devextreme.devextremeStrings.fullstackedarea
import typingsSlinky.devextreme.devextremeStrings.fullstackedbar
import typingsSlinky.devextreme.devextremeStrings.fullstackedline
import typingsSlinky.devextreme.devextremeStrings.fullstackedspline
import typingsSlinky.devextreme.devextremeStrings.fullstackedsplinearea
import typingsSlinky.devextreme.devextremeStrings.line
import typingsSlinky.devextreme.devextremeStrings.rangearea
import typingsSlinky.devextreme.devextremeStrings.rangebar_
import typingsSlinky.devextreme.devextremeStrings.scatter
import typingsSlinky.devextreme.devextremeStrings.spline
import typingsSlinky.devextreme.devextremeStrings.splinearea
import typingsSlinky.devextreme.devextremeStrings.stackedarea
import typingsSlinky.devextreme.devextremeStrings.stackedbar
import typingsSlinky.devextreme.devextremeStrings.stackedline
import typingsSlinky.devextreme.devextremeStrings.stackedspline
import typingsSlinky.devextreme.devextremeStrings.stackedsplinearea
import typingsSlinky.devextreme.devextremeStrings.steparea
import typingsSlinky.devextreme.devextremeStrings.stepline
import typingsSlinky.devextreme.devextremeStrings.stock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonSeriesSettings extends dxChartSeriesTypesCommonSeries {
  /** Defines common settings for all area series. */
  var area: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all bar series. */
  var bar: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all bubble series. */
  var bubble: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all candlestick series. */
  var candlestick: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all full-stacked area series. */
  var fullstackedarea: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all full-stacked bar series. */
  var fullstackedbar: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all full-stacked line series. */
  var fullstackedline: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all full-stacked spline series. */
  var fullstackedspline: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all full-stacked spline area series. */
  var fullstackedsplinearea: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all line series. */
  var line: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all range area series. */
  var rangearea: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all range bar series. */
  var rangebar: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all scatter series. */
  var scatter: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all spline series. */
  var spline: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all spline area series. */
  var splinearea: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all stacked area series. */
  var stackedarea: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all stacked bar series. */
  var stackedbar: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all stacked line series. */
  var stackedline: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all stacked spline series. */
  var stackedspline: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all stacked spline area series. */
  var stackedsplinearea: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all step area series. */
  var steparea: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all step line series. */
  var stepline: js.UndefOr[js.Any] = js.native
  /** Defines common settings for all stock series. */
  var stock: js.UndefOr[js.Any] = js.native
  /** Specifies the type of the series. */
  var `type`: js.UndefOr[
    area | bar | bubble | candlestick | fullstackedarea | fullstackedbar | fullstackedline | fullstackedspline | fullstackedsplinearea | line | rangearea | rangebar_ | scatter | spline | splinearea | stackedarea | stackedbar | stackedline | stackedspline | stackedsplinearea | steparea | stepline | stock
  ] = js.native
}

object dxChartCommonSeriesSettings {
  @scala.inline
  def apply(): dxChartCommonSeriesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonSeriesSettings]
  }
  @scala.inline
  implicit class dxChartCommonSeriesSettingsOps[Self <: dxChartCommonSeriesSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withBar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(js.undefined)
        ret
    }
    @scala.inline
    def withBubble(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.undefined)
        ret
    }
    @scala.inline
    def withCandlestick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candlestick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandlestick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candlestick")(js.undefined)
        ret
    }
    @scala.inline
    def withFullstackedarea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullstackedarea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullstackedarea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullstackedarea")(js.undefined)
        ret
    }
    @scala.inline
    def withFullstackedbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullstackedbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullstackedbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullstackedbar")(js.undefined)
        ret
    }
    @scala.inline
    def withFullstackedline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullstackedline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullstackedline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullstackedline")(js.undefined)
        ret
    }
    @scala.inline
    def withFullstackedspline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullstackedspline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullstackedspline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullstackedspline")(js.undefined)
        ret
    }
    @scala.inline
    def withFullstackedsplinearea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullstackedsplinearea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullstackedsplinearea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullstackedsplinearea")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withRangearea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangearea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangearea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangearea")(js.undefined)
        ret
    }
    @scala.inline
    def withRangebar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangebar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangebar")(js.undefined)
        ret
    }
    @scala.inline
    def withScatter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatter")(js.undefined)
        ret
    }
    @scala.inline
    def withSpline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spline")(js.undefined)
        ret
    }
    @scala.inline
    def withSplinearea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splinearea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplinearea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splinearea")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedarea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedarea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedarea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedarea")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedbar")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedline")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedspline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedspline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedspline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedspline")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedsplinearea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedsplinearea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedsplinearea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedsplinearea")(js.undefined)
        ret
    }
    @scala.inline
    def withSteparea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steparea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteparea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steparea")(js.undefined)
        ret
    }
    @scala.inline
    def withStepline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepline")(js.undefined)
        ret
    }
    @scala.inline
    def withStock(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stock")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: area | bar | bubble | candlestick | fullstackedarea | fullstackedbar | fullstackedline | fullstackedspline | fullstackedsplinearea | line | rangearea | rangebar_ | scatter | spline | splinearea | stackedarea | stackedbar | stackedline | stackedspline | stackedsplinearea | steparea | stepline | stock
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

