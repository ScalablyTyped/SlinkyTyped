package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorString extends js.Object {
  /**
    * The color of a node. It use global palette
    * [option.color](https://echarts.apache.org/en/option.html#color)
    * by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.itemStyle.color
    */
  var color: js.UndefOr[String] = js.native
}

object ColorString {
  @scala.inline
  def apply(): ColorString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorString]
  }
  @scala.inline
  implicit class ColorStringOps[Self <: ColorString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
  }
  
}

