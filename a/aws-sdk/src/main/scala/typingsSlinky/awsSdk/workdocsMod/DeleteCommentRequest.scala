package typingsSlinky.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCommentRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The ID of the comment.
    */
  var CommentId: CommentIdType = js.native
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  
  /**
    * The ID of the document version.
    */
  var VersionId: DocumentVersionIdType = js.native
}
object DeleteCommentRequest {
  
  @scala.inline
  def apply(CommentId: CommentIdType, DocumentId: ResourceIdType, VersionId: DocumentVersionIdType): DeleteCommentRequest = {
    val __obj = js.Dynamic.literal(CommentId = CommentId.asInstanceOf[js.Any], DocumentId = DocumentId.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCommentRequest]
  }
  
  @scala.inline
  implicit class DeleteCommentRequestMutableBuilder[Self <: DeleteCommentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setCommentId(value: CommentIdType): Self = StObject.set(x, "CommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: DocumentVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
  }
}
