package typingsSlinky.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitResponse extends StObject {
  
  /** The number of index entries updated during the commit, or zero if none were updated. */
  var indexUpdates: js.UndefOr[Double] = js.native
  
  /** The result of performing the mutations. The i-th mutation result corresponds to the i-th mutation in the request. */
  var mutationResults: js.UndefOr[js.Array[MutationResult]] = js.native
}
object CommitResponse {
  
  @scala.inline
  def apply(): CommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitResponse]
  }
  
  @scala.inline
  implicit class CommitResponseMutableBuilder[Self <: CommitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexUpdates(value: Double): Self = StObject.set(x, "indexUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUpdatesUndefined: Self = StObject.set(x, "indexUpdates", js.undefined)
    
    @scala.inline
    def setMutationResults(value: js.Array[MutationResult]): Self = StObject.set(x, "mutationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutationResultsUndefined: Self = StObject.set(x, "mutationResults", js.undefined)
    
    @scala.inline
    def setMutationResultsVarargs(value: MutationResult*): Self = StObject.set(x, "mutationResults", js.Array(value :_*))
  }
}
