package typingsSlinky.instagramPrivateApi.insightsServiceStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceStoryResponseData extends js.Object {
  var media: InsightsServiceStoryResponseMedia = js.native
}

object InsightsServiceStoryResponseData {
  @scala.inline
  def apply(media: InsightsServiceStoryResponseMedia): InsightsServiceStoryResponseData = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceStoryResponseData]
  }
  @scala.inline
  implicit class InsightsServiceStoryResponseDataOps[Self <: InsightsServiceStoryResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedia(value: InsightsServiceStoryResponseMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

