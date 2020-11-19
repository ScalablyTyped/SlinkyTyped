package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosestFacilityTask extends Task {
  
  /**
    * Solves the closest facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html#solve)
    *
    * @param params Defines the parameters of the closest facility analysis.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def solve(params: ClosestFacilityParameters): js.Promise[ClosestFacilitySolveResult] = js.native
  def solve(params: ClosestFacilityParameters, requestOptions: js.Any): js.Promise[ClosestFacilitySolveResult] = js.native
}
