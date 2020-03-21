package typingsSlinky.amapJsApiGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete
  - typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data
  - typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.error
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsSlinky.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data = this.cast("no_data")
}

