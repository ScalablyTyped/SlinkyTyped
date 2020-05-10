package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemStyleAnonTextStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonTextStyle] = js.native
}

object AnonItemStyleAnonTextStyle {
  @scala.inline
  def apply(): AnonItemStyleAnonTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonItemStyleAnonTextStyle]
  }
  @scala.inline
  implicit class AnonItemStyleAnonTextStyleOps[Self <: AnonItemStyleAnonTextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemStyle(value: AnonTextStyle): Self = {
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

