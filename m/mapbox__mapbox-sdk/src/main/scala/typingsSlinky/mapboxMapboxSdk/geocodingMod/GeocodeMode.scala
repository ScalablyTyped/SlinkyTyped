package typingsSlinky.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.mapboxDotplaces
  - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.`mapboxDotplaces-permanent`
*/
trait GeocodeMode extends js.Object

object GeocodeMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mapboxDotplaces: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.mapboxDotplaces = this.cast("mapbox.places")
  @scala.inline
  def `mapboxDotplaces-permanent`: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.`mapboxDotplaces-permanent` = this.cast("mapbox.places-permanent")
}

