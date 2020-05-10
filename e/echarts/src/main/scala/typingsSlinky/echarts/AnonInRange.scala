package typingsSlinky.echarts

import typingsSlinky.echarts.echarts.VisualMap.RangeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInRange extends js.Object {
  var inRange: js.UndefOr[RangeObject] = js.native
  var outOfRange: js.UndefOr[RangeObject] = js.native
}

object AnonInRange {
  @scala.inline
  def apply(): AnonInRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInRange]
  }
  @scala.inline
  implicit class AnonInRangeOps[Self <: AnonInRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInRange(value: RangeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRange")(js.undefined)
        ret
    }
    @scala.inline
    def withOutOfRange(value: RangeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutOfRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfRange")(js.undefined)
        ret
    }
  }
  
}

