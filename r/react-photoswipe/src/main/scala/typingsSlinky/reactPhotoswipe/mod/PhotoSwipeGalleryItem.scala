package typingsSlinky.reactPhotoswipe.mod

import typingsSlinky.photoswipe.mod.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotoSwipeGalleryItem extends Item {
  var thumbnail: String = js.native
}

object PhotoSwipeGalleryItem {
  @scala.inline
  def apply(thumbnail: String): PhotoSwipeGalleryItem = {
    val __obj = js.Dynamic.literal(thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoSwipeGalleryItem]
  }
  @scala.inline
  implicit class PhotoSwipeGalleryItemOps[Self <: PhotoSwipeGalleryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThumbnail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

