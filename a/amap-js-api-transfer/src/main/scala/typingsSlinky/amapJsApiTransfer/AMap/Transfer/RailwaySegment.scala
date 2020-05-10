package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.RAILWAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RailwaySegment
  extends SegmentCommon
     with Segment {
  /**
    * 此换乘段导航信息
    */
  var transit: RailwayDetails = js.native
  /**
    * 换乘动作类型
    */
  var transit_mode: RAILWAY = js.native
}

object RailwaySegment {
  @scala.inline
  def apply(
    distance: Double,
    instruction: String,
    time: Double,
    transit: RailwayDetails,
    transit_mode: RAILWAY
  ): RailwaySegment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailwaySegment]
  }
  @scala.inline
  implicit class RailwaySegmentOps[Self <: RailwaySegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransit(value: RailwayDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransit_mode(value: RAILWAY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit_mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

