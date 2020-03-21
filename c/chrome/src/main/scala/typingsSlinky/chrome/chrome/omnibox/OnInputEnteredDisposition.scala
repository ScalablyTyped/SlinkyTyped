package typingsSlinky.chrome.chrome.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chrome.chromeStrings.currentTab
  - typingsSlinky.chrome.chromeStrings.newForegroundTab
  - typingsSlinky.chrome.chromeStrings.newBackgroundTab
*/
trait OnInputEnteredDisposition extends js.Object

object OnInputEnteredDisposition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currentTab: typingsSlinky.chrome.chromeStrings.currentTab = this.cast("currentTab")
  @scala.inline
  def newBackgroundTab: typingsSlinky.chrome.chromeStrings.newBackgroundTab = this.cast("newBackgroundTab")
  @scala.inline
  def newForegroundTab: typingsSlinky.chrome.chromeStrings.newForegroundTab = this.cast("newForegroundTab")
}

