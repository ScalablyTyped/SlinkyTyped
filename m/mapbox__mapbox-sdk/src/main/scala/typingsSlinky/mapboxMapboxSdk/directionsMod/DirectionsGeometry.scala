package typingsSlinky.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.geojson
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline6
*/
trait DirectionsGeometry extends js.Object

object DirectionsGeometry {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def geojson: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.geojson = this.cast("geojson")
  @scala.inline
  def polyline: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline = this.cast("polyline")
  @scala.inline
  def polyline6: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline6 = this.cast("polyline6")
}

