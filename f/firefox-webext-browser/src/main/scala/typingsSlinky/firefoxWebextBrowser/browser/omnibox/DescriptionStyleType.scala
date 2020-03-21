package typingsSlinky.firefoxWebextBrowser.browser.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* omnibox types */
/** The style type. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match`
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim
*/
trait DescriptionStyleType extends js.Object

object DescriptionStyleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dim: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim = this.cast("dim")
  @scala.inline
  def `match`: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match` = this.cast("match")
  @scala.inline
  def url: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = this.cast("url")
}

