package typingsSlinky.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* downloads types */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.uniquify
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.prompt
*/
trait FilenameConflictAction extends js.Object

object FilenameConflictAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def overwrite: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite = this.cast("overwrite")
  @scala.inline
  def prompt: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.prompt = this.cast("prompt")
  @scala.inline
  def uniquify: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.uniquify = this.cast("uniquify")
}

