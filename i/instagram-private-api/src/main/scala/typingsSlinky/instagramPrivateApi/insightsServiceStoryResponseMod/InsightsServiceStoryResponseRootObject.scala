package typingsSlinky.instagramPrivateApi.insightsServiceStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceStoryResponseRootObject extends js.Object {
  var data: InsightsServiceStoryResponseData = js.native
}

object InsightsServiceStoryResponseRootObject {
  @scala.inline
  def apply(data: InsightsServiceStoryResponseData): InsightsServiceStoryResponseRootObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceStoryResponseRootObject]
  }
  @scala.inline
  implicit class InsightsServiceStoryResponseRootObjectOps[Self <: InsightsServiceStoryResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: InsightsServiceStoryResponseData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

