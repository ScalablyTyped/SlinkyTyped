package typingsSlinky.firefoxWebextBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details about the format, quality, area and scale of the capture. */
@js.native
trait ImageDetails extends js.Object {
  
  /** The format of the resulting image. Default is `"jpeg"`. */
  var format: js.UndefOr[ImageFormat] = js.native
  
  /**
    * When format is `"jpeg"`, controls the quality of the resulting image. This value is ignored for PNG images. As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed to store it will decrease.
    */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * The area of the document to capture, in CSS pixels, relative to the page. If omitted, capture the visible viewport.
    */
  var rect: js.UndefOr[ImageDetailsRect] = js.native
  
  /** The scale of the resulting image. Defaults to `devicePixelRatio`. */
  var scale: js.UndefOr[Double] = js.native
}
object ImageDetails {
  
  @scala.inline
  def apply(): ImageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDetails]
  }
  
  @scala.inline
  implicit class ImageDetailsOps[Self <: ImageDetails] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: ImageFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setRect(value: ImageDetailsRect): Self = this.set("rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
