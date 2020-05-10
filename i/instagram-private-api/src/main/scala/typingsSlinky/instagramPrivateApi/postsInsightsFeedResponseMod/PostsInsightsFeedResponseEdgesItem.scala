package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsInsightsFeedResponseEdgesItem extends js.Object {
  var cursor: js.UndefOr[String] = js.native
  var node: PostsInsightsFeedResponseNode = js.native
}

object PostsInsightsFeedResponseEdgesItem {
  @scala.inline
  def apply(node: PostsInsightsFeedResponseNode): PostsInsightsFeedResponseEdgesItem = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseEdgesItem]
  }
  @scala.inline
  implicit class PostsInsightsFeedResponseEdgesItemOps[Self <: PostsInsightsFeedResponseEdgesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: PostsInsightsFeedResponseNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
  }
  
}

