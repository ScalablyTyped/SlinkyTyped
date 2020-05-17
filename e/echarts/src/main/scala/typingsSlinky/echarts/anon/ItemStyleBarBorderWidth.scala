package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemStyleBarBorderWidth extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BarBorderWidth] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.data.emphasis.label
    */
  var label: js.UndefOr[Distance] = js.native
}

object ItemStyleBarBorderWidth {
  @scala.inline
  def apply(): ItemStyleBarBorderWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStyleBarBorderWidth]
  }
  @scala.inline
  implicit class ItemStyleBarBorderWidthOps[Self <: ItemStyleBarBorderWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemStyle(value: BarBorderWidth): Self = {
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
  }
  
}

