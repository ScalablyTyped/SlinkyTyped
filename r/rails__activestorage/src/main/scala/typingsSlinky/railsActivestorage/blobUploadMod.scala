package typingsSlinky.railsActivestorage

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.railsActivestorage.anon.DirectUploadData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rails/activestorage/src/blob_upload", JSImport.Namespace)
@js.native
object blobUploadMod extends js.Object {
  
  @js.native
  class BlobUpload protected () extends js.Object {
    def this(blob: DirectUploadData) = this()
    
    def create(callback: js.Function2[/* error */ js.Error, /* blob */ Blob, Unit]): Unit = js.native
    
    var xhr: XMLHttpRequest = js.native
  }
}
