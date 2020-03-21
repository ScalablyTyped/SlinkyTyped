package typingsSlinky.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * *in_progress*:
  *   The download is currently receiving data from the server.
  * *interrupted*:
  *   An error broke the connection with the file host.
  * *complete*:
  *   The download completed successfully.
  *
  * These string constants will never change, however the set of States may change.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.in_progress
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.interrupted
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.complete
*/
trait State extends js.Object

object State {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.complete = this.cast("complete")
  @scala.inline
  def in_progress: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.in_progress = this.cast("in_progress")
  @scala.inline
  def interrupted: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.interrupted = this.cast("interrupted")
}

