package typingsSlinky.firefoxWebextBrowser.browser.browserSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* browserSettings types */
/** How images should be animated in the browser. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.none
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.once
*/
trait ImageAnimationBehavior_ extends js.Object

object ImageAnimationBehavior_ {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.none = this.cast("none")
  @scala.inline
  def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def once: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.once = this.cast("once")
}

