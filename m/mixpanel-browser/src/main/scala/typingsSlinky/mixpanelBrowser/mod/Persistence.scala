package typingsSlinky.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mixpanelBrowser.mixpanelBrowserStrings.cookie
  - typingsSlinky.mixpanelBrowser.mixpanelBrowserStrings.localStorage
*/
trait Persistence extends js.Object

object Persistence {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cookie: typingsSlinky.mixpanelBrowser.mixpanelBrowserStrings.cookie = this.cast("cookie")
  @scala.inline
  def localStorage: typingsSlinky.mixpanelBrowser.mixpanelBrowserStrings.localStorage = this.cast("localStorage")
}

