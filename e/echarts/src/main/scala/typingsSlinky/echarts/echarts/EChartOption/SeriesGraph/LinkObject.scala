package typingsSlinky.echarts.echarts.EChartOption.SeriesGraph

import typingsSlinky.echarts.AnonFontStyle
import typingsSlinky.echarts.AnonLabelLineStyle
import typingsSlinky.echarts.AnonShadowColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis
    */
  var emphasis: js.UndefOr[AnonLabelLineStyle] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.label
    */
  var label: js.UndefOr[AnonFontStyle] = js.native
  /**
    * Line style of edges.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowColor] = js.native
  /**
    * [name of source node](https://echarts.apache.org/en/option.html#series-graph.data.name)
    * on edge
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.source
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Symbol of edge ends.
    * Can be an array with two item to specify two ends, or a string
    * specifies both ends.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | String] = js.native
  /**
    * Symbol size of edge ends.
    * Can be an array with two item to specify two ends, or a string
    * specifies both ends.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | String] = js.native
  /**
    * [name of target node](https://echarts.apache.org/en/option.html#series-graph.data.name)
    * on edge
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.target
    */
  var target: js.UndefOr[String] = js.native
  /**
    * value of edge, can be mapped to edge length in force graph.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.value
    */
  var value: js.UndefOr[Double] = js.native
}

object LinkObject {
  @scala.inline
  def apply(): LinkObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkObject]
  }
  @scala.inline
  implicit class LinkObjectOps[Self <: LinkObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmphasis(value: AnonLabelLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmphasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnonFontStyle): Self = {
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
    def withLineStyle(value: AnonShadowColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: js.Array[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSize(value: js.Array[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

