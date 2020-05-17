package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemStyleLabelLineStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.label
    */
  var label: js.UndefOr[BorderRadius] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[CurvenessOpacity] = js.native
}

object ItemStyleLabelLineStyle {
  @scala.inline
  def apply(): ItemStyleLabelLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStyleLabelLineStyle]
  }
  @scala.inline
  implicit class ItemStyleLabelLineStyleOps[Self <: ItemStyleLabelLineStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLabel(value: BorderRadius): Self = {
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
    def withLineStyle(value: CurvenessOpacity): Self = {
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

