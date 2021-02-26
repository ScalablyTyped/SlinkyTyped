package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileInfo extends StObject {
  
  /** The MIME type of the file.Defaults to the value from Google Cloud Storage. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** The SHA1 hash of the file, in hex. */
  var sha1Sum: js.UndefOr[String] = js.native
  
  /** URL source to use to fetch this file. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com//'. */
  var sourceUrl: js.UndefOr[String] = js.native
}
object FileInfo {
  
  @scala.inline
  def apply(): FileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileInfo]
  }
  
  @scala.inline
  implicit class FileInfoMutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setSha1Sum(value: String): Self = StObject.set(x, "sha1Sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1SumUndefined: Self = StObject.set(x, "sha1Sum", js.undefined)
    
    @scala.inline
    def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
  }
}
