package typingsSlinky.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Multipart extends js.Object {
  
  /** True if this endpoint supports upload multipart media. */
  var multipart: js.UndefOr[Boolean] = js.native
  
  /** The URI path to be used for upload. Should be used in conjunction with the basePath property at the api-level. */
  var path: js.UndefOr[String] = js.native
}
object Multipart {
  
  @scala.inline
  def apply(): Multipart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multipart]
  }
  
  @scala.inline
  implicit class MultipartOps[Self <: Multipart] (val x: Self) extends AnyVal {
    
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
    def setMultipart(value: Boolean): Self = this.set("multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipart: Self = this.set("multipart", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
