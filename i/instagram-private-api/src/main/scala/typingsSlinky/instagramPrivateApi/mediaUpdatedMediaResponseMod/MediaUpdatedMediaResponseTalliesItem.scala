package typingsSlinky.instagramPrivateApi.mediaUpdatedMediaResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaUpdatedMediaResponseTalliesItem extends js.Object {
  var count: Double = js.native
  var font_size: Double = js.native
  var text: String = js.native
}

object MediaUpdatedMediaResponseTalliesItem {
  @scala.inline
  def apply(count: Double, font_size: Double, text: String): MediaUpdatedMediaResponseTalliesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], font_size = font_size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaUpdatedMediaResponseTalliesItem]
  }
  @scala.inline
  implicit class MediaUpdatedMediaResponseTalliesItemOps[Self <: MediaUpdatedMediaResponseTalliesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

