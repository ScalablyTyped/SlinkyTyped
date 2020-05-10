package typingsSlinky.activexPowerpoint

import typingsSlinky.activexPowerpoint.PowerPoint.SlideRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSldRange extends js.Object {
  val SldRange: SlideRange = js.native
}

object AnonSldRange {
  @scala.inline
  def apply(SldRange: SlideRange): AnonSldRange = {
    val __obj = js.Dynamic.literal(SldRange = SldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSldRange]
  }
  @scala.inline
  implicit class AnonSldRangeOps[Self <: AnonSldRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSldRange(value: SlideRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SldRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

