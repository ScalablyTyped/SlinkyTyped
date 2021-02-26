package typingsSlinky.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAnalyzedResourcesResponse extends StObject {
  
  /**
    * A list of resources that were analyzed.
    */
  var analyzedResources: AnalyzedResourcesList = js.native
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
}
object ListAnalyzedResourcesResponse {
  
  @scala.inline
  def apply(analyzedResources: AnalyzedResourcesList): ListAnalyzedResourcesResponse = {
    val __obj = js.Dynamic.literal(analyzedResources = analyzedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnalyzedResourcesResponse]
  }
  
  @scala.inline
  implicit class ListAnalyzedResourcesResponseMutableBuilder[Self <: ListAnalyzedResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzedResources(value: AnalyzedResourcesList): Self = StObject.set(x, "analyzedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzedResourcesVarargs(value: AnalyzedResourceSummary*): Self = StObject.set(x, "analyzedResources", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
