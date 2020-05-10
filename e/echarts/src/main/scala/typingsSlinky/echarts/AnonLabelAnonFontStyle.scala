package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabelAnonFontStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis.label
    */
  var label: js.UndefOr[AnonFontStyle] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.native
}

object AnonLabelAnonFontStyle {
  @scala.inline
  def apply(): AnonLabelAnonFontStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLabelAnonFontStyle]
  }
  @scala.inline
  implicit class AnonLabelAnonFontStyleOps[Self <: AnonLabelAnonFontStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLineStyle(value: AnonShadowBlur): Self = {
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

