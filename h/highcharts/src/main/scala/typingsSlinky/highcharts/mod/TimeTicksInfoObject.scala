package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeTicksInfoObject extends TimeNormalizedObject {
  var higherRanks: js.Array[String] = js.native
  var totalRange: Double = js.native
}

object TimeTicksInfoObject {
  @scala.inline
  def apply(count: Double, higherRanks: js.Array[String], totalRange: Double, unitRange: Double): TimeTicksInfoObject = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], higherRanks = higherRanks.asInstanceOf[js.Any], totalRange = totalRange.asInstanceOf[js.Any], unitRange = unitRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeTicksInfoObject]
  }
  @scala.inline
  implicit class TimeTicksInfoObjectOps[Self <: TimeTicksInfoObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHigherRanks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherRanks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

