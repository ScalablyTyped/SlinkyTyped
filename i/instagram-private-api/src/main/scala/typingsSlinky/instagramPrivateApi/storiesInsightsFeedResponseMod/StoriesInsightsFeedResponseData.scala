package typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoriesInsightsFeedResponseData extends js.Object {
  var user: StoriesInsightsFeedResponseUser = js.native
}

object StoriesInsightsFeedResponseData {
  @scala.inline
  def apply(user: StoriesInsightsFeedResponseUser): StoriesInsightsFeedResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseData]
  }
  @scala.inline
  implicit class StoriesInsightsFeedResponseDataOps[Self <: StoriesInsightsFeedResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUser(value: StoriesInsightsFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

