package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.jpeg
import typingsSlinky.plotlyJs.plotlyJsStrings.png
import typingsSlinky.plotlyJs.plotlyJsStrings.svg
import typingsSlinky.plotlyJs.plotlyJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadImgopts extends js.Object {
  
  var filename: String = js.native
  
  var format: jpeg | png | webp | svg = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object DownloadImgopts {
  
  @scala.inline
  def apply(filename: String, format: jpeg | png | webp | svg, height: Double, width: Double): DownloadImgopts = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadImgopts]
  }
  
  @scala.inline
  implicit class DownloadImgoptsOps[Self <: DownloadImgopts] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: jpeg | png | webp | svg): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
