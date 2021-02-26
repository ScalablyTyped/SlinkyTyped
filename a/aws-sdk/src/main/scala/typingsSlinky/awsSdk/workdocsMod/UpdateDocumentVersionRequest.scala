package typingsSlinky.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDocumentVersionRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  
  /**
    * The version ID of the document.
    */
  var VersionId: DocumentVersionIdType = js.native
  
  /**
    * The status of the version.
    */
  var VersionStatus: js.UndefOr[DocumentVersionStatus] = js.native
}
object UpdateDocumentVersionRequest {
  
  @scala.inline
  def apply(DocumentId: ResourceIdType, VersionId: DocumentVersionIdType): UpdateDocumentVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateDocumentVersionRequestMutableBuilder[Self <: UpdateDocumentVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: DocumentVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionStatus(value: DocumentVersionStatus): Self = StObject.set(x, "VersionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionStatusUndefined: Self = StObject.set(x, "VersionStatus", js.undefined)
  }
}
