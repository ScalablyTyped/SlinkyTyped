package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListIndexResponse extends StObject {
  
  /**
    * The objects and indexed values attached to the index.
    */
  var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object BatchListIndexResponse {
  
  @scala.inline
  def apply(): BatchListIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListIndexResponse]
  }
  
  @scala.inline
  implicit class BatchListIndexResponseMutableBuilder[Self <: BatchListIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexAttachments(value: IndexAttachmentList): Self = StObject.set(x, "IndexAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexAttachmentsUndefined: Self = StObject.set(x, "IndexAttachments", js.undefined)
    
    @scala.inline
    def setIndexAttachmentsVarargs(value: IndexAttachment*): Self = StObject.set(x, "IndexAttachments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
