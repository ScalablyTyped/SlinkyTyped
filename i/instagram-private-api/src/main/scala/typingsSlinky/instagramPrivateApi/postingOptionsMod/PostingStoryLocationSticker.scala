package typingsSlinky.instagramPrivateApi.postingOptionsMod

import typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostingStoryLocationSticker extends js.Object {
  var latitude: String = js.native
  var longitude: String = js.native
  var sticker: StoryLocation = js.native
}

object PostingStoryLocationSticker {
  @scala.inline
  def apply(latitude: String, longitude: String, sticker: StoryLocation): PostingStoryLocationSticker = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], sticker = sticker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingStoryLocationSticker]
  }
  @scala.inline
  implicit class PostingStoryLocationStickerOps[Self <: PostingStoryLocationSticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSticker(value: StoryLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

