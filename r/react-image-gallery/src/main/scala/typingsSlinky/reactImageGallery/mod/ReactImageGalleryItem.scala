package typingsSlinky.reactImageGallery.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactImageGallery.anon.CurrentIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactImageGalleryItem extends js.Object {
  
  var bulletClass: js.UndefOr[String] = js.native
  
  var bulletOnClick: js.UndefOr[js.Function1[/* hasItemItemIndexCurrentIndex */ CurrentIndex, Unit]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var fullscreen: js.UndefOr[String] = js.native
  
  var original: js.UndefOr[String] = js.native
  
  var originalAlt: js.UndefOr[String] = js.native
  
  var originalClass: js.UndefOr[String] = js.native
  
  var originalTitle: js.UndefOr[String] = js.native
  
  var renderItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[this.type], ReactElement]] = js.native
  
  var renderThumbInner: js.UndefOr[js.Function1[/* item */ js.UndefOr[this.type], ReactElement]] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBulletClass(value: String): Self = this.set("bulletClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletClass: Self = this.set("bulletClass", js.undefined)
    
    @scala.inline
    def setBulletOnClick(value: /* hasItemItemIndexCurrentIndex */ CurrentIndex => Unit): Self = this.set("bulletOnClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBulletOnClick: Self = this.set("bulletOnClick", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFullscreen(value: String): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setOriginal(value: String): Self = this.set("original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginal: Self = this.set("original", js.undefined)
    
    @scala.inline
    def setOriginalAlt(value: String): Self = this.set("originalAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalAlt: Self = this.set("originalAlt", js.undefined)
    
    @scala.inline
    def setOriginalClass(value: String): Self = this.set("originalClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalClass: Self = this.set("originalClass", js.undefined)
    
    @scala.inline
    def setOriginalTitle(value: String): Self = this.set("originalTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalTitle: Self = this.set("originalTitle", js.undefined)
    
    @scala.inline
    def setRenderItem(value: /* item */ js.UndefOr[ReactImageGalleryItem] => ReactElement): Self = this.set("renderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
    
    @scala.inline
    def setRenderThumbInner(value: /* item */ js.UndefOr[ReactImageGalleryItem] => ReactElement): Self = this.set("renderThumbInner", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderThumbInner: Self = this.set("renderThumbInner", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setSrcSet(value: String): Self = this.set("srcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcSet: Self = this.set("srcSet", js.undefined)
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setThumbnailAlt(value: String): Self = this.set("thumbnailAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailAlt: Self = this.set("thumbnailAlt", js.undefined)
    
    @scala.inline
    def setThumbnailClass(value: String): Self = this.set("thumbnailClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailClass: Self = this.set("thumbnailClass", js.undefined)
    
    @scala.inline
    def setThumbnailLabel(value: String): Self = this.set("thumbnailLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailLabel: Self = this.set("thumbnailLabel", js.undefined)
    
    @scala.inline
    def setThumbnailTitle(value: String): Self = this.set("thumbnailTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailTitle: Self = this.set("thumbnailTitle", js.undefined)
  }
}
