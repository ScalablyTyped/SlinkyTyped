package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemStyleLabel extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonShadowOffsetY] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.native
}

object AnonItemStyleLabel {
  @scala.inline
  def apply(): AnonItemStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonItemStyleLabel]
  }
  @scala.inline
  implicit class AnonItemStyleLabelOps[Self <: AnonItemStyleLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemStyle(value: AnonShadowOffsetY): Self = {
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

