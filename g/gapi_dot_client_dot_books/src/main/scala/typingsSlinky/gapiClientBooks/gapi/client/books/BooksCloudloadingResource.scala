package typingsSlinky.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooksCloudloadingResource extends js.Object {
  
  var author: js.UndefOr[String] = js.native
  
  var processingState: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var volumeId: js.UndefOr[String] = js.native
}
object BooksCloudloadingResource {
  
  @scala.inline
  def apply(): BooksCloudloadingResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooksCloudloadingResource]
  }
  
  @scala.inline
  implicit class BooksCloudloadingResourceOps[Self <: BooksCloudloadingResource] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setProcessingState(value: String): Self = this.set("processingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingState: Self = this.set("processingState", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
}
