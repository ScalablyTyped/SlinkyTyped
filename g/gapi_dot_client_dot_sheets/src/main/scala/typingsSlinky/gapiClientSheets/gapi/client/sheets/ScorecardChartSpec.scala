package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScorecardChartSpec extends js.Object {
  /**
    * The aggregation type for key and baseline chart data in scorecard chart.
    * This field is optional.
    */
  var aggregateType: js.UndefOr[String] = js.native
  /**
    * The data for scorecard baseline value.
    * This field is optional.
    */
  var baselineValueData: js.UndefOr[ChartData] = js.native
  /**
    * Formatting options for baseline value.
    * This field is needed only if baseline_value_data is specified.
    */
  var baselineValueFormat: js.UndefOr[BaselineValueFormat] = js.native
  /**
    * Custom formatting options for numeric key/baseline values in scorecard
    * chart. This field is used only when number_format_source is set to
    * CUSTOM. This field is optional.
    */
  var customFormatOptions: js.UndefOr[ChartCustomNumberFormatOptions] = js.native
  /** The data for scorecard key value. */
  var keyValueData: js.UndefOr[ChartData] = js.native
  /** Formatting options for key value. */
  var keyValueFormat: js.UndefOr[KeyValueFormat] = js.native
  /**
    * The number format source used in the scorecard chart.
    * This field is optional.
    */
  var numberFormatSource: js.UndefOr[String] = js.native
  /**
    * Value to scale scorecard key and baseline value. For example, a factor of
    * 10 can be used to divide all values in the chart by 10.
    * This field is optional.
    */
  var scaleFactor: js.UndefOr[Double] = js.native
}

object ScorecardChartSpec {
  @scala.inline
  def apply(): ScorecardChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScorecardChartSpec]
  }
  @scala.inline
  implicit class ScorecardChartSpecOps[Self <: ScorecardChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateType")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineValueData(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineValueData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineValueData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineValueData")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineValueFormat(value: BaselineValueFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineValueFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineValueFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineValueFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFormatOptions(value: ChartCustomNumberFormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormatOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFormatOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormatOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyValueData(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValueData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyValueData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValueData")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyValueFormat(value: KeyValueFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValueFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyValueFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValueFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormatSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormatSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormatSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormatSource")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(js.undefined)
        ret
    }
  }
  
}

