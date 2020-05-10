package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel extends js.Object {
  var channel_id: String = js.native
  var id: String = js.native
  var tips: js.Array[_] = js.native
}

object InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel {
  @scala.inline
  def apply(channel_id: String, id: String, tips: js.Array[_]): InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel = {
    val __obj = js.Dynamic.literal(channel_id = channel_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseAymtInstagramAccountInsightsChannelOps[Self <: InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTips(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tips")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

