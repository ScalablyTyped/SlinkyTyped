package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.BUS
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.METRO_RAIL
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.SUBWAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitSegment
  extends SegmentCommon
     with Segment {
  /**
    * 此换乘段导航信息
    */
  var transit: TransitDetails = js.native
  /**
    * 换乘动作类型
    */
  var transit_mode: SUBWAY | METRO_RAIL | BUS = js.native
}

object TransitSegment {
  @scala.inline
  def apply(
    distance: Double,
    instruction: String,
    time: Double,
    transit: TransitDetails,
    transit_mode: SUBWAY | METRO_RAIL | BUS
  ): TransitSegment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitSegment]
  }
  @scala.inline
  implicit class TransitSegmentOps[Self <: TransitSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransit(value: TransitDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransit_mode(value: SUBWAY | METRO_RAIL | BUS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit_mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

