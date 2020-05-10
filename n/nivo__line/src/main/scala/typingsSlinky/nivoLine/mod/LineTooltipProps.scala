package typingsSlinky.nivoLine.mod

import typingsSlinky.nivoLine.AnonBorderColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineTooltipProps extends js.Object {
  var point: AnonBorderColor = js.native
}

object LineTooltipProps {
  @scala.inline
  def apply(point: AnonBorderColor): LineTooltipProps = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineTooltipProps]
  }
  @scala.inline
  implicit class LineTooltipPropsOps[Self <: LineTooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoint(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

