package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsInsightsFeedResponseProfileActions extends js.Object {
  var actions: PostsInsightsFeedResponseActions = js.native
}

object PostsInsightsFeedResponseProfileActions {
  @scala.inline
  def apply(actions: PostsInsightsFeedResponseActions): PostsInsightsFeedResponseProfileActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseProfileActions]
  }
  @scala.inline
  implicit class PostsInsightsFeedResponseProfileActionsOps[Self <: PostsInsightsFeedResponseProfileActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: PostsInsightsFeedResponseActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

