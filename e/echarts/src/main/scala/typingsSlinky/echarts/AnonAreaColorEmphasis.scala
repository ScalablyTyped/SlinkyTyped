package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAreaColorEmphasis extends js.Object {
  /**
    * Area filling color.
    *
    *
    * @default
    * "#eee"
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[AnonBorderType] = js.native
  /**
    * Map area style in highlighted state.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle.emphasis
    */
  var emphasis: js.UndefOr[AnonAreaColor] = js.native
}

object AnonAreaColorEmphasis {
  @scala.inline
  def apply(): AnonAreaColorEmphasis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAreaColorEmphasis]
  }
  @scala.inline
  implicit class AnonAreaColorEmphasisOps[Self <: AnonAreaColorEmphasis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaColor(value: AnonBorderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEmphasis(value: AnonAreaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmphasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(js.undefined)
        ret
    }
  }
  
}

