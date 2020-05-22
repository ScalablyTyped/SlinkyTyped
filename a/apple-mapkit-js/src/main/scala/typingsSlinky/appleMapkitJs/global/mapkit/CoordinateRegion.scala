package typingsSlinky.appleMapkitJs.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a map defined by a center coordinate and a span,
  * expressed in degrees of latitude and longitude.
  */
@JSGlobal("mapkit.CoordinateRegion")
@js.native
class CoordinateRegion protected ()
  extends typingsSlinky.appleMapkitJs.mapkit.CoordinateRegion {
  /**
    * Creates A rectangular geographic region centered around a latitude and
    * longitude coordinate.
    *
    * @param center Coordinate that is center point of the region.
    * @param span A CoordinateSpan that represents the amount of map to
    * display. The span also defines the current zoom level used by the map object.
    */
  def this(
    center: typingsSlinky.appleMapkitJs.mapkit.Coordinate,
    span: typingsSlinky.appleMapkitJs.mapkit.CoordinateSpan
  ) = this()
  /**
    * The center point of the region.
    */
  /* CompleteClass */
  override var center: typingsSlinky.appleMapkitJs.mapkit.Coordinate = js.native
  /**
    * The horizontal and vertical span representing the amount of map to display.
    */
  /* CompleteClass */
  override var span: typingsSlinky.appleMapkitJs.mapkit.CoordinateSpan = js.native
  /**
    * Returns a copy of the calling coordinate region.
    */
  /* CompleteClass */
  override def copy(): typingsSlinky.appleMapkitJs.mapkit.CoordinateRegion = js.native
  /**
    * Returns a Boolean value indicating whether two regions are equal.
    */
  /* CompleteClass */
  override def equals(anotherRegion: typingsSlinky.appleMapkitJs.mapkit.CoordinateRegion): Boolean = js.native
  /**
    * Returns the bounding region that corresponds to the calling coordinate region.
    */
  /* CompleteClass */
  override def toBoundingRegion(): typingsSlinky.appleMapkitJs.mapkit.BoundingRegion = js.native
  /**
    * Returns the map rectangle that corresponds to the calling coordinate region.
    */
  /* CompleteClass */
  override def toMapRect(): typingsSlinky.appleMapkitJs.mapkit.MapRect = js.native
}

