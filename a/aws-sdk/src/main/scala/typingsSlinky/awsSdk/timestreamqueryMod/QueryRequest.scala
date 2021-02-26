package typingsSlinky.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRequest extends StObject {
  
  /**
    *  Unique, case-sensitive string of up to 64 ASCII characters that you specify when you make a Query request. Providing a ClientToken makes the call to Query idempotent, meaning that multiple identical calls have the same effect as one single call.  Your query request will fail in the following cases:    If you submit a request with the same client token outside the 5-minute idepotency window.     If you submit a request with the same client token but a change in other parameters within the 5-minute idempotency window.     After 4 hours, any request with the same client token is treated as a new request. 
    */
  var ClientToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    *  The total number of rows to return in the output. If the total number of rows available is more than the value specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken value in the starting-token argument of a subsequent command. 
    */
  var MaxRows: js.UndefOr[MaxQueryResults] = js.native
  
  /**
    *  A pagination token passed to get a set of results. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    *  The query to be executed by Timestream. 
    */
  var QueryString: typingsSlinky.awsSdk.timestreamqueryMod.QueryString = js.native
}
object QueryRequest {
  
  @scala.inline
  def apply(QueryString: QueryString): QueryRequest = {
    val __obj = js.Dynamic.literal(QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRequest]
  }
  
  @scala.inline
  implicit class QueryRequestMutableBuilder[Self <: QueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientRequestToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setMaxRows(value: MaxQueryResults): Self = StObject.set(x, "MaxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRowsUndefined: Self = StObject.set(x, "MaxRows", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
  }
}
