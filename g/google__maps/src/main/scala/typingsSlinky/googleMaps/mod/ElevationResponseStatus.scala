package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.googleMapsStrings.OK
  - typingsSlinky.googleMaps.googleMapsStrings.INVALID_REQUEST
  - typingsSlinky.googleMaps.googleMapsStrings.OVER_DAILY_LIMIT
  - typingsSlinky.googleMaps.googleMapsStrings.OVER_QUERY_LIMIT
  - typingsSlinky.googleMaps.googleMapsStrings.REQUEST_DENIED
  - typingsSlinky.googleMaps.googleMapsStrings.UNKNOWN_ERROR
*/
trait ElevationResponseStatus extends js.Object

object ElevationResponseStatus {
  @scala.inline
  def INVALID_REQUEST: typingsSlinky.googleMaps.googleMapsStrings.INVALID_REQUEST = this.cast("INVALID_REQUEST")
  @scala.inline
  def OK: typingsSlinky.googleMaps.googleMapsStrings.OK = this.cast("OK")
  @scala.inline
  def OVER_DAILY_LIMIT: typingsSlinky.googleMaps.googleMapsStrings.OVER_DAILY_LIMIT = this.cast("OVER_DAILY_LIMIT")
  @scala.inline
  def OVER_QUERY_LIMIT: typingsSlinky.googleMaps.googleMapsStrings.OVER_QUERY_LIMIT = this.cast("OVER_QUERY_LIMIT")
  @scala.inline
  def REQUEST_DENIED: typingsSlinky.googleMaps.googleMapsStrings.REQUEST_DENIED = this.cast("REQUEST_DENIED")
  @scala.inline
  def UNKNOWN_ERROR: typingsSlinky.googleMaps.googleMapsStrings.UNKNOWN_ERROR = this.cast("UNKNOWN_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

