package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsInsightsFeedResponseData extends js.Object {
  var user: PostsInsightsFeedResponseUser = js.native
}

object PostsInsightsFeedResponseData {
  @scala.inline
  def apply(user: PostsInsightsFeedResponseUser): PostsInsightsFeedResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseData]
  }
  @scala.inline
  implicit class PostsInsightsFeedResponseDataOps[Self <: PostsInsightsFeedResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUser(value: PostsInsightsFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

