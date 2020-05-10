package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.PartialGaugeLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaugeBar extends js.Object {
  var color: Color = js.native
  var line: PartialGaugeLine = js.native
  var thickness: Double = js.native
}

object GaugeBar {
  @scala.inline
  def apply(color: Color, line: PartialGaugeLine, thickness: Double): GaugeBar = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeBar]
  }
  @scala.inline
  implicit class GaugeBarOps[Self <: GaugeBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: PartialGaugeLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

