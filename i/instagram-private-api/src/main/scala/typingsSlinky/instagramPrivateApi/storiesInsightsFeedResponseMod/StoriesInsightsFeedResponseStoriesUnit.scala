package typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoriesInsightsFeedResponseStoriesUnit extends js.Object {
  var stories: StoriesInsightsFeedResponseStories = js.native
}

object StoriesInsightsFeedResponseStoriesUnit {
  @scala.inline
  def apply(stories: StoriesInsightsFeedResponseStories): StoriesInsightsFeedResponseStoriesUnit = {
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseStoriesUnit]
  }
  @scala.inline
  implicit class StoriesInsightsFeedResponseStoriesUnitOps[Self <: StoriesInsightsFeedResponseStoriesUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStories(value: StoriesInsightsFeedResponseStories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

