package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticipantTimelineData extends js.Object {
  var tenToTwenty: Double = js.native
  var thirtyToEnd: Double = js.native
  var twentyToThirty: Double = js.native
  var zeroToTen: Double = js.native
}

object ParticipantTimelineData {
  @scala.inline
  def apply(tenToTwenty: Double, thirtyToEnd: Double, twentyToThirty: Double, zeroToTen: Double): ParticipantTimelineData = {
    val __obj = js.Dynamic.literal(tenToTwenty = tenToTwenty.asInstanceOf[js.Any], thirtyToEnd = thirtyToEnd.asInstanceOf[js.Any], twentyToThirty = twentyToThirty.asInstanceOf[js.Any], zeroToTen = zeroToTen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantTimelineData]
  }
  @scala.inline
  implicit class ParticipantTimelineDataOps[Self <: ParticipantTimelineData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTenToTwenty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenToTwenty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThirtyToEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirtyToEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwentyToThirty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twentyToThirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroToTen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroToTen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

