package typingsSlinky.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataBlobstore2Info extends StObject {
  
  /** gdata */
  var blobGeneration: js.UndefOr[String] = js.native
  
  /** gdata */
  var blobId: js.UndefOr[String] = js.native
  
  /** gdata */
  var downloadReadHandle: js.UndefOr[String] = js.native
  
  /** gdata */
  var readToken: js.UndefOr[String] = js.native
  
  /** gdata */
  var uploadMetadataContainer: js.UndefOr[String] = js.native
}
object GdataBlobstore2Info {
  
  @scala.inline
  def apply(): GdataBlobstore2Info = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataBlobstore2Info]
  }
  
  @scala.inline
  implicit class GdataBlobstore2InfoMutableBuilder[Self <: GdataBlobstore2Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobGeneration(value: String): Self = StObject.set(x, "blobGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobGenerationUndefined: Self = StObject.set(x, "blobGeneration", js.undefined)
    
    @scala.inline
    def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
    
    @scala.inline
    def setDownloadReadHandle(value: String): Self = StObject.set(x, "downloadReadHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadReadHandleUndefined: Self = StObject.set(x, "downloadReadHandle", js.undefined)
    
    @scala.inline
    def setReadToken(value: String): Self = StObject.set(x, "readToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTokenUndefined: Self = StObject.set(x, "readToken", js.undefined)
    
    @scala.inline
    def setUploadMetadataContainer(value: String): Self = StObject.set(x, "uploadMetadataContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadMetadataContainerUndefined: Self = StObject.set(x, "uploadMetadataContainer", js.undefined)
  }
}
