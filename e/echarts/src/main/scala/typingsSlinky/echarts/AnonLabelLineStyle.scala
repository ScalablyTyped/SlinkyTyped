package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabelLineStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis.label
    */
  var label: js.UndefOr[AnonFontStyle] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.native
}

object AnonLabelLineStyle {
  @scala.inline
  def apply(): AnonLabelLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLabelLineStyle]
  }
  @scala.inline
  implicit class AnonLabelLineStyleOps[Self <: AnonLabelLineStyle] (val x: Self) extends AnyVal {
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

