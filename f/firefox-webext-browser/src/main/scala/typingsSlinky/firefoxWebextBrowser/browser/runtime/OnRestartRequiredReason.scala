package typingsSlinky.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The reason that the event is being dispatched. 'app_update' is used when the restart is needed because the
  * application is updated to a newer version. 'os_update' is used when the restart is needed because the browser/OS
  * is updated to a newer version. 'periodic' is used when the system runs for more than the permitted uptime set in
  * the enterprise policy.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.app_update
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.os_update
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.periodic
*/
trait OnRestartRequiredReason extends js.Object

object OnRestartRequiredReason {
  @scala.inline
  def app_update: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.app_update = this.cast("app_update")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def os_update: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.os_update = this.cast("os_update")
  @scala.inline
  def periodic: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.periodic = this.cast("periodic")
}

