package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonArgumentFormat
import typingsSlinky.devextreme.AnonColorDashStyle
import typingsSlinky.devextreme.AnonGroupName
import typingsSlinky.devextreme.AnonHatching
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.onlyPoint
import typingsSlinky.devextreme.devextremeStrings.string_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPieChartSeriesTypesCommonPieChartSeries extends js.Object {
  /** Specifies the data source field that provides arguments for series points. */
  var argumentField: js.UndefOr[String] = js.native
  /** Specifies the required type for series arguments. */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.native
  /** An object defining the series border configuration options. */
  var border: js.UndefOr[AnonColorDashStyle] = js.native
  /** Specifies a series color. */
  var color: js.UndefOr[String] = js.native
  /** Specifies the chart elements to highlight when a series is hovered over. */
  var hoverMode: js.UndefOr[none | onlyPoint] = js.native
  /** An object defining configuration options for a hovered series. */
  var hoverStyle: js.UndefOr[AnonHatching] = js.native
  /** An object defining the label configuration options. */
  var label: js.UndefOr[AnonArgumentFormat] = js.native
  /** Specifies how many points are acceptable to be in a series to display all labels for these points. Otherwise, the labels will not be displayed. */
  var maxLabelCount: js.UndefOr[Double] = js.native
  /** Specifies a minimal size of a displayed pie segment. */
  var minSegmentSize: js.UndefOr[Double] = js.native
  /** Specifies the chart elements to highlight when the series is selected. */
  var selectionMode: js.UndefOr[none | onlyPoint] = js.native
  /** An object defining configuration options for the series when it is selected. */
  var selectionStyle: js.UndefOr[AnonHatching] = js.native
  /** Specifies chart segment grouping options. */
  var smallValuesGrouping: js.UndefOr[AnonGroupName] = js.native
  /** Specifies the name of the data source field that provides data about a point. */
  var tagField: js.UndefOr[String] = js.native
  /** Specifies the data source field that provides values for series points. */
  var valueField: js.UndefOr[String] = js.native
}

object dxPieChartSeriesTypesCommonPieChartSeries {
  @scala.inline
  def apply(): dxPieChartSeriesTypesCommonPieChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartSeriesTypesCommonPieChartSeries]
  }
  @scala.inline
  implicit class dxPieChartSeriesTypesCommonPieChartSeriesOps[Self <: dxPieChartSeriesTypesCommonPieChartSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentField")(js.undefined)
        ret
    }
    @scala.inline
    def withArgumentType(value: datetime | numeric | string_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentType")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: AnonColorDashStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverMode(value: none | onlyPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverStyle(value: AnonHatching): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnonArgumentFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLabelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLabelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLabelCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLabelCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSegmentSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSegmentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSegmentSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSegmentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: none | onlyPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStyle(value: AnonHatching): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallValuesGrouping(value: AnonGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallValuesGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallValuesGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallValuesGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withTagField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagField")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
  }
  
}

