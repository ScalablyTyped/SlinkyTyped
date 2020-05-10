package typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoriesInsightsFeedResponseEdgesItem extends js.Object {
  var cursor: Null = js.native
  var node: StoriesInsightsFeedResponseNode = js.native
}

object StoriesInsightsFeedResponseEdgesItem {
  @scala.inline
  def apply(cursor: Null, node: StoriesInsightsFeedResponseNode): StoriesInsightsFeedResponseEdgesItem = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseEdgesItem]
  }
  @scala.inline
  implicit class StoriesInsightsFeedResponseEdgesItemOps[Self <: StoriesInsightsFeedResponseEdgesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: StoriesInsightsFeedResponseNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

