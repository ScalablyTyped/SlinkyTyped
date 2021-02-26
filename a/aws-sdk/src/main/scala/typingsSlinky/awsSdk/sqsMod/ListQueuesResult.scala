package typingsSlinky.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueuesResult extends StObject {
  
  /**
    * Pagination token to include in the next request. Token value is null if there are no additional results to request, or if you did not set MaxResults in the request.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A list of queue URLs, up to 1,000 entries, or the value of MaxResults that you sent in the request.
    */
  var QueueUrls: js.UndefOr[QueueUrlList] = js.native
}
object ListQueuesResult {
  
  @scala.inline
  def apply(): ListQueuesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesResult]
  }
  
  @scala.inline
  implicit class ListQueuesResultMutableBuilder[Self <: ListQueuesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQueueUrls(value: QueueUrlList): Self = StObject.set(x, "QueueUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUrlsUndefined: Self = StObject.set(x, "QueueUrls", js.undefined)
    
    @scala.inline
    def setQueueUrlsVarargs(value: String*): Self = StObject.set(x, "QueueUrls", js.Array(value :_*))
  }
}
