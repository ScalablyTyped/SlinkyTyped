package typingsSlinky.appleMapkitJs.global.mapkit

import typingsSlinky.appleMapkitJs.mapkit.StylesOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A circular overlay with a configurable radius, centered on a specific
  * geographic coordinate.
  */
@JSGlobal("mapkit.CircleOverlay")
@js.native
class CircleOverlay protected ()
  extends typingsSlinky.appleMapkitJs.mapkit.CircleOverlay {
  /**
    * Creates a circle overlay with a center coordinate, radius, and style options.
    *
    * @param coordinate The coordinate of the circle's center.
    * @param radius The circle's radius, in meters.
    * @param options An object literal of Overlay properties used to initialize
    * the circle.
    */
  def this(coordinate: typingsSlinky.appleMapkitJs.mapkit.Coordinate, radius: Double) = this()
  def this(
    coordinate: typingsSlinky.appleMapkitJs.mapkit.Coordinate,
    radius: Double,
    options: StylesOverlayOptions
  ) = this()
}
