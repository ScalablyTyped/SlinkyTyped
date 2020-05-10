package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAreaColorAnonBorderType extends js.Object {
  /**
    * Color of the area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[AnonBorderType] = js.native
}

object AnonAreaColorAnonBorderType {
  @scala.inline
  def apply(): AnonAreaColorAnonBorderType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAreaColorAnonBorderType]
  }
  @scala.inline
  implicit class AnonAreaColorAnonBorderTypeOps[Self <: AnonAreaColorAnonBorderType] (val x: Self) extends AnyVal {
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
  }
  
}

