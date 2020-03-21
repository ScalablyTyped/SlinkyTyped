package typingsSlinky.chrome.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chrome.chromeStrings.throttled
  - typingsSlinky.chrome.chromeStrings.no_update
  - typingsSlinky.chrome.chromeStrings.update_available
*/
trait RequestUpdateCheckStatus extends js.Object

object RequestUpdateCheckStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def no_update: typingsSlinky.chrome.chromeStrings.no_update = this.cast("no_update")
  @scala.inline
  def throttled: typingsSlinky.chrome.chromeStrings.throttled = this.cast("throttled")
  @scala.inline
  def update_available: typingsSlinky.chrome.chromeStrings.update_available = this.cast("update_available")
}

