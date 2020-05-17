package typingsSlinky.echarts.anon

import typingsSlinky.echarts.echarts.VisualMap.RangeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InRange extends js.Object {
  var inRange: js.UndefOr[RangeObject] = js.native
  var outOfRange: js.UndefOr[RangeObject] = js.native
}

object InRange {
  @scala.inline
  def apply(): InRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InRange]
  }
  @scala.inline
  implicit class InRangeOps[Self <: InRange] (val x: Self) extends AnyVal {
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

