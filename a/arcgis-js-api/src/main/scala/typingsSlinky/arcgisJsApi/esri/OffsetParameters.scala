package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bevelled
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mitered
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rounded
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetParameters
  extends Accessor
     with JSONSupport {
  
  /**
    * The `bevelRatio` is multiplied by the offset distance and the result determines how far a mitered offset intersection can be located before it is beveled. When mitered is specified, the value set for `bevelRatio` is ignored and `10` is used internally. If beveled is specified, `1.1` will be used if no value is set for bevelRatio. The bevelRatio is ignored when `rounded` is specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#bevelRatio)
    */
  var bevelRatio: Double = js.native
  
  /**
    * The array of geometries to be offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#geometries)
    */
  var geometries: js.Array[Geometry_] = js.native
  
  /**
    * Specifies the planar distance for constructing an offset based on the input geometries. If the `offsetDistance` parameter is positive, the constructed offset will be on the right side of the curve. Left side offsets are constructed with negative values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetDistance)
    */
  var offsetDistance: Double = js.native
  
  /**
    * Options that determine how the ends intersect. Set to one of the following options:
    *
    * Possible Value | Description
    * ---------------|-------------
    * bevelled | Squares off the corner after a given ratio distance.
    * mitered | Attempts to allow extended offsets to naturally intersect. If the intersection occurs too far from a corner, the corner will be beveled off at a fixed distance.
    * rounded | Rounds the corner between extended offsets.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetHow)
    */
  var offsetHow: bevelled | mitered | rounded = js.native
  
  /**
    * The offset distance unit. For a list of valid units see [esriSRUnitType constants](http://resources.esri.com/help/9.3/ArcGISDesktop/ArcObjects/esriGeometry/esriSRUnitType.htm) or [esriSRUnit2Type constants](http://resources.esri.com/help/9.3/ArcGISDesktop/ArcObjects/esriGeometry/esriSRUnit2Type.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetUnit)
    */
  var offsetUnit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
}
