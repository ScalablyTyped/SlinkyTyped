package typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoriesInsightsFeedResponseStories extends js.Object {
  var edges: js.Array[StoriesInsightsFeedResponseEdgesItem] = js.native
  var page_info: StoriesInsightsFeedResponsePageInfo = js.native
}

object StoriesInsightsFeedResponseStories {
  @scala.inline
  def apply(
    edges: js.Array[StoriesInsightsFeedResponseEdgesItem],
    page_info: StoriesInsightsFeedResponsePageInfo
  ): StoriesInsightsFeedResponseStories = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseStories]
  }
  @scala.inline
  implicit class StoriesInsightsFeedResponseStoriesOps[Self <: StoriesInsightsFeedResponseStories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdges(value: js.Array[StoriesInsightsFeedResponseEdgesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_info(value: StoriesInsightsFeedResponsePageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_info")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

