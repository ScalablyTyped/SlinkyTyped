package typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoriesInsightsFeedResponseBusinessManager extends js.Object {
  var stories_unit: StoriesInsightsFeedResponseStoriesUnit = js.native
}

object StoriesInsightsFeedResponseBusinessManager {
  @scala.inline
  def apply(stories_unit: StoriesInsightsFeedResponseStoriesUnit): StoriesInsightsFeedResponseBusinessManager = {
    val __obj = js.Dynamic.literal(stories_unit = stories_unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseBusinessManager]
  }
  @scala.inline
  implicit class StoriesInsightsFeedResponseBusinessManagerOps[Self <: StoriesInsightsFeedResponseBusinessManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStories_unit(value: StoriesInsightsFeedResponseStoriesUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories_unit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

