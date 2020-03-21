package typingsSlinky.chromeApps.chrome.clipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Image type */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.png
  - typingsSlinky.chromeApps.chromeAppsStrings.jpeg
*/
trait ImageType extends js.Object

object ImageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jpeg: typingsSlinky.chromeApps.chromeAppsStrings.jpeg = this.cast("jpeg")
  @scala.inline
  def png: typingsSlinky.chromeApps.chromeAppsStrings.png = this.cast("png")
}

