package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseOldStoriesItem extends js.Object {
  
  var args: NewsRepositoryInboxResponseArgs = js.native
  
  var counts: NewsRepositoryInboxResponseCounts = js.native
  
  var pk: js.UndefOr[String] = js.native
  
  var story_type: Double = js.native
  
  var `type`: Double = js.native
}
object NewsRepositoryInboxResponseOldStoriesItem {
  
  @scala.inline
  def apply(
    args: NewsRepositoryInboxResponseArgs,
    counts: NewsRepositoryInboxResponseCounts,
    story_type: Double,
    `type`: Double
  ): NewsRepositoryInboxResponseOldStoriesItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], counts = counts.asInstanceOf[js.Any], story_type = story_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseOldStoriesItem]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseOldStoriesItemOps[Self <: NewsRepositoryInboxResponseOldStoriesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgs(value: NewsRepositoryInboxResponseArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounts(value: NewsRepositoryInboxResponseCounts): Self = this.set("counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_type(value: Double): Self = this.set("story_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePk: Self = this.set("pk", js.undefined)
  }
}
