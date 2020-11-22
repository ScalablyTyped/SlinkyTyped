package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestAccessData extends js.Object {
  
  /** A concurrent access response. */
  var concurrentAccess: js.UndefOr[ConcurrentAccessRestriction] = js.native
  
  /** A download access response. */
  var downloadAccess: js.UndefOr[DownloadAccessRestriction] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
}
object RequestAccessData {
  
  @scala.inline
  def apply(): RequestAccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestAccessData]
  }
  
  @scala.inline
  implicit class RequestAccessDataOps[Self <: RequestAccessData] (val x: Self) extends AnyVal {
    
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
    def setConcurrentAccess(value: ConcurrentAccessRestriction): Self = this.set("concurrentAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrentAccess: Self = this.set("concurrentAccess", js.undefined)
    
    @scala.inline
    def setDownloadAccess(value: DownloadAccessRestriction): Self = this.set("downloadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadAccess: Self = this.set("downloadAccess", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
