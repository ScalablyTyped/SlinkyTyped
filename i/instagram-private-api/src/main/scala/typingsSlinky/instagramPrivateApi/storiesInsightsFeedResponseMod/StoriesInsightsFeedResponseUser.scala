package typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoriesInsightsFeedResponseUser extends js.Object {
  var business_manager: StoriesInsightsFeedResponseBusinessManager = js.native
  var id: String = js.native
}

object StoriesInsightsFeedResponseUser {
  @scala.inline
  def apply(business_manager: StoriesInsightsFeedResponseBusinessManager, id: String): StoriesInsightsFeedResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseUser]
  }
  @scala.inline
  implicit class StoriesInsightsFeedResponseUserOps[Self <: StoriesInsightsFeedResponseUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusiness_manager(value: StoriesInsightsFeedResponseBusinessManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

