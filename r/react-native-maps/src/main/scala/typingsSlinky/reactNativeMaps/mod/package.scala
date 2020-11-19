package typingsSlinky.reactNativeMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // =======================================================================
  //  Overlay
  // =======================================================================
  type Coordinate = js.Tuple2[scala.Double, scala.Double]
  
  type KmlMapEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNativeMaps.anon.Markers
  ]
  
  type MapEvent[T] = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    T with typingsSlinky.reactNativeMaps.anon.Coordinate
  ]
}
