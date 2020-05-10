package typingsSlinky.echarts.echarts.EChartOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTextStyleWithRich extends js.Object {
  var rich: js.UndefOr[RichStyle] = js.native
}

object BaseTextStyleWithRich {
  @scala.inline
  def apply(): BaseTextStyleWithRich = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTextStyleWithRich]
  }
  @scala.inline
  implicit class BaseTextStyleWithRichOps[Self <: BaseTextStyleWithRich] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRich(value: RichStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rich")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRich: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rich")(js.undefined)
        ret
    }
  }
  
}

