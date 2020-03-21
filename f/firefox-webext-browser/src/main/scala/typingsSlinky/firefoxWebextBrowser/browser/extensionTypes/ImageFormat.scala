package typingsSlinky.firefoxWebextBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* extensionTypes types */
/** The format of an image. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.png
*/
trait ImageFormat extends js.Object

object ImageFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jpeg: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg = this.cast("jpeg")
  @scala.inline
  def png: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.png = this.cast("png")
}

