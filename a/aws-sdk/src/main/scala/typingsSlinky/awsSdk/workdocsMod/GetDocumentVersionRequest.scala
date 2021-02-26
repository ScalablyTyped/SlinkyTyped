package typingsSlinky.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentVersionRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  
  /**
    * A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.native
  
  /**
    * Set this to TRUE to include custom metadata in the response.
    */
  var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.native
  
  /**
    * The version ID of the document.
    */
  var VersionId: DocumentVersionIdType = js.native
}
object GetDocumentVersionRequest {
  
  @scala.inline
  def apply(DocumentId: ResourceIdType, VersionId: DocumentVersionIdType): GetDocumentVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentVersionRequest]
  }
  
  @scala.inline
  implicit class GetDocumentVersionRequestMutableBuilder[Self <: GetDocumentVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: FieldNamesType): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    @scala.inline
    def setIncludeCustomMetadata(value: BooleanType): Self = StObject.set(x, "IncludeCustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCustomMetadataUndefined: Self = StObject.set(x, "IncludeCustomMetadata", js.undefined)
    
    @scala.inline
    def setVersionId(value: DocumentVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
  }
}
