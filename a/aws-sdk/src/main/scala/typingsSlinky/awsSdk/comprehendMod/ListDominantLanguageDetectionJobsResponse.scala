package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDominantLanguageDetectionJobsResponse extends StObject {
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var DominantLanguageDetectionJobPropertiesList: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.DominantLanguageDetectionJobPropertiesList] = js.native
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListDominantLanguageDetectionJobsResponse {
  
  @scala.inline
  def apply(): ListDominantLanguageDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDominantLanguageDetectionJobsResponse]
  }
  
  @scala.inline
  implicit class ListDominantLanguageDetectionJobsResponseMutableBuilder[Self <: ListDominantLanguageDetectionJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDominantLanguageDetectionJobPropertiesList(value: DominantLanguageDetectionJobPropertiesList): Self = StObject.set(x, "DominantLanguageDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantLanguageDetectionJobPropertiesListUndefined: Self = StObject.set(x, "DominantLanguageDetectionJobPropertiesList", js.undefined)
    
    @scala.inline
    def setDominantLanguageDetectionJobPropertiesListVarargs(value: DominantLanguageDetectionJobProperties*): Self = StObject.set(x, "DominantLanguageDetectionJobPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
