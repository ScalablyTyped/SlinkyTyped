package typingsSlinky.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String indicating the reason for the exit.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.normal
  - typingsSlinky.chromeApps.chromeAppsStrings.abnormal
  - typingsSlinky.chromeApps.chromeAppsStrings.crash
  - typingsSlinky.chromeApps.chromeAppsStrings.kill
*/
trait ExitEventReason extends js.Object

object ExitEventReason {
  @scala.inline
  def abnormal: typingsSlinky.chromeApps.chromeAppsStrings.abnormal = this.cast("abnormal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crash: typingsSlinky.chromeApps.chromeAppsStrings.crash = this.cast("crash")
  @scala.inline
  def kill: typingsSlinky.chromeApps.chromeAppsStrings.kill = this.cast("kill")
  @scala.inline
  def normal: typingsSlinky.chromeApps.chromeAppsStrings.normal = this.cast("normal")
}

