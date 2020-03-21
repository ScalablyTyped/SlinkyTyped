package typingsSlinky.iabVpaid.iab.vpaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The vpaid view mode set on init or on resize */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.iabVpaid.iabVpaidStrings.normal
  - typingsSlinky.iabVpaid.iabVpaidStrings.thumbnail
  - typingsSlinky.iabVpaid.iabVpaidStrings.fullscreen
*/
trait ViewMode extends js.Object

object ViewMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullscreen: typingsSlinky.iabVpaid.iabVpaidStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def normal: typingsSlinky.iabVpaid.iabVpaidStrings.normal = this.cast("normal")
  @scala.inline
  def thumbnail: typingsSlinky.iabVpaid.iabVpaidStrings.thumbnail = this.cast("thumbnail")
}

