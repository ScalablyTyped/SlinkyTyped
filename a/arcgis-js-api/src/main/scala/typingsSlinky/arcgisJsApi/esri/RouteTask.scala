package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteTask extends Task {
  
  /**
    * Solves the route against the route layer with the route parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html#solve)
    *
    * @param params Route parameters used as input to generate the route.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def solve(params: RouteParameters): js.Promise[RouteResult] = js.native
  def solve(params: RouteParameters, requestOptions: js.Any): js.Promise[RouteResult] = js.native
}
