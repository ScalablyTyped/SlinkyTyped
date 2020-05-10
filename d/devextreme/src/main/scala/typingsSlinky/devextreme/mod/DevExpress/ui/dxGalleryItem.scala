package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxGalleryItem extends CollectionWidgetItem {
  /** Specifies the text passed to the alt attribute of the image markup element. */
  var imageAlt: js.UndefOr[String] = js.native
  /** Specifies the URL of the image displayed by the item. */
  var imageSrc: js.UndefOr[String] = js.native
}

object dxGalleryItem {
  @scala.inline
  def apply(): dxGalleryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGalleryItem]
  }
  @scala.inline
  implicit class dxGalleryItemOps[Self <: dxGalleryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSrc")(js.undefined)
        ret
    }
  }
  
}

