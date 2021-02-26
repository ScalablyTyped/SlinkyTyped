package typingsSlinky.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDevicesInPlacementRequest extends StObject {
  
  /**
    * The name of the placement to get the devices from.
    */
  var placementName: PlacementName = js.native
  
  /**
    * The name of the project containing the placement.
    */
  var projectName: ProjectName = js.native
}
object GetDevicesInPlacementRequest {
  
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): GetDevicesInPlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicesInPlacementRequest]
  }
  
  @scala.inline
  implicit class GetDevicesInPlacementRequestMutableBuilder[Self <: GetDevicesInPlacementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
