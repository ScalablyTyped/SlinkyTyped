package typingsSlinky.highchartsNg.mod._Global_

import typingsSlinky.highcharts.mod.Options
import typingsSlinky.highchartsNg.AnonCurrentMax
import typingsSlinky.highchartsNg.AnonHeight
import typingsSlinky.highchartsNg.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighChartsNGConfig extends js.Object {
  //function (optional) - setup some logic for the chart
  var func: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ js.Any, 
      Unit
    ]
  ] = js.native
  //Boolean to control showng loading status on chart (optional)
  //Could be a string if you want to show specific loading text.
  var loading: js.UndefOr[Boolean | String] = js.native
  //no data text (optional) to show if all series are empty
  var noData: js.UndefOr[String] = js.native
  var options: Options = js.native
  //The below properties are watched separately for changes.
  //Series object (optional) - a list of series using normal highcharts series options.
  var series: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ _
    ]
  ] = js.native
  //size (optional) if left out the chart will default to size of the div or something sensible.
  var size: js.UndefOr[AnonHeight] = js.native
  //Title configuration (optional)
  var title: js.UndefOr[AnonText] = js.native
  //Whether to use HighStocks instead of HighCharts (optional). Defaults to false.
  var useHighStocks: js.UndefOr[Boolean] = js.native
  //Configuration for the xAxis (optional). Currently only one x axis can be dynamically controlled.
  //properties currentMin and currentMax provied 2-way binding to the chart's maximimum and minimum
  var xAxis: js.UndefOr[AnonCurrentMax] = js.native
}

object HighChartsNGConfig {
  @scala.inline
  def apply(options: Options): HighChartsNGConfig = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighChartsNGConfig]
  }
  @scala.inline
  implicit class HighChartsNGConfigOps[Self <: HighChartsNGConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunc(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ js.Any => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withNoData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ _
        ]
    ): Self = {
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
    def withSize(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: AnonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHighStocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHighStocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHighStocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHighStocks")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxis(value: AnonCurrentMax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(js.undefined)
        ret
    }
  }
  
}

