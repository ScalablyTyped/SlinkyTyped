package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplatesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * A structure containing information about the templates in the list.
    */
  var TemplateSummaryList: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.TemplateSummaryList] = js.native
}
object ListTemplatesResponse {
  
  @scala.inline
  def apply(): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListTemplatesResponseMutableBuilder[Self <: ListTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTemplateSummaryList(value: TemplateSummaryList): Self = StObject.set(x, "TemplateSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateSummaryListUndefined: Self = StObject.set(x, "TemplateSummaryList", js.undefined)
    
    @scala.inline
    def setTemplateSummaryListVarargs(value: TemplateSummary*): Self = StObject.set(x, "TemplateSummaryList", js.Array(value :_*))
  }
}
