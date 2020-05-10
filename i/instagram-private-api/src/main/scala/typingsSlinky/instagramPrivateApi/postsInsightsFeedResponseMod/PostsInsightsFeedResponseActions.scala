package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsInsightsFeedResponseActions extends js.Object {
  var edges: js.Array[PostsInsightsFeedResponseEdgesItem] = js.native
}

object PostsInsightsFeedResponseActions {
  @scala.inline
  def apply(edges: js.Array[PostsInsightsFeedResponseEdgesItem]): PostsInsightsFeedResponseActions = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseActions]
  }
  @scala.inline
  implicit class PostsInsightsFeedResponseActionsOps[Self <: PostsInsightsFeedResponseActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdges(value: js.Array[PostsInsightsFeedResponseEdgesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

