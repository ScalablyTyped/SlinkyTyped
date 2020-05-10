package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemStyleAnonBorderColor0 extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColor0] = js.native
}

object AnonItemStyleAnonBorderColor0 {
  @scala.inline
  def apply(): AnonItemStyleAnonBorderColor0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonItemStyleAnonBorderColor0]
  }
  @scala.inline
  implicit class AnonItemStyleAnonBorderColor0Ops[Self <: AnonItemStyleAnonBorderColor0] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemStyle(value: AnonBorderColor0): Self = {
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

