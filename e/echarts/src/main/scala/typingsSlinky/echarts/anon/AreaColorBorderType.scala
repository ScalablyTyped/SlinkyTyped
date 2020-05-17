package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaColorBorderType extends js.Object {
  /**
    * Color of the area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[BorderType] = js.native
}

object AreaColorBorderType {
  @scala.inline
  def apply(): AreaColorBorderType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaColorBorderType]
  }
  @scala.inline
  implicit class AreaColorBorderTypeOps[Self <: AreaColorBorderType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaColor(value: BorderType): Self = {
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

