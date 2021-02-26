package typingsSlinky.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunQueryResponse extends StObject {
  
  /** A query result. Not set when reporting partial progress. */
  var document: js.UndefOr[Document] = js.native
  
  /**
    * The time at which the document was read. This may be monotonically increasing; in this case, the previous documents in the result stream are guaranteed not to have changed between
    * their `read_time` and this one. If the query returns no results, a response with `read_time` and no `document` will be sent, and this represents the time at which the query was run.
    */
  var readTime: js.UndefOr[String] = js.native
  
  /** The number of results that have been skipped due to an offset between the last response and the current response. */
  var skippedResults: js.UndefOr[Double] = js.native
  
  /**
    * The transaction that was started as part of this request. Can only be set in the first response, and only if RunQueryRequest.new_transaction was set in the request. If set, no other
    * fields will be set in this response.
    */
  var transaction: js.UndefOr[String] = js.native
}
object RunQueryResponse {
  
  @scala.inline
  def apply(): RunQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryResponse]
  }
  
  @scala.inline
  implicit class RunQueryResponseMutableBuilder[Self <: RunQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setSkippedResults(value: Double): Self = StObject.set(x, "skippedResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippedResultsUndefined: Self = StObject.set(x, "skippedResults", js.undefined)
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
