package typingsSlinky.reactImageGallery.mod

import slinky.core.TagMod
import typingsSlinky.reactImageGallery.AnonCurrentIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactImageGalleryItem extends js.Object {
  var bulletClass: js.UndefOr[String] = js.native
  var bulletOnClick: js.UndefOr[js.Function1[/* hasItemItemIndexCurrentIndex */ AnonCurrentIndex, Unit]] = js.native
  var description: js.UndefOr[String] = js.native
  var fullscreen: js.UndefOr[String] = js.native
  var original: js.UndefOr[String] = js.native
  var originalAlt: js.UndefOr[String] = js.native
  var originalClass: js.UndefOr[String] = js.native
  var originalTitle: js.UndefOr[String] = js.native
  var renderItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[this.type], TagMod[Any]]] = js.native
  var renderThumbInner: js.UndefOr[js.Function1[/* item */ js.UndefOr[this.type], TagMod[Any]]] = js.native
  var sizes: js.UndefOr[String] = js.native
  var srcSet: js.UndefOr[String] = js.native
  var thumbnail: js.UndefOr[String] = js.native
  var thumbnailAlt: js.UndefOr[String] = js.native
  var thumbnailClass: js.UndefOr[String] = js.native
  var thumbnailLabel: js.UndefOr[String] = js.native
  var thumbnailTitle: js.UndefOr[String] = js.native
}

object ReactImageGalleryItem {
  @scala.inline
  def apply(): ReactImageGalleryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactImageGalleryItem]
  }
  @scala.inline
  implicit class ReactImageGalleryItemOps[Self <: ReactImageGalleryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBulletOnClick(value: /* hasItemItemIndexCurrentIndex */ AnonCurrentIndex => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletOnClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBulletOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalClass")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderItem(value: /* item */ js.UndefOr[ReactImageGalleryItem] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderThumbInner(value: /* item */ js.UndefOr[ReactImageGalleryItem] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumbInner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderThumbInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderThumbInner")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcSet")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailClass")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailTitle")(js.undefined)
        ret
    }
  }
  
}

