package typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryLocation extends StorySticker {
  var is_sticker: Boolean = js.native
  var location_id: String = js.native
}

object StoryLocation {
  @scala.inline
  def apply(
    height: Double,
    is_sticker: Boolean,
    location_id: String,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): StoryLocation = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], location_id = location_id.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryLocation]
  }
  @scala.inline
  implicit class StoryLocationOps[Self <: StoryLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_sticker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_sticker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

