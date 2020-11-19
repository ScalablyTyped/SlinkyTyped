package typingsSlinky.leafletGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BoundsTuple = js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type OpenStreetMapProviderOptions = typingsSlinky.leafletGeosearch.mod.OpenStreetMapProviderOptionsOutputFormat with typingsSlinky.leafletGeosearch.mod.OpenStreetMapProviderOptionsOutputDetails with typingsSlinky.leafletGeosearch.mod.OpenStreetMapProviderOptionsResultLanguage with typingsSlinky.leafletGeosearch.mod.OpenStreetMapProviderOptionsResultLimitation with typingsSlinky.leafletGeosearch.mod.OpenStreetMapProviderOptionsPolygonOutput with typingsSlinky.leafletGeosearch.mod.OpenStreetMapProviderOptionsOther
  
  type PointTuple = js.Tuple2[scala.Double, scala.Double]
}
