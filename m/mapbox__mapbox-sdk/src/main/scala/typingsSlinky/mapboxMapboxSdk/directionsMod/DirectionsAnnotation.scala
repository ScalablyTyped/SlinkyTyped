package typingsSlinky.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.congestion
*/
trait DirectionsAnnotation extends js.Object

object DirectionsAnnotation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def congestion: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.congestion = this.cast("congestion")
  @scala.inline
  def distance: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance = this.cast("distance")
  @scala.inline
  def duration: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration = this.cast("duration")
  @scala.inline
  def speed: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed = this.cast("speed")
}

