package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An overlay made up of connected line segments that do not form a closed shape.
  */
@js.native
trait PolylineOverlay extends Overlay {
  
  /**
    * An array of coordinate points that define the polyline overlay's shape.
    */
  var points: js.Array[Coordinate] = js.native
}
