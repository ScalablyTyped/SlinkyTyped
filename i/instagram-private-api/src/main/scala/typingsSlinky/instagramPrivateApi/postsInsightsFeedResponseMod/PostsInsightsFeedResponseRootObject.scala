package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsInsightsFeedResponseRootObject extends js.Object {
  var data: PostsInsightsFeedResponseData = js.native
}

object PostsInsightsFeedResponseRootObject {
  @scala.inline
  def apply(data: PostsInsightsFeedResponseData): PostsInsightsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseRootObject]
  }
  @scala.inline
  implicit class PostsInsightsFeedResponseRootObjectOps[Self <: PostsInsightsFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: PostsInsightsFeedResponseData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

