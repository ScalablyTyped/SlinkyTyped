package typingsSlinky.appleMapkitJs.global.mapkit

import typingsSlinky.appleMapkitJs.mapkit.StylesOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay made up of connected line segments that do not form a closed shape.
  */
@JSGlobal("mapkit.PolylineOverlay")
@js.native
class PolylineOverlay protected ()
  extends typingsSlinky.appleMapkitJs.mapkit.PolylineOverlay {
  /**
    * Creates a polyline overlay with coordinate points and style options.
    *
    * @param points The points in the polyline as an array of Coordinate
    * @param options An object literal of style options with which to initialize
    * the polyline.
    */
  def this(points: js.Array[typingsSlinky.appleMapkitJs.mapkit.Coordinate]) = this()
  def this(points: js.Array[typingsSlinky.appleMapkitJs.mapkit.Coordinate], options: StylesOverlayOptions) = this()
}

