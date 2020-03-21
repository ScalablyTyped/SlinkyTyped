package typingsSlinky.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.unaccessible
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.train
*/
trait DirectionsMode extends js.Object

object DirectionsMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cycling: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling = this.cast("cycling")
  @scala.inline
  def driving: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving = this.cast("driving")
  @scala.inline
  def ferry: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry = this.cast("ferry")
  @scala.inline
  def train: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.train = this.cast("train")
  @scala.inline
  def unaccessible: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.unaccessible = this.cast("unaccessible")
  @scala.inline
  def walking: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking = this.cast("walking")
}

