package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLineStyleAnonCurvenessOpacity extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonCurvenessOpacity] = js.native
}

object AnonLineStyleAnonCurvenessOpacity {
  @scala.inline
  def apply(): AnonLineStyleAnonCurvenessOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLineStyleAnonCurvenessOpacity]
  }
  @scala.inline
  implicit class AnonLineStyleAnonCurvenessOpacityOps[Self <: AnonLineStyleAnonCurvenessOpacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineStyle(value: AnonCurvenessOpacity): Self = {
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

