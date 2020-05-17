package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pubnub.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HereNowResponse extends js.Object {
  var channels: StringDictionary[Name] = js.native
  var totalChannels: Double = js.native
  var totalOccupancy: Double = js.native
}

object HereNowResponse {
  @scala.inline
  def apply(channels: StringDictionary[Name], totalChannels: Double, totalOccupancy: Double): HereNowResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], totalChannels = totalChannels.asInstanceOf[js.Any], totalOccupancy = totalOccupancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HereNowResponse]
  }
  @scala.inline
  implicit class HereNowResponseOps[Self <: HereNowResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: StringDictionary[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalOccupancy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalOccupancy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

