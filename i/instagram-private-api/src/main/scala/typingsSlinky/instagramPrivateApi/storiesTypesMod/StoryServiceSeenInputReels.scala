package typingsSlinky.instagramPrivateApi.storiesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryServiceSeenInputReels extends StoryServiceInput {
  var items: js.Array[StoryServiceSeenInputItems] = js.native
}

object StoryServiceSeenInputReels {
  @scala.inline
  def apply(items: js.Array[StoryServiceSeenInputItems]): StoryServiceSeenInputReels = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryServiceSeenInputReels]
  }
  @scala.inline
  implicit class StoryServiceSeenInputReelsOps[Self <: StoryServiceSeenInputReels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[StoryServiceSeenInputItems]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

