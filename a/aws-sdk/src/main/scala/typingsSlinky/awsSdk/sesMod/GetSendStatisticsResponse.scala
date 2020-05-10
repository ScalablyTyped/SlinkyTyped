package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSendStatisticsResponse extends js.Object {
  /**
    * A list of data points, each of which represents 15 minutes of activity.
    */
  var SendDataPoints: js.UndefOr[SendDataPointList] = js.native
}

object GetSendStatisticsResponse {
  @scala.inline
  def apply(): GetSendStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSendStatisticsResponse]
  }
  @scala.inline
  implicit class GetSendStatisticsResponseOps[Self <: GetSendStatisticsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSendDataPoints(value: SendDataPointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendDataPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendDataPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendDataPoints")(js.undefined)
        ret
    }
  }
  
}

