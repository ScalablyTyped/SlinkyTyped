package typingsSlinky.reactSimpleMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Point = js.Tuple2[scala.Double, scala.Double]
  type ProjectionFunction = js.Function3[
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    /* config */ typingsSlinky.reactSimpleMaps.mod.ProjectionConfig, 
    typingsSlinky.d3Geo.mod.GeoProjection_
  ]
}
