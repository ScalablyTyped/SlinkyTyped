package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.googleMapsStrings.OK
  - typingsSlinky.googleMaps.googleMapsStrings.NOT_FOUND
  - typingsSlinky.googleMaps.googleMapsStrings.ZERO_RESULTS
  - typingsSlinky.googleMaps.googleMapsStrings.MAX_ROUTE_LENGTH_EXCEEDED
*/
trait DistanceMatrixResponseElementLevelStatus extends js.Object

object DistanceMatrixResponseElementLevelStatus {
  @scala.inline
  def MAX_ROUTE_LENGTH_EXCEEDED: typingsSlinky.googleMaps.googleMapsStrings.MAX_ROUTE_LENGTH_EXCEEDED = this.cast("MAX_ROUTE_LENGTH_EXCEEDED")
  @scala.inline
  def NOT_FOUND: typingsSlinky.googleMaps.googleMapsStrings.NOT_FOUND = this.cast("NOT_FOUND")
  @scala.inline
  def OK: typingsSlinky.googleMaps.googleMapsStrings.OK = this.cast("OK")
  @scala.inline
  def ZERO_RESULTS: typingsSlinky.googleMaps.googleMapsStrings.ZERO_RESULTS = this.cast("ZERO_RESULTS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

