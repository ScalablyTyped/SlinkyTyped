package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitMultipartUploadOptions extends js.Object {
  
  var headers: js.UndefOr[js.Object] = js.native
  
   // Mime file type
  var meta: js.UndefOr[UserMeta] = js.native
  
  var mime: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object InitMultipartUploadOptions {
  
  @scala.inline
  def apply(): InitMultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitMultipartUploadOptions]
  }
  
  @scala.inline
  implicit class InitMultipartUploadOptionsOps[Self <: InitMultipartUploadOptions] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMeta(value: UserMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
