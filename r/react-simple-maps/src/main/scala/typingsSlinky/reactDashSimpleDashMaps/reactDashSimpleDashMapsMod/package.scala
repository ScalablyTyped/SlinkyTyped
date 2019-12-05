package typingsSlinky.reactDashSimpleDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSimpleDashMapsMod {
  import typingsSlinky.d3DashGeo.d3DashGeoMod.GeoProjection

  type Point = js.Tuple2[Double, Double]
  type ProjectionFunction = js.Function3[/* width */ Double, /* height */ Double, /* config */ ProjectionConfig, GeoProjection]
}
