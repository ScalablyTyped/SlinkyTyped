package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThumbnailSet extends Entity {
  
  // A 1920x1920 scaled thumbnail.
  var large: js.UndefOr[Thumbnail] = js.native
  
  // A 176x176 scaled thumbnail.
  var medium: js.UndefOr[Thumbnail] = js.native
  
  // A 48x48 cropped thumbnail.
  var small: js.UndefOr[Thumbnail] = js.native
  
  // A custom thumbnail image or the original image used to generate other thumbnails.
  var source: js.UndefOr[Thumbnail] = js.native
}
object ThumbnailSet {
  
  @scala.inline
  def apply(): ThumbnailSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailSet]
  }
  
  @scala.inline
  implicit class ThumbnailSetOps[Self <: ThumbnailSet] (val x: Self) extends AnyVal {
    
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
    def setLarge(value: Thumbnail): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setMedium(value: Thumbnail): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def setSmall(value: Thumbnail): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setSource(value: Thumbnail): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
