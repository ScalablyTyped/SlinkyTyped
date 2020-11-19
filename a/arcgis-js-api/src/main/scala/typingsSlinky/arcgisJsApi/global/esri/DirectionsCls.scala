package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.DirectionsProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Directions")
@js.native
/**
  * The Directions Widget provides a way to build driving and walking directions using ArcGIS Online and custom Network Analysis Route services. Similar to how the [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) works, this widget generates a route finding a least-cost path between multiple points using a specified network. When searching for an address, the location of the points used to navigate depends on the `locationType` of the [Search properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties). The default value will be `"street"` for any locator source that does not define a `locationType`. The resulting directions are displayed with detailed turn-by-turn instructions.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html)
  */
class DirectionsCls ()
  extends typingsSlinky.arcgisJsApi.esri.Directions {
  def this(properties: DirectionsProperties) = this()
}
