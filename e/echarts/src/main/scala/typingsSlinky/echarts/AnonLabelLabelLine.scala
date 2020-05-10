package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabelLabelLine extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.label
    */
  var label: js.UndefOr[AnonPadding] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine
    */
  var labelLine: js.UndefOr[AnonLength] = js.native
}

object AnonLabelLabelLine {
  @scala.inline
  def apply(): AnonLabelLabelLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLabelLabelLine]
  }
  @scala.inline
  implicit class AnonLabelLabelLineOps[Self <: AnonLabelLabelLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemStyle(value: AnonBorderType): Self = {
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
    def withLabel(value: AnonPadding): Self = {
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
    def withLabelLine(value: AnonLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLine")(js.undefined)
        ret
    }
  }
  
}

