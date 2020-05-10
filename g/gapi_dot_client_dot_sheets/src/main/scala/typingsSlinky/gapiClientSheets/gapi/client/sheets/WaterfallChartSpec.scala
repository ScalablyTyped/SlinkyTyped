package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaterfallChartSpec extends js.Object {
  /** The line style for the connector lines. */
  var connectorLineStyle: js.UndefOr[LineStyle] = js.native
  /** The domain data (horizontal axis) for the waterfall chart. */
  var domain: js.UndefOr[WaterfallChartDomain] = js.native
  /** True to interpret the first value as a total. */
  var firstValueIsTotal: js.UndefOr[Boolean] = js.native
  /** True to hide connector lines between columns. */
  var hideConnectorLines: js.UndefOr[Boolean] = js.native
  /** The data this waterfall chart is visualizing. */
  var series: js.UndefOr[js.Array[WaterfallChartSeries]] = js.native
  /** The stacked type. */
  var stackedType: js.UndefOr[String] = js.native
}

object WaterfallChartSpec {
  @scala.inline
  def apply(): WaterfallChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartSpec]
  }
  @scala.inline
  implicit class WaterfallChartSpecOps[Self <: WaterfallChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectorLineStyle(value: LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorLineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: WaterfallChartDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstValueIsTotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstValueIsTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstValueIsTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstValueIsTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withHideConnectorLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideConnectorLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideConnectorLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideConnectorLines")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[WaterfallChartSeries]): Self = {
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
    def withStackedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedType")(js.undefined)
        ret
    }
  }
  
}

