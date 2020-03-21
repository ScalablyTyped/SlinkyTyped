package typingsSlinky.chromeApps.chrome.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.active
  - typingsSlinky.chromeApps.chromeAppsStrings.idle
  - typingsSlinky.chromeApps.chromeAppsStrings.locked
*/
trait IdleState extends js.Object

object IdleState {
  @scala.inline
  def active: typingsSlinky.chromeApps.chromeAppsStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idle: typingsSlinky.chromeApps.chromeAppsStrings.idle = this.cast("idle")
  @scala.inline
  def locked: typingsSlinky.chromeApps.chromeAppsStrings.locked = this.cast("locked")
}

