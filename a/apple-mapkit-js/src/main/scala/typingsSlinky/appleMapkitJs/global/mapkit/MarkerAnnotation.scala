package typingsSlinky.appleMapkitJs.global.mapkit

import typingsSlinky.appleMapkitJs.mapkit.MarkerAnnotationConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a marker annotation at the coordinate location with provided options.
  */
@JSGlobal("mapkit.MarkerAnnotation")
@js.native
class MarkerAnnotation protected ()
  extends typingsSlinky.appleMapkitJs.mapkit.MarkerAnnotation {
  /**
    * Creates a marker annotation at the coordinate location with provided options.
    *
    * @param coordinate The coordinate at which this annotation should appear.
    * @param options A hash of properties with which to initialize the annotation.
    */
  def this(coordinate: typingsSlinky.appleMapkitJs.mapkit.Coordinate) = this()
  def this(
    coordinate: typingsSlinky.appleMapkitJs.mapkit.Coordinate,
    options: MarkerAnnotationConstructorOptions
  ) = this()
}
