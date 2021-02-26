package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`preserve-shape`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.acres
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geodesic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hectares
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.planar
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreasAndLengthsParameters
  extends Accessor
     with JSONSupport {
  
  /**
    * The area unit in which areas of polygons will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#areaUnit)
    */
  var areaUnit: acres | hectares | `square-miles` | `square-kilometers` | `square-meters` | `square-feet` | `square-yards` = js.native
  
  /**
    * Defines the type of calculation for the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#calculationType)
    */
  var calculationType: planar | geodesic | `preserve-shape` = js.native
  
  /**
    * The length unit in which perimeters of polygons will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#lengthUnit)
    */
  var lengthUnit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
  
  /**
    * Polygon geometries for which to compute areas and lengths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#polygons)
    */
  var polygons: js.Array[Polygon] = js.native
}
