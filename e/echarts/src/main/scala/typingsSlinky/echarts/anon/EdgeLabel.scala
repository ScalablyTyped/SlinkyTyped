package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeLabel extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.edgeLabel
    */
  var edgeLabel: js.UndefOr[FontStyle] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.label
    */
  var label: js.UndefOr[Distance] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
}

object EdgeLabel {
  @scala.inline
  def apply(): EdgeLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeLabel]
  }
  @scala.inline
  implicit class EdgeLabelOps[Self <: EdgeLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgeLabel(value: FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: BorderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Distance): Self = {
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
    def withLineStyle(value: ShadowBlur): Self = {
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
  }
  
}

