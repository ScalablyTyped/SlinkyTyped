package typingsSlinky.firefoxWebextBrowser.browser.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* idle types */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle
*/
trait IdleState extends js.Object

object IdleState {
  @scala.inline
  def active: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idle: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle = this.cast("idle")
}

