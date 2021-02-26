package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPiiEntitiesDetectionJobsResponse extends StObject {
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var PiiEntitiesDetectionJobPropertiesList: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.PiiEntitiesDetectionJobPropertiesList] = js.native
}
object ListPiiEntitiesDetectionJobsResponse {
  
  @scala.inline
  def apply(): ListPiiEntitiesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPiiEntitiesDetectionJobsResponse]
  }
  
  @scala.inline
  implicit class ListPiiEntitiesDetectionJobsResponseMutableBuilder[Self <: ListPiiEntitiesDetectionJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPiiEntitiesDetectionJobPropertiesList(value: PiiEntitiesDetectionJobPropertiesList): Self = StObject.set(x, "PiiEntitiesDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPiiEntitiesDetectionJobPropertiesListUndefined: Self = StObject.set(x, "PiiEntitiesDetectionJobPropertiesList", js.undefined)
    
    @scala.inline
    def setPiiEntitiesDetectionJobPropertiesListVarargs(value: PiiEntitiesDetectionJobProperties*): Self = StObject.set(x, "PiiEntitiesDetectionJobPropertiesList", js.Array(value :_*))
  }
}
