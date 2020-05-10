package typingsSlinky.instagramPrivateApi.locationRepositoryStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationRepositoryStoryResponseRootObject extends js.Object {
  var status: String = js.native
  var story: LocationRepositoryStoryResponseStory = js.native
}

object LocationRepositoryStoryResponseRootObject {
  @scala.inline
  def apply(status: String, story: LocationRepositoryStoryResponseStory): LocationRepositoryStoryResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseRootObject]
  }
  @scala.inline
  implicit class LocationRepositoryStoryResponseRootObjectOps[Self <: LocationRepositoryStoryResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory(value: LocationRepositoryStoryResponseStory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

