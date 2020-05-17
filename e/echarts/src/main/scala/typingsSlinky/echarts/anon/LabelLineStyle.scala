package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelLineStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis.label
    */
  var label: js.UndefOr[FontStyle] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
}

object LabelLineStyle {
  @scala.inline
  def apply(): LabelLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelLineStyle]
  }
  @scala.inline
  implicit class LabelLineStyleOps[Self <: LabelLineStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: FontStyle): Self = {
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

