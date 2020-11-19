package typingsSlinky.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadThumbnailOptions extends ThumbnailUrlOptions {
  
  var arrayBuffer: js.UndefOr[Boolean] = js.native
  
  var blob: js.UndefOr[Boolean] = js.native
  
  var buffer: js.UndefOr[Boolean] = js.native
}
object ReadThumbnailOptions {
  
  @scala.inline
  def apply(): ReadThumbnailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadThumbnailOptions]
  }
  
  @scala.inline
  implicit class ReadThumbnailOptionsOps[Self <: ReadThumbnailOptions] (val x: Self) extends AnyVal {
    
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
    def setArrayBuffer(value: Boolean): Self = this.set("arrayBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayBuffer: Self = this.set("arrayBuffer", js.undefined)
    
    @scala.inline
    def setBlob(value: Boolean): Self = this.set("blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlob: Self = this.set("blob", js.undefined)
    
    @scala.inline
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
  }
}
