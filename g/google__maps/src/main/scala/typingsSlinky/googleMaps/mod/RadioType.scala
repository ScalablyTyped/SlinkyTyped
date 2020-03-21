package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.googleMapsStrings.lte
  - typingsSlinky.googleMaps.googleMapsStrings.gsm
  - typingsSlinky.googleMaps.googleMapsStrings.cdma
  - typingsSlinky.googleMaps.googleMapsStrings.wcdma
*/
trait RadioType extends js.Object

object RadioType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cdma: typingsSlinky.googleMaps.googleMapsStrings.cdma = this.cast("cdma")
  @scala.inline
  def gsm: typingsSlinky.googleMaps.googleMapsStrings.gsm = this.cast("gsm")
  @scala.inline
  def lte: typingsSlinky.googleMaps.googleMapsStrings.lte = this.cast("lte")
  @scala.inline
  def wcdma: typingsSlinky.googleMaps.googleMapsStrings.wcdma = this.cast("wcdma")
}

