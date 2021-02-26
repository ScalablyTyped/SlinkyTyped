package typingsSlinky.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStepAccessibilityClustersResponse extends StObject {
  
  /**
    * A sequence of accessibility suggestions, grouped into clusters. Within the sequence, clusters that belong to the same SuggestionCategory should be adjacent. Within each category,
    * clusters should be ordered by their SuggestionPriority (ERRORs first). The categories should be ordered by their highest priority cluster.
    */
  var clusters: js.UndefOr[js.Array[SuggestionClusterProto]] = js.native
  
  /** A full resource name of the step. For example, projects/my-project/histories/bh.1234567890abcdef/executions/ 1234567890123456789/steps/bs.1234567890abcdef Always presents. */
  var name: js.UndefOr[String] = js.native
}
object ListStepAccessibilityClustersResponse {
  
  @scala.inline
  def apply(): ListStepAccessibilityClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStepAccessibilityClustersResponse]
  }
  
  @scala.inline
  implicit class ListStepAccessibilityClustersResponseMutableBuilder[Self <: ListStepAccessibilityClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: js.Array[SuggestionClusterProto]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: SuggestionClusterProto*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
