package typingsSlinky.reactChartjs2.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.chartJs.mod.ChartLegendOptions
import typingsSlinky.chartJs.mod.ChartOptions
import typingsSlinky.chartJs.mod.ChartType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartComponentProps extends js.Object {
  var data: ChartData[typingsSlinky.chartJs.mod.ChartData] = js.native
  var datasetKeyProvider: js.UndefOr[js.Function1[/* any */ js.Any, _]] = js.native
  var getDatasetAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  var getElementAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  var getElementsAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  var height: js.UndefOr[Double] = js.native
  var legend: js.UndefOr[ChartLegendOptions] = js.native
  var onElementsClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
   // alias for getElementsAtEvent (backward compatibility)
  var options: js.UndefOr[ChartOptions] = js.native
  var plugins: js.UndefOr[js.Array[js.Object]] = js.native
  var redraw: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[ChartType] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ChartComponentProps {
  @scala.inline
  def apply(data: ChartData[typingsSlinky.chartJs.mod.ChartData]): ChartComponentProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartComponentProps]
  }
  @scala.inline
  implicit class ChartComponentPropsOps[Self <: ChartComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFunction1(value: /* element */ HTMLElement => typingsSlinky.chartJs.mod.ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: ChartData[typingsSlinky.chartJs.mod.ChartData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasetKeyProvider(value: /* any */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetKeyProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDatasetKeyProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetKeyProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDatasetAtEvent(value: /* e */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatasetAtEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDatasetAtEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatasetAtEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetElementAtEvent(value: /* e */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementAtEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetElementAtEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementAtEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetElementsAtEvent(value: /* e */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsAtEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetElementsAtEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsAtEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withLegend(value: ChartLegendOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnElementsClick(value: /* e */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onElementsClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnElementsClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onElementsClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: ChartOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRedraw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ChartType): Self = {
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
    @scala.inline
    def withWidth(value: Double): Self = {
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

