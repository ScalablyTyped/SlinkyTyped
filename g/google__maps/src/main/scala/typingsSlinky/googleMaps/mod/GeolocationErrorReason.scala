package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.googleMapsStrings.dailyLimitExceeded
  - typingsSlinky.googleMaps.googleMapsStrings.keyInvalid
  - typingsSlinky.googleMaps.googleMapsStrings.userRateLimitExceeded
  - typingsSlinky.googleMaps.googleMapsStrings.notFound
  - typingsSlinky.googleMaps.googleMapsStrings.parseError
*/
trait GeolocationErrorReason extends js.Object

object GeolocationErrorReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dailyLimitExceeded: typingsSlinky.googleMaps.googleMapsStrings.dailyLimitExceeded = this.cast("dailyLimitExceeded")
  @scala.inline
  def keyInvalid: typingsSlinky.googleMaps.googleMapsStrings.keyInvalid = this.cast("keyInvalid")
  @scala.inline
  def notFound: typingsSlinky.googleMaps.googleMapsStrings.notFound = this.cast("notFound")
  @scala.inline
  def parseError: typingsSlinky.googleMaps.googleMapsStrings.parseError = this.cast("parseError")
  @scala.inline
  def userRateLimitExceeded: typingsSlinky.googleMaps.googleMapsStrings.userRateLimitExceeded = this.cast("userRateLimitExceeded")
}

