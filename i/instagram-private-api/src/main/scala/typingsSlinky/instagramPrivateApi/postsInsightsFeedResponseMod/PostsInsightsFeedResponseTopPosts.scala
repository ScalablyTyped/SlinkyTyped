package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsInsightsFeedResponseTopPosts extends js.Object {
  var edges: js.Array[PostsInsightsFeedResponseEdgesItem] = js.native
  var page_info: PostsInsightsFeedResponsePageInfo = js.native
}

object PostsInsightsFeedResponseTopPosts {
  @scala.inline
  def apply(edges: js.Array[PostsInsightsFeedResponseEdgesItem], page_info: PostsInsightsFeedResponsePageInfo): PostsInsightsFeedResponseTopPosts = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseTopPosts]
  }
  @scala.inline
  implicit class PostsInsightsFeedResponseTopPostsOps[Self <: PostsInsightsFeedResponseTopPosts] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPage_info(value: PostsInsightsFeedResponsePageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_info")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

