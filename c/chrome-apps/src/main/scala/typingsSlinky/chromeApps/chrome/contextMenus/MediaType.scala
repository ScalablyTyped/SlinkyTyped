package typingsSlinky.chromeApps.chrome.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.image
  - typingsSlinky.chromeApps.chromeAppsStrings.video
  - typingsSlinky.chromeApps.chromeAppsStrings.audio
*/
trait MediaType extends js.Object

object MediaType {
  @scala.inline
  def audio: typingsSlinky.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typingsSlinky.chromeApps.chromeAppsStrings.image = this.cast("image")
  @scala.inline
  def video: typingsSlinky.chromeApps.chromeAppsStrings.video = this.cast("video")
}

