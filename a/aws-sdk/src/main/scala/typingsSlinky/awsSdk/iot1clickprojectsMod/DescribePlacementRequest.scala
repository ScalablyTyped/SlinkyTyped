package typingsSlinky.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlacementRequest extends StObject {
  
  /**
    * The name of the placement within a project.
    */
  var placementName: PlacementName = js.native
  
  /**
    * The project containing the placement to be described.
    */
  var projectName: ProjectName = js.native
}
object DescribePlacementRequest {
  
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): DescribePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlacementRequest]
  }
  
  @scala.inline
  implicit class DescribePlacementRequestMutableBuilder[Self <: DescribePlacementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
