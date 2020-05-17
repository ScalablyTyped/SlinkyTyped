package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemStyleTextStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[TextStyle] = js.native
}

object ItemStyleTextStyle {
  @scala.inline
  def apply(): ItemStyleTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStyleTextStyle]
  }
  @scala.inline
  implicit class ItemStyleTextStyleOps[Self <: ItemStyleTextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemStyle(value: TextStyle): Self = {
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
  }
  
}

