package typingsSlinky.mergeImages.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var Canvas: js.UndefOr[js.Any] = js.native
  
  var Image: js.UndefOr[js.Any] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCanvas(value: js.Any): Self = this.set("Canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvas: Self = this.set("Canvas", js.undefined)
    
    @scala.inline
    def setImage(value: js.Any): Self = this.set("Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("Image", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
