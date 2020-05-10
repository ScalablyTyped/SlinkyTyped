package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStorystickerids extends js.Object {
  var story_sticker_ids: js.Any = js.native
}

object AnonStorystickerids {
  @scala.inline
  def apply(story_sticker_ids: js.Any): AnonStorystickerids = {
    val __obj = js.Dynamic.literal(story_sticker_ids = story_sticker_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStorystickerids]
  }
  @scala.inline
  implicit class AnonStorystickeridsOps[Self <: AnonStorystickerids] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStory_sticker_ids(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_sticker_ids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

