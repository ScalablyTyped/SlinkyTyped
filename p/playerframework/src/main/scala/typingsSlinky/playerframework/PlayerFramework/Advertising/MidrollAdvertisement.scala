package typingsSlinky.playerframework.PlayerFramework.Advertising

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MidrollAdvertisement extends AdvertisementBase {
  var time: Double = js.native
  var timePercentage: Double = js.native
}

object MidrollAdvertisement {
  @scala.inline
  def apply(source: js.Any, time: Double, timePercentage: Double): MidrollAdvertisement = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timePercentage = timePercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidrollAdvertisement]
  }
  @scala.inline
  implicit class MidrollAdvertisementOps[Self <: MidrollAdvertisement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimePercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePercentage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

