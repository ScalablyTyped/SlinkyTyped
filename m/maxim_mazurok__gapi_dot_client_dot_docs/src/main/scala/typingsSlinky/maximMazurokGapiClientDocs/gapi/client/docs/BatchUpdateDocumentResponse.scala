package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateDocumentResponse extends StObject {
  
  /** The ID of the document to which the updates were applied to. */
  var documentId: js.UndefOr[String] = js.native
  
  /** The reply of the updates. This maps 1:1 with the updates, although replies to some requests may be empty. */
  var replies: js.UndefOr[js.Array[Response]] = js.native
  
  /** The updated write control after applying the request. */
  var writeControl: js.UndefOr[WriteControl] = js.native
}
object BatchUpdateDocumentResponse {
  
  @scala.inline
  def apply(): BatchUpdateDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateDocumentResponse]
  }
  
  @scala.inline
  implicit class BatchUpdateDocumentResponseMutableBuilder[Self <: BatchUpdateDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setReplies(value: js.Array[Response]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: Response*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    @scala.inline
    def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
