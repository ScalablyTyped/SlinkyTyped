package typingsSlinky.mapboxMapboxSdk.mapiRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
*/
trait MapboxProfile extends js.Object

object MapboxProfile {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cycling: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling = this.cast("cycling")
  @scala.inline
  def driving: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving = this.cast("driving")
  @scala.inline
  def walking: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking = this.cast("walking")
}

