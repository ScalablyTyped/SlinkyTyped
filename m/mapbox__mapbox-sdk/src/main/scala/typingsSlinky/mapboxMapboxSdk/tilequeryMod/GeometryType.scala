package typingsSlinky.mapboxMapboxSdk.tilequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.point
*/
trait GeometryType extends js.Object

object GeometryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linestring: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring = this.cast("linestring")
  @scala.inline
  def point: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.point = this.cast("point")
  @scala.inline
  def polygon: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon = this.cast("polygon")
}

