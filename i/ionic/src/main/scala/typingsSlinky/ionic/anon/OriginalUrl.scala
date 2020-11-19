package typingsSlinky.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalUrl extends js.Object {
  
  var originalUrl: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object OriginalUrl {
  
  @scala.inline
  def apply(): OriginalUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginalUrl]
  }
  
  @scala.inline
  implicit class OriginalUrlOps[Self <: OriginalUrl] (val x: Self) extends AnyVal {
    
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
    def setOriginalUrl(value: String): Self = this.set("originalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalUrl: Self = this.set("originalUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
