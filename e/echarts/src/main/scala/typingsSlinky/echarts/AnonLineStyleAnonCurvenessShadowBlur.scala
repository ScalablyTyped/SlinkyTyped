package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLineStyleAnonCurvenessShadowBlur extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonCurvenessShadowBlur] = js.native
}

object AnonLineStyleAnonCurvenessShadowBlur {
  @scala.inline
  def apply(): AnonLineStyleAnonCurvenessShadowBlur = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLineStyleAnonCurvenessShadowBlur]
  }
  @scala.inline
  implicit class AnonLineStyleAnonCurvenessShadowBlurOps[Self <: AnonLineStyleAnonCurvenessShadowBlur] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withLineStyle(value: AnonCurvenessShadowBlur): Self = {
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

