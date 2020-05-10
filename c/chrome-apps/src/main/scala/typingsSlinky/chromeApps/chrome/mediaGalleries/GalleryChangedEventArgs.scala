package typingsSlinky.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GalleryChangedEventArgs extends js.Object {
  var galleryId: String = js.native
  var `type`: GalleryChangedType = js.native
}

object GalleryChangedEventArgs {
  @scala.inline
  def apply(galleryId: String, `type`: GalleryChangedType): GalleryChangedEventArgs = {
    val __obj = js.Dynamic.literal(galleryId = galleryId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryChangedEventArgs]
  }
  @scala.inline
  implicit class GalleryChangedEventArgsOps[Self <: GalleryChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGalleryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: GalleryChangedType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

