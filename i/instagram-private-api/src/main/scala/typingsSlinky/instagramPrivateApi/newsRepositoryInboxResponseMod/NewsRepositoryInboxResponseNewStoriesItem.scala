package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewsRepositoryInboxResponseNewStoriesItem extends js.Object {
  var args: NewsRepositoryInboxResponseArgs = js.native
  var counts: NewsRepositoryInboxResponseCounts = js.native
  var pk: String = js.native
  var story_type: Double = js.native
  var `type`: Double = js.native
}

object NewsRepositoryInboxResponseNewStoriesItem {
  @scala.inline
  def apply(
    args: NewsRepositoryInboxResponseArgs,
    counts: NewsRepositoryInboxResponseCounts,
    pk: String,
    story_type: Double,
    `type`: Double
  ): NewsRepositoryInboxResponseNewStoriesItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], counts = counts.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], story_type = story_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseNewStoriesItem]
  }
  @scala.inline
  implicit class NewsRepositoryInboxResponseNewStoriesItemOps[Self <: NewsRepositoryInboxResponseNewStoriesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: NewsRepositoryInboxResponseArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounts(value: NewsRepositoryInboxResponseCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

