package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBarBorderWidth] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.emphasis.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.native
}

object AnonItemStyle {
  @scala.inline
  def apply(): AnonItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonItemStyle]
  }
  @scala.inline
  implicit class AnonItemStyleOps[Self <: AnonItemStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemStyle(value: AnonBarBorderWidth): Self = {
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
    def withLabel(value: AnonBorderRadius): Self = {
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

