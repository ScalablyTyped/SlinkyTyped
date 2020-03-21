package typingsSlinky.reactNativeMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // =======================================================================
  //  Overlay
  // =======================================================================
  type Coordinate = js.Tuple2[scala.Double, scala.Double]
  type KmlMapEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNativeMaps.AnonMarkers
  ]
  type MapEvent[T] = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    T with typingsSlinky.reactNativeMaps.AnonCoordinate
  ]
}
