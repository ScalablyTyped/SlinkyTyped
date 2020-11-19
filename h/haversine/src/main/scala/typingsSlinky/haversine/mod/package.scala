package typingsSlinky.haversine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.haversine.mod.CoordinateLongitudeLatitude
    - typingsSlinky.haversine.mod.CoordinateLonLat
    - typingsSlinky.haversine.mod.CoordinateLatLng
    - typingsSlinky.haversine.mod.LatLonTuple
    - typingsSlinky.haversine.mod.GeoJSON
  */
  type Coordinate = typingsSlinky.haversine.mod._Coordinate | typingsSlinky.haversine.mod.LatLonTuple
  
  type LatLonTuple = js.Tuple2[scala.Double, scala.Double]
  
  // The input & output types of haversine() both depend on the Options object.
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.haversine.mod.Coordinate
    - typingsSlinky.haversine.mod.GeoJSON
    - typingsSlinky.haversine.mod.CoordinateLatLng
    - typingsSlinky.haversine.mod.CoordinateLonLat
    - js.Tuple2[scala.Double, scala.Double]
    - typingsSlinky.haversine.mod.CoordinateLongitudeLatitude
  */
  type ParamType[T /* <: js.UndefOr[typingsSlinky.haversine.mod.Options] */] = typingsSlinky.haversine.mod._ParamType[T] | (js.Tuple2[scala.Double, scala.Double]) | typingsSlinky.haversine.mod.LatLonTuple
  
  type Return[T /* <: js.UndefOr[typingsSlinky.haversine.mod.Options] */] = scala.Double | scala.Boolean
}
