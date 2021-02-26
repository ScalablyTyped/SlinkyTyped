package typingsSlinky.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateDocumentVersionUploadResponse extends StObject {
  
  /**
    * The document metadata.
    */
  var Metadata: js.UndefOr[DocumentMetadata] = js.native
  
  /**
    * The upload metadata.
    */
  var UploadMetadata: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.UploadMetadata] = js.native
}
object InitiateDocumentVersionUploadResponse {
  
  @scala.inline
  def apply(): InitiateDocumentVersionUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateDocumentVersionUploadResponse]
  }
  
  @scala.inline
  implicit class InitiateDocumentVersionUploadResponseMutableBuilder[Self <: InitiateDocumentVersionUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: DocumentMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setUploadMetadata(value: UploadMetadata): Self = StObject.set(x, "UploadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadMetadataUndefined: Self = StObject.set(x, "UploadMetadata", js.undefined)
  }
}
